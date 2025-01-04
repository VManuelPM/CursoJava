package com.amoelcodigo.poointerfaces.imprenta.ejercicio.models;

import com.amoelcodigo.poointerfaces.imprenta.ejercicio.interfaces.IElectronico;

public class Electronico extends Producto implements IElectronico {

    private String fabricante;

    public Electronico(Double precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
