package com.amoelcodigo.map.ejercicios;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementa una agenda telefónica donde los nombres sean las claves y los números de teléfono
 *  sean los valores. Agrega, elimina, y actualiza contactos.
 */
public class AgendaTelefonica {
    public static void main(String[] args) {
        Map<String, Integer> agenda = new HashMap<>();
        agenda.put("Armando", 12345);
        agenda.put("Alicia", 123456);
        agenda.put("Zako", 23445);

    }
}
