package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        Stream<Usuario> nombres =
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
                        .filter(u -> u.getNombre().equals("Pepe"))
                        .peek(u -> System.out.println("peek = " + u));

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> {
            System.out.println("u = " + u);
        });
    }
}