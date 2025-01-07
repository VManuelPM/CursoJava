package com.amoelcodigo.set;

import com.amoelcodigo.models.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        //Todos los elementos que se agreguen tiene que implementar la interfaz Comparable si son TreeSet

        Set<Alumno> alumnos = new TreeSet<>((a,b) -> {
            return a.getNombre().compareTo(b.getNombre());
        });

        alumnos.add(new Alumno("Manuel", 10));
        alumnos.add(new Alumno("Wilson", 4));
        alumnos.add(new Alumno("Alicia", 3));
        alumnos.add(new Alumno("Martha", 5));
        alumnos.add(new Alumno("Lilians", 2));
        alumnos.add(new Alumno("Paco", 7));
        alumnos.add(new Alumno("Zeus", 1));
        alumnos.add(new Alumno("Lucas", 1));

        System.out.println("alumnos = " + alumnos);
     }
}
