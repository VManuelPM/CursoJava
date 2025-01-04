package com.amoelcodigo.genericclass;

import com.amoelcodigo.genericclass.models.Animal;
import com.amoelcodigo.genericclass.models.Camion;

public class Main {

    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        transporteCaballos.forEach(a -> System.out.println(a.getNombre() + " " + a.getTipo()));
    }
}
