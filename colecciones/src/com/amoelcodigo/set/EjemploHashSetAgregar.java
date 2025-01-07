package com.amoelcodigo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        //Un set es no ordenado
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Uno");
        hashSet.add("Dos");
        hashSet.add("Tres");
        hashSet.add("Cuatro");
        hashSet.add("Cinco");
        System.out.println("hashSet = " + hashSet);
        boolean b = hashSet.add("Tres");
        System.out.println("Permite elementos duplicados? = " + b);
        System.out.println("hashSet = " + hashSet);
        
    }
}
