package com.amoelcodigo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resultado = f1.apply("Manuel");
        System.out.println("resultado = " + resultado);

        Function<String, String> f2 = String :: toUpperCase;
        System.out.println("f2.apply() = " + f2.apply("manu"));

        BiFunction<String, String, String> f3 = (a,b) ->
            a.toUpperCase().concat(b.toUpperCase());

        String r2 = f3.apply("victor", "manuel");
        System.out.println("r2 = " + r2);
        
        //BiFunction<String, String, Integer> f4 = (a,b) -> a.compareTo(b);
        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println("f4 = " + f4.apply("manuel", "manuel"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println("f5 = " + f5.apply("manuel", "manuel"));

    }
}
