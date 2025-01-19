package com.amoelcodigo.ejercicios;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 *Expresión Lambda que cuenta la cantidad de veces que se repiten las palabras de una frase
 *  y devuelva la mas repetida
 */
public class LambdaContar {
    public static void main(String[] args) {
        Function<String, String> frase = f -> {
            String[] fSplit = f.split(" ");
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word : fSplit) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            String mostRepeated = null;
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostRepeated = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            return mostRepeated;
        };

        System.out.println("frase.apply() = " + frase.apply("El hombre mas generoso del mundo es el hombre que da"));
    }
}
