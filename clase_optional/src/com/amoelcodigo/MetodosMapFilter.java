package com.amoelcodigo;

import com.amoelcodigo.models.Computador;
import com.amoelcodigo.models.Fabricante;
import com.amoelcodigo.models.Procesador;
import com.amoelcodigo.repository.ComputadorRepositorio;
import com.amoelcodigo.repository.Repositorio;

public class MetodosMapFilter {

    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        String f = repositorio.filtrar("Asuss")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println("f = " + f);
    }

}
