package com.amoelcodigo;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();

        System.out.println("automovil.fabricante = " + automovil.fabricante);
        System.out.println("automovil.color = " + automovil.color);
        System.out.println("automovil.modelo = " + automovil.modelo);
        System.out.println("automovil.cilindrada = " + automovil.cilindrada);
        System.out.println("Color " + Color.AZUL);
        System.out.println("Color " + Color.AZUL.getColor());
    }
}
