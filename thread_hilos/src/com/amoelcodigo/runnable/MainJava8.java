package com.amoelcodigo.runnable;

public class MainJava8 {

    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        Thread v1 = new Thread(viaje, "Japón");
        Thread v2 = new Thread(viaje, "Corea");
        Thread v3 = new Thread(viaje, "China");
        Thread v4 = new Thread(viaje, "Tailandia");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        //Thread.sleep(1000);
        System.out.println("Continuando con la ejecución del método main: " + main.getName());


    }
}
