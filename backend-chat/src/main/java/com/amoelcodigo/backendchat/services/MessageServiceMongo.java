package com.amoelcodigo.backendchat.services;

import com.amoelcodigo.backendchat.models.Message;
import com.amoelcodigo.backendchat.repositories.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class MessageServiceMongo implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public List<Message> findAll() {
        return messageRepository.findFirst10ByOrderByDateAsc();
    }

    @Override
    public void save(Message message) {
        messageRepository.save(message);
    }
}
