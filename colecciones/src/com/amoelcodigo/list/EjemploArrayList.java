package com.amoelcodigo.list;

import com.amoelcodigo.models.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        //Todos los elementos que se agreguen tiene que implementar la interfaz Comparable si son TreeSet

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Manuel", 10));
        alumnos.add(new Alumno("Wilson", 4));
        alumnos.add(new Alumno("Alicia", 3));
        alumnos.add(new Alumno("Martha", 5));
        alumnos.add(new Alumno("Lilians", 2));
        alumnos.add(new Alumno("Paco", 7));
        alumnos.add(new Alumno("Zeus", 1));
        alumnos.add(new Alumno("Zeus", 1));

        //Cuando es add lo que hacemos es desplazar hacia la derecha el valor de esa posicion
        alumnos.add(2, new Alumno("Juan", 4));

        //Cuando es Add lo que hace es reemplazar el valor en esa posición
        alumnos.set(7, new Alumno("Gabriel", 6));

        System.out.println("---- Size -----");
        System.out.println("alumnos.size() = " + alumnos.size());

        System.out.println("---- is Empty?----");
        System.out.println("alumnos.isEmpty() = " + alumnos.isEmpty());

        System.out.println("alumnos = " + alumnos);

        System.out.println("---- Remove -----");
        alumnos.remove(new Alumno("Zeus", 1));
        //alumnos.remove(0);
        System.out.println("alumnos = " + alumnos);

        System.out.println("---- contains (Existe?) -----");
        System.out.println("alumnos.contains? = " + alumnos.contains(new Alumno("Zeus", 1)));

        System.out.println("---- Pasar una lista a un array -----");
        Object a[] = alumnos.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("alumno = " + a[i]);
        }


     }
}
