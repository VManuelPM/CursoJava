package com.amoelcodigo.poointerfaces.imprenta.ejercicio.models;

import com.amoelcodigo.poointerfaces.imprenta.ejercicio.interfaces.IProducto;

public class Producto implements IProducto {

    private Double precio;

    public Producto(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double getPrecioVenta() {
        return precio * 0.9;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }
}
