package com.amoelcodigo.datetime.ejemplos.ejercicio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalcularEdad {

    public static void main(String[] args) {
        String fechaIngresada = "1997/04/17";
        LocalDate fechaIParse = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Usted tiene " + Period.between(fechaIParse, fechaActual).getYears() + " Años");
    }
}
