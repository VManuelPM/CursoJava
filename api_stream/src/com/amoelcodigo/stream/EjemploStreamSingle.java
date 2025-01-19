package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamSingle {
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
                        .filter(u -> u.getNombre().equals("Pepex"))
                        .peek(u -> System.out.println("peek = " + u));

        Optional<Usuario> usuario = nombres.findFirst();
        //  System.out.println("usuario = " + usuario.orElse(new Usuario("john", "doe")));
        //  System.out.println("usuario = " + usuario.orElseGet(() -> new Usuario("john", "doe")).getNombre());
        if (usuario.isPresent()) {
            System.out.println("usuario = " + usuario.get());
        }else{
            System.out.println("No se encontro el usuario");
        }
    }
}