package com.amoelcodigo.backendchat.services;

import com.amoelcodigo.backendchat.models.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();
    void save(Message message);
}
