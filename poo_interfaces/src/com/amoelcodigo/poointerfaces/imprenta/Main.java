package com.amoelcodigo.poointerfaces.imprenta;

import com.amoelcodigo.poointerfaces.imprenta.models.Curriculum;
import com.amoelcodigo.poointerfaces.imprenta.models.Genero;
import com.amoelcodigo.poointerfaces.imprenta.models.Hoja;
import com.amoelcodigo.poointerfaces.imprenta.models.Imprimible;
import com.amoelcodigo.poointerfaces.imprenta.models.Informe;
import com.amoelcodigo.poointerfaces.imprenta.models.Libro;
import com.amoelcodigo.poointerfaces.imprenta.models.Pagina;
import com.amoelcodigo.poointerfaces.imprenta.models.Persona;

public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Resumen Laboral", new Persona("Manuel", "Moreno"),"Ingeniería de Sistemas");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Angular")
        .addExperiencia("Spring");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseño: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Compositer"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe =  new Informe("Estudio de microservicios \n",
                new Persona("Manuel", "Moreno"), "James Blunt");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {});

    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}