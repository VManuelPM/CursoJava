package com.amoelcodigo.elements;

abstract public class FormElement {

    protected String valor;
    protected String nombre;

    public FormElement() {
    }

    public FormElement(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();

}
