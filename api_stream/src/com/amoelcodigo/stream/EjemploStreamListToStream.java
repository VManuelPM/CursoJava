package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(new Usuario("Victor", "Manuel"));
        usuarioList.add(new Usuario("Pato", "Guzman"));
        usuarioList.add(new Usuario("Paco", "Gonzalez"));
        usuarioList.add(new Usuario("Pepa", "Gutierrez"));
        usuarioList.add(new Usuario("Pepe", "Mena"));
        usuarioList.add(new Usuario("Bruce", "Lee"));
        usuarioList.add(new Usuario("Bruce", "Wills"));
        usuarioList.add(new Usuario("Juan", "Perez"));

        Stream<String> nombres = usuarioList
                .stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(usuario -> {
                    if(usuario.contains("bruce".toUpperCase())){
                        return Stream.of(usuario);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());

    }
}
