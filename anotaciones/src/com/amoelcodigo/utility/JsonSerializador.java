package com.amoelcodigo.utility;

import com.amoelcodigo.JsonAtributo;
import com.amoelcodigo.utility.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object) {
        if (Objects.isNull(object)) {
            throw new JsonSerializadorException("El objeto a serializar no puede ser null");
        }

        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException("Error al serializar, no se puede inicializar el objeto "
                        + e.getMessage());
                    }
                });
    }

    public static String convertirJson(Object object) {

        if (Objects.isNull(object)) {
            throw new JsonSerializadorException("El objeto a serializar no puede ser null");
        }

        inicializarObjeto(object);

        //Usando Java reflection
        Field[] atributos = object.getClass().getDeclaredFields();

        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    String getNombre = f.getAnnotation(JsonAtributo.class).nombre();
                    f.setAccessible(true);
                    String nombre = getNombre.equals("")
                            ? f.getName()
                            : getNombre;
                    try {
                        Object valor = f.get(object);
                        if (f.getAnnotation(JsonAtributo.class).capitalizar() &&
                                valor instanceof String) {
                            String nuevoValor = (String) valor;
                            /*nuevoValor = String.valueOf(nuevoValor.charAt(0)).toUpperCase()
                                    + nuevoValor.substring(1).toLowerCase();*/
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0,1).toUpperCase() +
                                            palabra.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));
                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a JSON: " + e.getMessage());
                    }
                })
                .reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}
