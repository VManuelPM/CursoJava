package com.amoelcodigo.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsurioRepositorio extends Observable{
    private List<String> repositorio = new ArrayList<>();
    public void crearUsuario (String usuario) {
        repositorio.add(usuario);
        notifyObservers(usuario);
    }
}
