package com.amoelcodigo.patrones.decorator.decorator;

import com.amoelcodigo.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
