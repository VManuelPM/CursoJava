package com.amoelcodigo.ejemploexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainExecutorFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea....");
        };

        Future<?> resultado = executorService.submit(tarea);
        executorService.shutdown();
        System.out.println("Continuando con la ejecución del método main");
        //El get bloquea el thread actual
        System.out.println(resultado.get(2, TimeUnit.SECONDS));
        System.out.println(resultado.isDone());

    }
}
