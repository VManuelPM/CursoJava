package com.amoelcodigo.patrones.decorator.decorator;

import com.amoelcodigo.patrones.decorator.Formateable;

public abstract class TextoDecorador implements Formateable {
    protected Formateable texto;
    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
