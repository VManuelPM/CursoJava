package com.amoelcodigo.poointerfaces.imprenta.ejercicio.models;

import com.amoelcodigo.poointerfaces.imprenta.ejercicio.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion;

    private String autor;

    private String titulo;

    private String editorial;

    public Libro(Double precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitutlo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }
}
