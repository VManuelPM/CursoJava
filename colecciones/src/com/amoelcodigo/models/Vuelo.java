package com.amoelcodigo.models;

import java.util.Date;
import java.util.Objects;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLLegada;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaLLegada, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLLegada = fechaLLegada;
        this.pasajeros = pasajeros;
    }

    public Vuelo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaLLegada=" + fechaLLegada +
                ", pasajeros=" + pasajeros ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return pasajeros == vuelo.pasajeros && Objects.equals(nombre, vuelo.nombre) && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fechaLLegada, vuelo.fechaLLegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, origen, destino, fechaLLegada, pasajeros);
    }
}
