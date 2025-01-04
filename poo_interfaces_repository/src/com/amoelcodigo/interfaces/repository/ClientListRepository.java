package com.amoelcodigo.interfaces.repository;

import com.amoelcodigo.interfaces.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository implements OrdablePaginableCrudRepositoy<Cliente>{

    private List<Cliente> dataSource;

    public ClientListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> findAll() {
        return dataSource;
    }

    @Override
    public Cliente findById(int id) {
        Cliente cliente = null;
        for (Cliente cli : dataSource) {
            if(cli.getId() != 0 && cli.getId() == id) {
                cliente = cli;
                break;
            }
        }
        return cliente;
    }

    @Override
    public void createClient(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void edit(Cliente cliente) {
        Cliente c = findById(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void deleteById(int id) {
        this.dataSource.remove(id);
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

    @Override
    public List<Cliente> findAll(int since, int to) {
        return dataSource.subList(since, to);
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

    @Override
    public int count() {
        return this.dataSource.size();
    }
}
