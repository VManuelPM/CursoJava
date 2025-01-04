package com.amoelcodigo.poointerfaces.imprenta.models;
abstract public class Hoja {

    protected String contenido;

    abstract public String imprimir();

    public Hoja(String contenido) {
        this.contenido = contenido;
    }
}
