package com.amoelcodigo.stream;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        Stream<Integer> nombres = Stream.of(
                5, 10, 20, 30
        ).distinct();

        // El a significa el anterior y el b significa el actual
        Integer resultadoFinal = nombres.reduce(0, (a, b) -> a + b);
       // Integer resultadoFinal = nombres.reduce(0, Integer::sum);
        System.out.println(resultadoFinal);

    }
}