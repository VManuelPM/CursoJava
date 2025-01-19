package com.amoelcodigo.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        //RangeClosed incluye el segundo elemento del rango, recordar que el range es excluyente del último elemento
        IntStream numeros = IntStream.range(
                5, 20
        ).peek(System.out::println);

        // El a significa el anterior y el b significa el actual
       // Integer resultadoFinal = numeros.reduce(0, Integer::sum);
       //  Integer resultadoFinal = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println(stats);

    }
}