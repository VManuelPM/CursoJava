package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        Stream<String> nombres =  Stream.of("Pato Guzman",
                        "Paco Gonzalez",
                        "Paco Gonzalez",
                        "Paco Gonzalez",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Juan Perez",
                        "Ana Lopez",
                        "Luis Ramirez",
                        "Pepe Pepon"
                ).distinct();

        nombres.forEach(System.out::println);

    }
}