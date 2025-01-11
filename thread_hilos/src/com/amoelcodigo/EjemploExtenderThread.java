package com.amoelcodigo;

import com.amoelcodigo.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jhon Doe");
        Thread hilo2 = new NombreThread("Victor Manuel");
        hilo.start();
        hilo2.start();
        //Thread.sleep(100);
        Thread hilo3 = new NombreThread("Alicia");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}