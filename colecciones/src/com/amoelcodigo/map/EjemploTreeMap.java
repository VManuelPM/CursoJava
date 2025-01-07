package com.amoelcodigo.map;

import javax.management.ObjectName;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EjemploTreeMap {

    public static void main(String[] args) {

        //TreeMap ordena por defecto por las llaves, con TreeMap no pueden existir objetos nulos
        Map<String, Object>  persona = new TreeMap<>();

        System.out.println("----Añade valor al map ---- ");
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

    }
}
