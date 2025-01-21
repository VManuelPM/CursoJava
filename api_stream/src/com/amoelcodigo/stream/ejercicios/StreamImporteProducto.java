package com.amoelcodigo.stream.ejercicios;

import com.amoelcodigo.stream.models.Producto;

import java.util.ArrayList;
import java.util.List;

/*
El siguiente requerimiento es para una lista de productos List<Producto>,
  de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.

La clase Producto debe tener el atributo precio del tipo double y cantidad int,
entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
 */
public class StreamImporteProducto {

    public static void main(String[] args) {

        List<Producto> productoList = new ArrayList<>();
        productoList.add(new Producto(100.0, 10));
        productoList.add(new Producto(345.0, 1));
        productoList.add(new Producto(323.3, 3));
        productoList.add(new Producto(100.1, 4));
        productoList.add(new Producto(566.7, 19));

        double granTotal = productoList.stream().mapToDouble(p -> p.getPrecio() * p.getCantidad()).sum();
        System.out.println("granTotal = " + granTotal);
    }
}
