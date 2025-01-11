package com.amoelcodigo.runnable;

//Con implements es más desacoplado y es mejor porque podemos extender de otras clases
public class ViajeTarea implements Runnable{
    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + nombre);
            try {
                Thread.sleep( (long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finalmente me voy de viaje a " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
