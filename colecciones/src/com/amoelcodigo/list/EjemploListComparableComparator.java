package com.amoelcodigo.list;

import com.amoelcodigo.models.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploListComparableComparator {
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

        //Ordenar la lista (Por defecto sort ordena de forma ascendete)
        //Collections.sort(alumnos, (a,b) -> a.getNota().compareTo(b.getNota()));
        alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed());

        System.out.println("alumnos = " + alumnos);

        alumnos.forEach(System.out::println);

     }
}
