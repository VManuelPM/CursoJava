package com.amoelcodigo.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainExecutor {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea....");
        };

        executorService.submit(tarea);
        executorService.shutdown();
        try {
            System.out.println("Continuando con la ejecución del método main 1");
            executorService.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("Continuando con la ejecución del método main 2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
