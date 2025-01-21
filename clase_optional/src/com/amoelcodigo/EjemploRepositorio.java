package com.amoelcodigo;

import com.amoelcodigo.models.Computador;
import com.amoelcodigo.repository.ComputadorRepositorio;
import com.amoelcodigo.repository.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        /*repositorio.filtrar("Asus rog").isPresent();*/

        Optional<Computador> pc = repositorio.filtrar("Asus rog");
        if(pc.isPresent()) {
            System.out.println(pc.get().getNombre());
        }else{
            System.out.println("No se encuentra");
        }
    }

}
