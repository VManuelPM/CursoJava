package com.amoelcodigo.runnable;

public class Main {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Japón")).start();
        new Thread(new ViajeTarea("Corea")).start();
        new Thread(new ViajeTarea("China")).start();
        new Thread(new ViajeTarea("Tailandia")).start();
    }
}
