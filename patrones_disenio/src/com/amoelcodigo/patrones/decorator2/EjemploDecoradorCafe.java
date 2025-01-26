package com.amoelcodigo.patrones.decorator2;

import com.amoelcodigo.patrones.decorator2.decorator.ConChocolateDecorador;
import com.amoelcodigo.patrones.decorator2.decorator.ConCremaDecorador;
import com.amoelcodigo.patrones.decorator2.decorator.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCremaDecorador = new ConCremaDecorador(cafe);
        ConLecheDecorador conLecheDecorador = new ConLecheDecorador(conCremaDecorador);
        ConChocolateDecorador conChocolateDecorador = new ConChocolateDecorador(conLecheDecorador);
        System.out.println("El precio del cafe Mocha es = " + conChocolateDecorador.getPrecioBase());
        System.out.println("Los ingredientes: " + conChocolateDecorador.getIngredientes());
    }
}
