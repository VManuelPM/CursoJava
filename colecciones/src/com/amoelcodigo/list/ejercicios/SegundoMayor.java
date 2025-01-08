package com.amoelcodigo.list.ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Encuentra el segundo mayor número en una lista sin usar funciones integradas como sorted.
 * numeros = [4, 7, 1, 9, 2]
 * Segundo mayor: 7
 */
public class SegundoMayor {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);
        numeros.add(2);

        if (numeros.size() < 2) {
            System.out.println("La lista debe contener al menos dos elementos.");
            return;
        }

        int numeroMayor = Integer.MIN_VALUE;
        int segundoNumeroMayor = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > numeroMayor) {
                segundoNumeroMayor = numeroMayor;
                numeroMayor = numeros.get(i);
            } else if (numeros.get(i) > segundoNumeroMayor && numeros.get(i) != numeroMayor) {
                segundoNumeroMayor = numeros.get(i);
            }
        }

        if (segundoNumeroMayor == Integer.MIN_VALUE) {
            System.out.println("No hay un segundo mayor número distinto.");
        } else {
            System.out.println("segundoNumeroMayor = " + segundoNumeroMayor);
        }
    }
}