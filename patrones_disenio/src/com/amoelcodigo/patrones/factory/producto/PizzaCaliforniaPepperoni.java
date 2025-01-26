package com.amoelcodigo.patrones.factory.producto;

import com.amoelcodigo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California de Pepperoni";
        masa = "Masa delgada";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Pepperoni");
        ingredientes.add("Aceitunas");
        ingredientes.add("Pimientos");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min. a 55ª");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
