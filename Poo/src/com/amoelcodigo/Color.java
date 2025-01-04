package com.amoelcodigo;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja Claro");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
