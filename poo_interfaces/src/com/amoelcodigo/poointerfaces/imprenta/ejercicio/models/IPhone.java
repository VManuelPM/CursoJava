package com.amoelcodigo.poointerfaces.imprenta.ejercicio.models;

public class IPhone extends Electronico{

    private String modelo;
    private String color;

    public IPhone(Double precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }
}
