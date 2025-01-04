package com.amoelcodigo.interfaces.repository;

import com.amoelcodigo.interfaces.models.Cliente;
import java.util.List;
public interface CrudRepository<T> {
    List<T> findAll();
    T findById(int id);
    void create(T t);
    void edit(T t);
    void deleteById(int id);

    int count();

}
