package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamEmpty {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        long nombres =
                Stream.of("Pato Guzman",
                                "Paco Gonzalez",
                                "Pepa Gutierrez",
                                "Pepe Mena",
                                "",
                                "",
                                "Luis Ramirez",
                                "Pepe Pepon"
                        )
                        .filter(n -> n.isEmpty())
                        .peek(u -> System.out.println("peek = " + u))
                        .count();

        System.out.println("Vacios = " + nombres);

    }
}