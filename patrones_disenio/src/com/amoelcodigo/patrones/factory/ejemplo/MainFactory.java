package com.amoelcodigo.patrones.factory.ejemplo;

import com.amoelcodigo.patrones.factory.PizzaProducto;
import com.amoelcodigo.patrones.factory.PizzeriaCaliforniaFactory;
import com.amoelcodigo.patrones.factory.PizzeriaNewYorkFactory;
import com.amoelcodigo.patrones.factory.PizzeriaZonaAbstractFactory;

public class MainFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory califoria = new PizzeriaCaliforniaFactory();

        PizzaProducto pizzaProducto = califoria.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizzaProducto.getNombre());

        pizzaProducto = califoria.ordenarPizza("pepperoni");
        System.out.println("Martha ordena la pizza " + pizzaProducto.getNombre());

        pizzaProducto = califoria.ordenarPizza("vegetariana");
        System.out.println("Alicia ordena la pizza " + pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("pepperoni");
        System.out.println("Manuel ordena la pizza " + pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("vegetariana");
        System.out.println("Emily ordena la pizza " + pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("italiana");
        System.out.println("Nicolai ordena la pizza " + pizzaProducto.getNombre());
    }
}
