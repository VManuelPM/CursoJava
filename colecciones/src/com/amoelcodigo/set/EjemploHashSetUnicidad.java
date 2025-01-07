package com.amoelcodigo.set;

import com.amoelcodigo.models.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        //Todos los elementos que se agreguen tiene que implementar la interfaz Comparable si son TreeSet

        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno("Manuel", 10));
        alumnos.add(new Alumno("Wilson", 4));
        alumnos.add(new Alumno("Alicia", 3));
        alumnos.add(new Alumno("Martha", 5));
        alumnos.add(new Alumno("Lilians", 2));
        alumnos.add(new Alumno("Paco", 7));
        alumnos.add(new Alumno("Zeus", 1));
        alumnos.add(new Alumno("Zeus", 1));

        System.out.println("alumnos = " + alumnos);

        System.out.println("----Iterando usando un forEach----");
        for(Alumno a : alumnos) {
            System.out.println("a = " + a);
        }

        System.out.println("----Iterando usando While y Iterator----");
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            Alumno a = iterator.next();
            System.out.println("a.getNombre() = " + a.getNombre());
        }

        System.out.println("----Iterando usando Expresiones Lambda----");
        alumnos.forEach(alumno -> {
            System.out.println("alumno = " + alumno);
        });

     }
}
