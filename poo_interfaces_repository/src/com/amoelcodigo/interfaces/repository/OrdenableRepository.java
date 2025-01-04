package com.amoelcodigo.interfaces.repository;

import com.amoelcodigo.interfaces.models.Cliente;

import java.util.List;

public interface OrdenableRepository<T> {
    List<T> findAll(String field, Direction direction);
}
