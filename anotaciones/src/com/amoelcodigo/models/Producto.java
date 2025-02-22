package com.amoelcodigo.models;

import com.amoelcodigo.JsonAtributo;
import com.amoelcodigo.utility.Init;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {

    @JsonAtributo()
    private String nombre;
    @JsonAtributo
    private Long precio;
    private LocalDate fecha;

    @Init
    private void init(){
        this.nombre = Arrays.stream(nombre.split(" "))
                .map(palabra -> palabra.substring(0,1).toUpperCase() +
                        palabra.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
}
