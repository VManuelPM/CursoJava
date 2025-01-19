package com.amoelcodigo.stream;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        Stream<String> nombres = Stream.of("Pato Guzman",
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

        // El a significa el anterior y el b significa el actual
        String resultadoFinal = nombres.reduce("resultadoFinal =", (a, b) -> a + "," + b);
        System.out.println(resultadoFinal);

    }
}