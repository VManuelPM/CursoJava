package com.amoelcodigo;

import com.amoelcodigo.models.Computador;
import com.amoelcodigo.repository.ComputadorRepositorio;
import com.amoelcodigo.repository.Repositorio;

import java.util.Optional;

public class MetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador defecto = new Computador("Manzana", "Verde");
        Computador pc = repositorio.filtrar("Asus roge").orElse(defecto);
        System.out.println("pc = " + pc);

        pc = repositorio.filtrar("Asus").orElseGet(() -> defecto);
        System.out.println("pc = " + pc);
    }

}
