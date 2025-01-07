package com.amoelcodigo.map;

import javax.management.ObjectName;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapObject {
    public static void main(String[] args) {
        Map<String, Object>  persona = new HashMap<>();
        //HashMap está basado en el algoritmo hash

        System.out.println("----Añade valor al map ---- ");
        persona.put(null, "1234");
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        System.out.println("----Obtiene un valor por llave ---- ");
        System.out.println("persona.get(\"nombre\") = " + persona.get("nombre"));
        System.out.println("persona.get(\"apellido\") = " + persona.get("apellido"));

        System.out.println("----Obtiene un objeto(Map) dentro de un map ----");
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La Playa");
        System.out.println("pais = " + pais);
        System.out.println("ciudad = " + ciudad);
        System.out.println("barrio = " + barrio);

        System.out.println("----Elimina un valor de un map ---- ");
        System.out.println("persona.remove(\"apellidoPaterno\") = " + persona.remove("apellidoPaterno"));
        System.out.println("persona = " + persona);

        System.out.println("----Contains Key ----");
        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("Existe la llave? = " + b2);

        System.out.println("---- Contains Value ----");
        b2 = persona.containsValue("30");
        System.out.println("Existe por valor = " + b2);

        System.out.println("---- Values -----");
        Collection<Object> valores = persona.values();
        valores.forEach(System.out::println);

        System.out.println("---- Keys -----");
        Set<String> keys = persona.keySet();
        keys.forEach(System.out::println);

        System.out.println("---- Iterar llaves y valores con EntrySet----");
        for (Map.Entry<String, Object> par: persona.entrySet()) {
            System.out.println("par = " + par.getKey() + " y su valor es " + par.getValue());
        }

        System.out.println("----- KeySet -----");
        for (String key: persona.keySet()){
            Object value = persona.get(key);
            if (value instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) value;
                System.out.println("El país es = " + direccionMap.get("pais"));
            }else {
            System.out.println(key + " => " + value);
            }
        }

        System.out.println("---- Size -----");
        System.out.println(persona.size());

        System.out.println("---- Contiene elementos ----");
        System.out.println("persona = " + !persona.isEmpty());

        System.out.println("---Reemplazar Elementos----");
        persona.replace("nombre", "Manuel");
        System.out.println("persona = " + persona);
    }
}
