package com.amoelcodigo.repositories;

import java.util.List;

import com.amoelcodigo.models.Examen;

public interface ExamenRepository {
  List<Examen> findAll();
}
