package com.amoelcodigo.repository;

import com.amoelcodigo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}
