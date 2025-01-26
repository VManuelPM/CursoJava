package com.amoelcodigo.archivos.ejemplos;

import com.amoelcodigo.archivos.ejemplos.service.ArchivoServiceBuffered;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "/Users/vmpedraza/Desktop/Cursos/Java/manejo_archivos/archivo/java.txt";
        ArchivoServiceBuffered service = new ArchivoServiceBuffered();
        //System.out.println(service.leerArchivo(nombreArchivo));

        System.out.println(service.leerArchivo2(nombreArchivo));
    }
}
