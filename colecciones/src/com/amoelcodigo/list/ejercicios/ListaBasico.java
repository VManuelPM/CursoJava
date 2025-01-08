package com.amoelcodigo.list.ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Enunciado:
 * Realiza las siguientes operaciones en una lista:
 *
 * Agrega un número al final.
 * Inserta un número en una posición específica.
 * Elimina un número específico.
 * Ejemplo de entrada:
 *
 * Lista inicial: [1, 2, 3, 4, 5]
 * Agregar: 6
 * Insertar en posición 2: 99
 * Eliminar: 3
 */
public class ListaBasico {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <  6; i++) {
            list.add(i);
        }
        System.out.println("list original = " + list);
        list.add(2, 99);
        System.out.println("list con nuevo elemento = " + list);
        list.remove(3);
        System.out.println("list removiendo numero 3= " + list);
    }
}
