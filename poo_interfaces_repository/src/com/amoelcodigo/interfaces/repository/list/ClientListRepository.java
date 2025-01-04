package com.amoelcodigo.interfaces.repository.list;

import com.amoelcodigo.interfaces.models.Cliente;
import com.amoelcodigo.interfaces.repository.AbstractListRepository;
import com.amoelcodigo.interfaces.repository.Direction;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Cliente> {

    @Override
    public void edit(Cliente cliente) {
        Cliente c = findById(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> findAll(String field, Direction direction) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
                int resultado = 0;
                if(direction == Direction.ASC){
                   resultado = this.order(a,b, field);
                } else if (direction == Direction.DESC) {
                   resultado = this.order(b,a, field);
                }
                return resultado;
            });
        return listaOrdenada;
    }

    private int order(Cliente a, Cliente b, String field) {
        int resultado = 0;
        switch (field) {
            case "id" -> resultado = Integer.compare(a.getId(), b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

}
