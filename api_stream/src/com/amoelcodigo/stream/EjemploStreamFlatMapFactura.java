package com.amoelcodigo.stream;

import com.amoelcodigo.stream.models.Factura;
import com.amoelcodigo.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Victor", "Manuel");
        Usuario usuario2 = new Usuario("Pepe", "Guzman");

        usuario1.addFacturas(new Factura("TV"));
        usuario1.addFacturas(new Factura("Muebles"));

        usuario2.addFacturas(new Factura("Laptop"));
        usuario2.addFacturas(new Factura("Smartphone"));

        List<Usuario> usuarioList = Arrays.asList(usuario1, usuario2);

      /*  for(Usuario u: usuarioList) {
            for (Factura f: u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        } */

        usuarioList.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> {
                    System.out.println(f.getDescripcion().concat(" ")
                            .concat("Comprado por ").concat(f.getUsuario().getNombre()));
                });

    }
}
