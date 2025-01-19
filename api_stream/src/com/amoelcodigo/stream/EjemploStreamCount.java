package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamCount {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        long count =
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
                        .count();

        System.out.println("usuario = " + count);
    }
}