package com.amoelcodigo.poointerfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: " );
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experencias: \n");

        for(String exp: this.experiencias) {
            sb.append("-").append(exp).append("\n");
        }
        return sb.toString();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<String> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<String> experiencias) {
        this.experiencias = experiencias;
    }
}
