package com.amoelcodigo.animals;

public class Tigre extends Felino{

    protected String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "Tigre come";
    }

    @Override
    String dormir() {
        return "Tigre duerme";
    }

    @Override
    String correr() {
        return "Tigre corre";
    }

    @Override
    String comunicarse() {
        return "Tigre grita";
    }
}
