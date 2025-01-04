package com.amoelcodigo.genericclass.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {
    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.objetos = new ArrayList<>();
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }

    public void add(T objeto) {
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        }else {
            throw new RuntimeException("No hay mas espacio");
        }
    }
}
