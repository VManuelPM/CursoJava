package com.amoelcodigo.list.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Dada una lista con números repetidos, elimina los duplicados manteniendo el orden original.
 */
public class EliminarDuplicados {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numeros.length ; i++) {
            list.add(numeros[i]);
        }

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer number : list) {
            if (!seen.contains(number)) {
                seen.add(number);
                result.add(number);
            }
        }

        System.out.println("Original list: " + list);
        System.out.println("List without duplicates: " + result);
    }
}
