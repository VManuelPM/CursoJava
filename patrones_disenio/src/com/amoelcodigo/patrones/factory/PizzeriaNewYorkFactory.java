package com.amoelcodigo.patrones.factory;

import com.amoelcodigo.patrones.factory.producto.PizzaNewYorkItaliana;
import com.amoelcodigo.patrones.factory.producto.PizzaNewYorkPepperoni;
import com.amoelcodigo.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
