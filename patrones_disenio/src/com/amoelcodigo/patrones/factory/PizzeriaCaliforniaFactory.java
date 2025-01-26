package com.amoelcodigo.patrones.factory;

import com.amoelcodigo.patrones.factory.producto.PizzaCaliforniaPepperoni;
import com.amoelcodigo.patrones.factory.producto.PizzaCaliforniaQueso;
import com.amoelcodigo.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
                case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
