package com.amoelcodigo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
     /*   Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres.forEach(System.out::println);

        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println); */

       /* Stream<String> nombres = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepe")
                .add("Pepe")
                .build();
        */

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Pepe");
        lista.add("Paco");
        lista.add("Pepa");
        Stream<String> nombres = lista.stream();
        nombres.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}
