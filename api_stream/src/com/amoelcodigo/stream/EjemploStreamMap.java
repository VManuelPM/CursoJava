package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        //Peek es un operador intermedio para ver como van quedando los datos

        Stream<Usuario> nombres =
                Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .peek(u -> System.out.println("peek = " + u))
                        .map(usuario -> {
                           String nombre =  usuario.getNombre().toLowerCase();
                           usuario.setNombre(nombre);
                           return usuario;
                        });
        List<Usuario> lista = nombres.collect(Collectors.toList());
        
        lista.forEach(u -> {
            System.out.println("u = " + u);
        });
    }
}
