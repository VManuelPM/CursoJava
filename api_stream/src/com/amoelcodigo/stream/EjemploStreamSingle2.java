package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamSingle2 {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        Usuario usuario =
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
                        .filter(u -> u.getId().equals(6))
                        .findFirst()
                        .orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println("usuario = " + usuario);
    }
}