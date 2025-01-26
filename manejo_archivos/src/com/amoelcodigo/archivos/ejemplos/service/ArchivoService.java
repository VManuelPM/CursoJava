package com.amoelcodigo.archivos.ejemplos.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.append("Hola que tal amigos")
                    .append("Todo bien? Aqui escribiendo un archivo.")
                    .append("\n")
                    .append("Hasta luego");
            escritor.close();
            System.out.println("El archivo se ha creado con éxito!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
