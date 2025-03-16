package com.amoelcodigo.backendchat.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
@Getter
@Setter
public class Message {
    @Id
    private String id;
    private String text;
    private Long date;
    private String username;
    private String type;
    private String color;
}
