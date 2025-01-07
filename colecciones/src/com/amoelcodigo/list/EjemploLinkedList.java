package com.amoelcodigo.list;

import com.amoelcodigo.models.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        //Todos los elementos que se agreguen tiene que implementar la interfaz Comparable si son TreeSet

        LinkedList<Alumno> alumnosLinkedList = new LinkedList<>();

        alumnosLinkedList.add(new Alumno("Manuel", 10));
        alumnosLinkedList.add(new Alumno("Wilson", 4));
        alumnosLinkedList.add(new Alumno("Alicia", 3));
        alumnosLinkedList.add(new Alumno("Martha", 5));
        alumnosLinkedList.add(new Alumno("Lilians", 2));
        alumnosLinkedList.add(new Alumno("Paco", 7));
        alumnosLinkedList.add(new Alumno("Zeus", 1));
        alumnosLinkedList.add(new Alumno("Zeus", 1));

        System.out.println("---- Size -----");
        System.out.println("alumnos.size() = " + alumnosLinkedList.size());

        alumnosLinkedList.addFirst(new Alumno("Gabriel", 6));
        alumnosLinkedList.addLast(new Alumno("Juan", 4));

        System.out.println("alumnosLinkedList = " + alumnosLinkedList);
        System.out.println("alumnos.size() = " + alumnosLinkedList.size());

        System.out.println("---- Get First ----");
        System.out.println("alumnosLinkedList.getFirst() = " + alumnosLinkedList.getFirst());

        System.out.println("---- Get Last ----");
        System.out.println("alumnosLinkedList.getLast() = " + alumnosLinkedList.getLast());

        System.out.println("---- By Index ----");
        System.out.println("alumnosLinkedList.get(2) = " + alumnosLinkedList.get(2));

        //Equivalente a get First solamente que no lanza excepción si el elemento no existe, retorna null en caso de no encontrar
        System.out.println("----peek First -----");
        System.out.println("alumnosLinkedList.peekLast() = " + alumnosLinkedList.peekLast());

        System.out.println("---- Remove ----");
        System.out.println("alumnosLinkedList.removeLast() = " + alumnosLinkedList.removeLast());
        //System.out.println("alumnosLinkedList = " + alumnosLinkedList.pop());
        //System.out.println("alumnosLinkedList.poll() = " + alumnosLinkedList.poll());

        Alumno a = new Alumno("Ryo", 10);
        alumnosLinkedList.addLast(a);

        System.out.println("---- Get index of element ----");
        System.out.println("alumnosLinkedList.indexOf() = " + alumnosLinkedList.indexOf(a));

        ListIterator<Alumno> li = alumnosLinkedList.listIterator();

        System.out.println("---------------");
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println("----Iterar hacia atrás");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }

        }
     }

