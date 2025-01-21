package com.amoelcodigo;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {
       
        String nombre = "Manuel";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        nombre = null;

        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println("opt.isPresent() = " + opt.isPresent());
        System.out.println("opt.isEmpty() = " + opt.isEmpty());


    }

}