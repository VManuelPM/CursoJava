package com.amoelcodigo;

import com.amoelcodigo.models.Computador;
import com.amoelcodigo.repository.ComputadorRepositorio;
import com.amoelcodigo.repository.Repositorio;

import java.util.Optional;

public class MetodosOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc = repositorio.filtrar("Asus rog").orElseThrow(() -> new IllegalStateException("No se encuentra"));
        System.out.println("pc = " + pc);

        String archivo = "Documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println("extension = " + extension);

    }

}
