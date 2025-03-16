package com.amoelcodigo.backendchat.controllers;

import com.amoelcodigo.backendchat.models.Message;
import com.amoelcodigo.backendchat.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Random;

@Controller
@AllArgsConstructor
public class ChatController {

    private final String[] colors = {"red", "green", "blue", "yellow", "magenta", "cyan", "purple"};
    private final MessageService service;
    private final SimpMessagingTemplate webSocket;

    @MessageMapping("/message")
    @SendTo("/chat/message")
    public Message receiveMessage(Message message) {
        message.setDate(new Date().getTime());
        if (message.getType().equals("NEW_USER")) {
            message.setColor(this.colors[new Random().nextInt(colors.length)]);
            message.setText("Nuevo usuario");
        } else {
            service.save(message);
        }
        return message;
    }

    @MessageMapping("/writing")
    @SendTo("/chat/writing")
    public String isWriting(String username) {
        return username.concat(" esta escribiendo ...");
    }

    @MessageMapping("/history")
    public void getHistory(String clientId) {
        webSocket.convertAndSend(
                "/chat/history/".concat(clientId),
                service.findAll()
        );

    }
}
