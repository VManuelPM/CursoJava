package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        //El FlatMap por cada elemento devuelve un Stream, luego los aplana en un solo Stream
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
                        .flatMap(u -> {
                            if(u.getNombre().equalsIgnoreCase("Pepe")){
                                return Stream.of(u);
                            }
                            return Stream.empty();
                        })
                      ;

        nombres.forEach(System.out::println);

    }
}