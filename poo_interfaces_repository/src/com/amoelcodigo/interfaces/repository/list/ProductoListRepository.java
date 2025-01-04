package com.amoelcodigo.interfaces.repository.list;

import com.amoelcodigo.interfaces.models.Cliente;
import com.amoelcodigo.interfaces.models.Producto;
import com.amoelcodigo.interfaces.repository.AbstractListRepository;
import com.amoelcodigo.interfaces.repository.Direction;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepository extends AbstractListRepository<Producto> {
    @Override
    public void edit(Producto producto) {
        Producto p = findById(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> findAll(String field, Direction direction) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    private int order(Producto a, Producto b, String field) {
        int resultado = 0;
        switch (field) {
            case "id" -> resultado = Integer.compare(a.getId(), b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
