package com.amoelcodigo.stream.ejercicios;

import java.util.stream.IntStream;

public class StreamSuma {
    public static void main(String[] args) {
        IntStream elements = IntStream.rangeClosed(0, 100).flatMap(e ->{
            if((e%10!=0)){
                return IntStream.of(e);
            }
            return IntStream.empty();
        });

        Double elementD = elements.asDoubleStream()
                .map(e -> e/2)
                .reduce(0, (a,b) -> a + b);

        System.out.println("Total = " + elementD);
    }
}
