package com.amoelcodigo.patrones.decorator;

import com.amoelcodigo.patrones.decorator.decorator.MayusculaDecorador;
import com.amoelcodigo.patrones.decorator.decorator.ReemplazarEspaciosDecorador;
import com.amoelcodigo.patrones.decorator.decorator.ReversaDecorador;
import com.amoelcodigo.patrones.decorator.decorator.SubrayadoDecorador;

public class EjemploDecorador {

    public static void main(String[] args) {
        Formateable texto = new Texto("Hello World");
        MayusculaDecorador mayusculaDecorador = new MayusculaDecorador(texto);
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculaDecorador);
        ReemplazarEspaciosDecorador reemplazarEspaciosDecorador = new ReemplazarEspaciosDecorador(reversaDecorador);
        SubrayadoDecorador subrayadoDecorador = new SubrayadoDecorador(reemplazarEspaciosDecorador);

        System.out.println(subrayadoDecorador.darFormato());
    }

}
