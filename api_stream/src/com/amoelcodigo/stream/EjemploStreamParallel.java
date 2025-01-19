package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {

        //parallel Stream se usa cuando tenemos una gran cantidad de elementos que procesar en el flujo

        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(new Usuario("Victor", "Manuel"));
        usuarioList.add(new Usuario("Pato", "Guzman"));
        usuarioList.add(new Usuario("Paco", "Gonzalez"));
        usuarioList.add(new Usuario("Pepa", "Gutierrez"));
        usuarioList.add(new Usuario("Pepe", "Mena"));
        usuarioList.add(new Usuario("Bruce", "Lee"));
        usuarioList.add(new Usuario("Bruce", "Wills"));
        usuarioList.add(new Usuario("Juan", "Perez"));

        long t1 = System.currentTimeMillis();
        String resultado = usuarioList
                .parallelStream()
                .map(u -> u.toString().toUpperCase())
                .peek(h -> {
                    System.out.println(
                            "Nombre Thread: " + Thread.currentThread().getName()
                            + " - " + h
                    );
                })
                .flatMap(usuario -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(usuario.contains("bruce".toUpperCase())){
                        return Stream.of(usuario);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total -> " + (t2-t1) );
        System.out.println(resultado);

    }
}
