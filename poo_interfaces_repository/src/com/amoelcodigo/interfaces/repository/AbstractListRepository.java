package com.amoelcodigo.interfaces.repository;

import com.amoelcodigo.interfaces.models.BaseEntity;
import com.amoelcodigo.interfaces.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements OrdablePaginableCrudRepositoy<T>{

    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> findAll() {
        return dataSource;
    }

    @Override
    public T findById(int id) {
        T cliente = null;
        for (T cli : dataSource) {
            if(cli.getId() != 0 && cli.getId() == id) {
                cliente = cli;
                break;
            }
        }
        return cliente;
    }


    @Override
    public void create(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void deleteById(int id) {
        this.dataSource.remove(id);
    }

    @Override
    public List<T> findAll(int since, int to) {
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
