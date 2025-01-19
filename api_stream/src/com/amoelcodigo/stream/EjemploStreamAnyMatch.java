package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamAnyMatch {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        boolean existe =
                Stream.of("Pato Guzman",
                                "Paco Gonzalez",
                                "Pepa Gutierrez",
                                "Pepe Mena",
                                "Juan Perez",
                                "Ana Lopez",
                                "Luis Ramirez",
                                "Pepe Pepon"
                        )
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .peek(System.out::println)
                        .anyMatch(u -> u.getId().equals(2));

        System.out.println("usuario = " + existe);
    }
}