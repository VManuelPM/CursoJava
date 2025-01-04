package com.amoelcodigo.poointerfaces.imprenta.ejercicio;

import com.amoelcodigo.poointerfaces.imprenta.ejercicio.interfaces.IProducto;
import com.amoelcodigo.poointerfaces.imprenta.ejercicio.models.IPhone;
import com.amoelcodigo.poointerfaces.imprenta.ejercicio.models.Producto;

public class Main {

    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];

        productos[0] = new IPhone(20000.0, "apple", "iphone 16", "Blue spacial");
        productos[1] = new Producto(3000.0);
    }
}
