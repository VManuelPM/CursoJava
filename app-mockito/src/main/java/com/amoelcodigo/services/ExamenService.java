package com.amoelcodigo.services;

import com.amoelcodigo.models.Examen;

public interface ExamenService {
  Examen findExamenByName(String nombre);
}
