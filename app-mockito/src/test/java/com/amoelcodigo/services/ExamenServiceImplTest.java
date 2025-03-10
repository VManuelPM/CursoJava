package com.amoelcodigo.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amoelcodigo.models.Examen;
import com.amoelcodigo.repositories.ExamenRepository;

public class ExamenServiceImplTest {
  @Test
  void testFindExamenByName() {
    ExamenRepository repository = mock(ExamenRepository.class);
    ExamenService service = new ExamenServiceImpl(repository);
    List<Examen> datos = Arrays.asList(new Examen(5L, "Matemáticas"),
        new Examen(6L, "Lenguaje"), new Examen(7L, "Historia"));

    when(repository.findAll()).thenReturn(datos);
    Examen examen = service.findExamenByName("Matemáticas");

    assertNotNull(examen);
    assertEquals(5L, examen.getId());
    assertEquals("Matemáticas", examen.getNombre());
  }

  @Test
  void findExamenPorNombreListaVacia() {
    ExamenRepository repository = mock(ExamenRepository.class);
    ExamenService service = new ExamenServiceImpl(repository);
    List<Examen> datos = Collections.emptyList();

    when(repository.findAll()).thenReturn(datos);
    Optional<Examen> examen = Optional.ofNullable(service.findExamenByName("Matemáticas"));

    assertFalse(examen.isPresent());
  }
}
