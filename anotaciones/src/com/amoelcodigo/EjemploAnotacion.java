package com.amoelcodigo;

import com.amoelcodigo.models.Producto;
import com.amoelcodigo.utility.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de centro de RoBlE");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}