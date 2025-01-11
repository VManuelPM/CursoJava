package com.amoelcodigo;

import com.amoelcodigo.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("hola", "que tal!")).start();
        new Thread(new ImprimirFrases("Quién eres ", "tú?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "gracias amigo!"));
        h3.start();
        Thread.sleep(100);
        System.out.println("h3.getState() = " + h3.getState());
    }

    //Con syncrhonized las frases se imprimen con orden logico
    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.println(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
