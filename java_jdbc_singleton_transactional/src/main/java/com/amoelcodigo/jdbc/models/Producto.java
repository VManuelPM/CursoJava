package com.amoelcodigo.jdbc.models;

import java.util.Date;

public class Producto {

    private Long Id;
    private String nombre;
    private Integer precio;
    private Date fechaRegistro;
    private Categoria categoria;
    private String sku;


    public Producto() {
    }

    public Producto(Long id, String nombre, Integer precio, Date fechaRegistro, Categoria categoria, String sku) {
        Id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
        this.categoria = categoria;
        this.sku = sku;
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return
                Id +
                " | " + nombre + " | " + precio +
                " | " + fechaRegistro
                + " | " + categoria.getNombre()
                + " | " + sku;
    }
}
