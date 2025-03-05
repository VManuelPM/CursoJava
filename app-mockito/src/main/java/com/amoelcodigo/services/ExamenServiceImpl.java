package com.amoelcodigo.services;

import java.util.Optional;

import com.amoelcodigo.models.Examen;
import com.amoelcodigo.repositories.ExamenRepository;

public class ExamenServiceImpl implements ExamenService {

  private final ExamenRepository examenRepository;

  public ExamenServiceImpl(ExamenRepository examenRepository) {
    this.examenRepository = examenRepository;
  }

  @Override
  public Examen findExamenByName(String nombre) {
    Optional<Examen> examenOptional = examenRepository.findAll()
        .stream().filter(e -> e.getNombre().contains(nombre))
        .findFirst();

    Examen examen = null;
    if (examenOptional.isPresent()) {
      examen = examenOptional.orElseThrow();
    }
    return examen;
  }

}
