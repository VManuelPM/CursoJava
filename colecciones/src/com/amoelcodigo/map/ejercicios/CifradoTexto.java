package com.amoelcodigo.map.ejercicios;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementa un programa que use un mapa para cifrar un texto. Cada carácter tiene un equivalente único definido en el mapa.
 * Ejemplo
 *  {"a": "1", "b": "2", "c": "3", "d": "4}
 * entrada ->"abc"
 * Salida -> "123"
 */
public class CifradoTexto {
    public static void main(String[] args) {
        Map<String, String> mapaCifrado = new HashMap<>();
        mapaCifrado.put("a", "1");
        mapaCifrado.put("b", "2");
        mapaCifrado.put("c", "3");
        mapaCifrado.put("d", "4");

        String entrada1 = "abc";
        String entrada2 = "bdc";
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < entrada1.length() ; i++) {
            resultado.append(mapaCifrado.get(String.valueOf(entrada1.charAt(i))));
        }

        System.out.println("entrada: " + entrada1  + "resultado = " + resultado);
    }
}
