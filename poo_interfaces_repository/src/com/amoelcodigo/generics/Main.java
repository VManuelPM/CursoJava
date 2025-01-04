package com.amoelcodigo.generics;

import com.amoelcodigo.interfaces.models.Cliente;
import com.amoelcodigo.interfaces.models.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Victor Manuel", "Pedraza"));

        Cliente manu = clientes.iterator().next();

        Cliente[] clientesArreglo = {
                new Cliente("Victor Manuel", "Pedraza"),
                new Cliente("Manuel", "Moreno")
        };

        Integer[] enteros = {1,2,3};

        List<Cliente> clienteList = fromArrayToList(clientesArreglo);
        List<Integer> numerosList = fromArrayToList(enteros);

        clienteList.forEach(System.out::println);
        numerosList.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{
                "Pepe", "Luci", "Jhony"}, enteros);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumList = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Paco", "Herndanz")
        });
        imprimirClientes(clienteList);
        imprimirClientes(clientes);
        imprimirClientes(clientePremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximum(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + maximum(3.9, 11.6, 7.78));
        System.out.println("Máximo de Zanahoria, Arándanos, Manzana es " + maximum("Zanahoria",
                "Arándanos", "Manzana"));
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for(G elemento : x ) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    //el signo ? es un comodin que significa que puede entrar cualquier tipo del extends (tipo, clase, etc)
    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    //La función diamente T extends Comparable significa que esta función recibe los objetos
    //  siempre y cuando estos implementen la interfaz Comparable, estamos acotando el generico
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

}
