package com.amoelcodigo.archivos.ejemplos.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoServiceBuffered {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            //La bandera true, lo que hace es sobreescribir el archivo si existe, de lo contrario lo crea y escribe
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);

            buffer.append("Hola que tal amigos")
                    .append("Todo bien? Aqui escribiendo un archivo.")
                    .append("\n")
                    .append("Hasta luego");
            buffer.close();
            System.out.println("El archivo se ha creado con éxito!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try(PrintWriter print = new PrintWriter(new FileWriter(archivo, true))) {
            print.append("Hola que tal amigos \n");
                    print.append("Todo bien? Aqui escribiendo un archivo. \n");
                    print.append("Hasta luego \n");
            print.close();
            System.out.println("El archivo se ha creado con éxito!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {

            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");

            while (s.hasNext()) {
                sb.append(s.next()).append("\n");
            }
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
