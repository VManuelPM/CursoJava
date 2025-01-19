package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos
        Stream<Usuario> nombres =
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
                ;

        nombres.forEach(System.out::println);


    }
}