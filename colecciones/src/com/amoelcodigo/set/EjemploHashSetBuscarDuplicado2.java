package com.amoelcodigo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces) {
            if(!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println(unicos.size()  + " elementos Unicos" + unicos);
        System.out.println(duplicados.size() + " duplicados = " + duplicados);
    }
}
