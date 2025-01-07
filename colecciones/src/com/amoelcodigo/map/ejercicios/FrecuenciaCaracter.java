package com.amoelcodigo.map.ejercicios;

import java.util.HashMap;
import java.util.Map;

/*
Escribe un programa que calcule la frecuencia de cada carácter en una cadena y lo almacene en un mapa.
 */
public class FrecuenciaCaracter {
    public static void main(String[] args) {
        String cadena = "hola como estas";

        // Mapa para almacenar la frecuencia de cada carácter
        Map<Character, Integer> countMap = new HashMap<>();

        // Recorrer la cadena carácter por carácter
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            // Si el carácter ya está en el mapa, incrementar su contador
            if (countMap.containsKey(letra)) {
                countMap.put(letra, countMap.get(letra) + 1);
            } else {
                countMap.put(letra, 1);
            }
        }

        // Imprimir el mapa resultante
        System.out.println("countMap = " + countMap);
    }
}