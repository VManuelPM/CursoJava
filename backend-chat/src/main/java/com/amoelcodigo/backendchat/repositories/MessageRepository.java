package com.amoelcodigo.backendchat.repositories;

import com.amoelcodigo.backendchat.models.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findFirst10ByOrderByDateAsc();
}
