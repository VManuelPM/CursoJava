package com.amoelcodigo.ejercicios;

import java.util.function.Function;

//Expresion Lambda que elimine espacios
public class LamdaEspacios {
    public static void main(String[] args) {

        Function<String, String> cadena = c -> c.replaceAll(" ", "");

        System.out.println("cadena = " + cadena.apply("Anita lava la tina"));

    }
}
