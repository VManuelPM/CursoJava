package com.amoelcodigo.patrones.observer.ejemplos;

import com.amoelcodigo.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, objeto) -> {
            System.out.println("John: " + observable);
        });

        google.addObserver((observable, objeto) -> {
            System.out.println("Manuel: " + observable);
        });

        google.addObserver((observable, objeto) -> {
            System.out.println("Alicia: " + ((Corporacion)observable).getNombre() +
                    " nuevo Precio $"
                    + ((Corporacion)observable).getNombre());
        });

        google.modificaPrecio(2000);
    }
}
