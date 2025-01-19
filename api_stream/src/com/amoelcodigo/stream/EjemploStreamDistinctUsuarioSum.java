package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        IntStream largoNombres =
                Stream.of("Pato Guzman",
                                "Paco Gonzalez",
                                "Paco Gonzalez",
                                "Paco Gonzalez",
                                "Pepa Gutierrez",
                                "Pepe Mena",
                                "Juan Perez",
                                "Ana Lopez",
                                "Luis Ramirez",
                                "Pepe Pepon"
                        )
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .distinct()
                        .mapToInt( u -> u.toString().length())
                        .peek(System.out::println);
                ;

      //  largoNombres.forEach(System.out::println);
        IntSummaryStatistics statistics = largoNombres.summaryStatistics();
        System.out.println("statistics.getSum() = " + statistics.getSum());
        System.out.println("statistics.getAverage() = " + statistics.getAverage());


    }
}