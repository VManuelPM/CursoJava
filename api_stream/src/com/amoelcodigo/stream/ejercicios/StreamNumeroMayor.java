package com.amoelcodigo.stream.ejercicios;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamNumeroMayor {

    //Obtener el número mayor en un arreglo con programación funcional lambda y api stream

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 7, 8, 23, 78, 95, 3, 5, 6};
        int maxNumber = Arrays.stream(n).max().getAsInt();
        System.out.println("maxNumber = " + maxNumber);
    }
}
