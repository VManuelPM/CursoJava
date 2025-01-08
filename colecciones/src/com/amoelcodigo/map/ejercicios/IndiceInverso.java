package com.amoelcodigo.map.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dado un texto, crea un mapa que relacione cada palabra con las posiciones en las que aparece (índices).
 * texto = "el gato come pescado y el perro ladra"
 * resultado -> {"el": [0, 5], "gato": [1], "come": [2], "pescado": [3], "y": [4], "perro": [6], "ladra": [7]}
 */
public class IndiceInverso {
    public static void main(String[] args) {
        String texto = "el gato come pescado y el perro ladra";
        String[] textoSplitted = texto.split(" ");
        Map<String, List<Integer>> resultadoMap = new HashMap<>();

        for (int i = 0; i < textoSplitted.length; i++) {
            String key = textoSplitted[i];
            resultadoMap.computeIfAbsent(key, k -> new ArrayList<>()).add(i);
        }

        System.out.println("resultadoMap = " + resultadoMap);
    }
}