package com.amoelcodigo.runnable;

import com.amoelcodigo.EjemploSincronizacionThread;

public class ImprimirFrases implements Runnable{

    String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        EjemploSincronizacionThread.imprimirFrases(this.frase1, this.frase2);
    }
}
