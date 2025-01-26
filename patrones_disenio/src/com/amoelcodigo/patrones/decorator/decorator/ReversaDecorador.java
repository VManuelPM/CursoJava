package com.amoelcodigo.patrones.decorator.decorator;

import com.amoelcodigo.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador {

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
