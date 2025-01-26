package com.amoelcodigo.patrones.factory.producto;

import com.amoelcodigo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {


    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California de Queso";
        masa = "Masa de la pieda delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Queso Cheddar");
        ingredientes.add("Queso Parmesano");
        ingredientes.add("Queso Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min. a 100ª");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando  la pizza en pequeños triangulos");
    }
}
