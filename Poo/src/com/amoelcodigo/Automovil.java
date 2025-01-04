package com.amoelcodigo;

public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    protected String anioFabricacion;

    public Automovil(){
        System.out.println("automovil.fabricante = " + this.fabricante);
        System.out.println("automovil.color = " + this.color);
        System.out.println("automovil.modelo = " + this.modelo);
        System.out.println("automovil.cilindrada = " + this.cilindrada);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
