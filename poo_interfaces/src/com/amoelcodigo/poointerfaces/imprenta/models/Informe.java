package com.amoelcodigo.poointerfaces.imprenta.models;

public class Informe extends Hoja implements Imprimible{

    private Persona autor;
    private String revisor;

    public Informe(String contenido, Persona autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor
                + "\nRevisado por: " + revisor
                + "\n" + this.contenido;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
}
