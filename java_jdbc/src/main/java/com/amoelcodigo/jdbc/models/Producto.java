package com.amoelcodigo.jdbc.models;

import java.util.Date;

public class Producto {

    private Long Id;
    private String nombre;
    private Integer precio;
    private Date fechaRegistro;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(Long id, String nombre, Integer precio, Date fechaRegistro) {
        Id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return
                Id +
                " | " + nombre + " | " + precio +
                " | " + fechaRegistro
                + "|" + categoria.getNombre();
    }
}
