package com.amoelcodigo.interfaces.repository;

import com.amoelcodigo.interfaces.models.Cliente;

import java.util.List;

public interface PaginableRepository<T> {
    List<T> findAll(int since, int to);
}
