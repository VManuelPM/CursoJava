package com.amoelcodigo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();

        for (String pez: peces) {
            if(!unicos.add(pez)) {
                System.out.println("Elemento duplicado = " + pez);
            }
        }

        System.out.println(unicos.size()  + "elementos duplicados " + unicos);
    }
}
