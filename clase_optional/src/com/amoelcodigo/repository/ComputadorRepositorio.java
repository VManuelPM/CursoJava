package com.amoelcodigo.repository;

import com.amoelcodigo.models.Computador;
import com.amoelcodigo.models.Fabricante;
import com.amoelcodigo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;
    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus Rog", "Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);

        Procesador proc2 = new Procesador("Ryzen 9 5900HX", new Fabricante("AMD"));
        Computador hp = new Computador("HP Pavilion", "Gaming 15");
        hp.setProcesador(proc2);
        dataSource.add(hp);

        Procesador proc3 = new Procesador("M1 Pro", new Fabricante("Apple"));
        Computador macbook = new Computador("MacBook Pro", "16-inch");
        macbook.setProcesador(proc3);
        dataSource.add(macbook);

    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
      /*  for (Computador c : dataSource) {
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
        return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase())).findFirst();
    }
}
