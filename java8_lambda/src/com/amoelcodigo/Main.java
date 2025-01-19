package com.amoelcodigo;

import com.amoelcodigo.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(fecha);
        };

        consumer.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre,edad) -> {
            System.out.println(nombre + " tiene " + edad  + " años");
        };
        consumidorBi.accept("Pepe", 20);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola Mundo");

        List<String> nombres = Arrays.asList("Andrés", "Manuel", "Martha");
        nombres.forEach(consumer2);

        Supplier<Usuario> creaUsuario = () -> new Usuario();
        Usuario usuario = creaUsuario.get();
        
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
          persona.setName(nombre);
        };

        asignarNombre.accept(usuario, "Manuek");
        System.out.println("usuario = " + usuario.getName());

        Supplier<String> supplier = () -> {
            return "Hola Mundo supplier";
        };

        System.out.println(supplier.get());

    }
}