package com.amoelcodigo.map.ejercicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Escribe un programa que cuente cuántas veces aparece cada palabra en una lista de palabras
 *  y almacene el resultado en un mapa.
 */
public class ContadorPalabras {
    public static void main(String[] args) {
        List<String> palabrasList = new ArrayList<>();
        palabrasList.add("Gato");
        palabrasList.add("Perro");
        palabrasList.add("Gato");
        palabrasList.add("Perro");
        palabrasList.add("Pájaro");
        palabrasList.add("Gato");
        palabrasList.add("Ratón");
        palabrasList.add("Perro");
        palabrasList.add("Pájaro");

        Map<String, Integer> contadorPalabras = new TreeMap<>();
        palabrasList.forEach(palabra -> {
            if (contadorPalabras.containsKey(palabra)) {
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        });

        for(Map.Entry<String, Integer> entry : contadorPalabras.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
