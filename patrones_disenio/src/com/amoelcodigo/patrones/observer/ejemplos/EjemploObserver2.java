package com.amoelcodigo.patrones.observer.ejemplos;

import com.amoelcodigo.patrones.observer.UsurioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsurioRepositorio usurioRepositorio = new UsurioRepositorio();
        usurioRepositorio.addObserver((o, u) -> System.out.println("Enviando un email al usuario " + u));
        usurioRepositorio.addObserver((o, u) -> System.out.println("Enviando un email al administrador "));
        usurioRepositorio.addObserver((o, u) -> System.out.println("Guardando info del usuario " + u + " en los logs"));
        usurioRepositorio.crearUsuario("Manuel");
    }
}
