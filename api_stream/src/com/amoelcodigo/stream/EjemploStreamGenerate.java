package com.amoelcodigo.stream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamGenerate {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);

        //Generate Genera de manera infinta o segun el limite
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return contador.incrementAndGet();
                })
                .limit(10)
                .forEach(System.out::println);
    }
}
