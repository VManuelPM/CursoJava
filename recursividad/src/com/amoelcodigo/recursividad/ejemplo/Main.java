package com.amoelcodigo.recursividad.ejemplo;

import com.amoelcodigo.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700W");
        Componente placaMadre = new Componente("Asus B450");
        Componente cpu = new Componente("AMD Ryzen 7 3700x");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8gb");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32gb");
        Componente ssd = new Componente("Kingston 1TB");

        cpu.addComponente(ventilador)
                .addComponente(disipador);

        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);

        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);

        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        //metodoRecursivo(pc, 0);
        metodoRecursivoStream(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }


    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.tieneHijos()) {
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }


    public static Stream<Componente> metodoRecursivoStream(Componente c, int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoStream(hijo, nivel+1)));
    }


}
