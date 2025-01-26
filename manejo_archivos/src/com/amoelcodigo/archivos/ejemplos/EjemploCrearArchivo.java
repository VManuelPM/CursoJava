package com.amoelcodigo.archivos.ejemplos;

import com.amoelcodigo.archivos.ejemplos.service.ArchivoServiceBuffered;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "/Users/vmpedraza/Desktop/Cursos/Java/manejo_archivos/archivo/java.txt";
        /*ArchivoService archivoService = new ArchivoService();
        archivoService.crearArchivo(nombreArchivo); */
        ArchivoServiceBuffered archivoServiceBuffered = new ArchivoServiceBuffered();
        archivoServiceBuffered.crearArchivo2(nombreArchivo);

    }
}
