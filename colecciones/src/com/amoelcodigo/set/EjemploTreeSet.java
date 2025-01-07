package com.amoelcodigo.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {
        //Los TresSet tienen un costo en rendimiento por el ordenado
        //Los set no adminten duplicados
        Set<String> ts = new TreeSet<>( (a, b) -> {
            //Ordenar de forma descendente
            return b.compareTo(a);
        });

        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");

        System.out.println("ts = " + ts);
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);

        System.out.println("numeros = " + numeros);
    }
}
