package com.amoelcodigo.map.ejercicios;


import com.amoelcodigo.models.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Dada una lista de productos y sus categorías,
 *  agrupa los productos por categorías en un mapa (clave: categoría, valor: lista de productos).
 */
public class ClasificacionCategorias {
    public static void main(String[] args) {

        // Crear la lista de productos
        List<Producto> productos = Arrays.asList(
                new Producto("Tv LG", "TV"),
                new Producto("Tv Sony", "TV"),
                new Producto("Bomba Plastica", "Utilidades"),
                new Producto("Enchufe", "Utilidades"),
                new Producto("Tv Panasonic", "TV"),
                new Producto("Comida Perro", "Mascotas"),
                new Producto("Muñeca", "Juguetes")
        );

        // Mapa para agrupar los productos por categoría
        Map<String, List<String>> productoMap = new HashMap<>();

        // Recorrer todos los productos y construir el mapa
        for (Producto producto : productos) {
            String categoria = producto.getCategoria();
            String nombre = producto.getNombre();

            // Si la categoría no existe en el mapa, inicializar una lista vacía
            if (!productoMap.containsKey(categoria)) {
                productoMap.put(categoria, new ArrayList<>());
            }

            // Agregar el producto a la lista correspondiente
            productoMap.get(categoria).add(nombre);
        }

        // Imprimir el mapa resultante
        System.out.println("productoMap = " + productoMap);

        //----------------------

        //Solución optimizada con Java 8
        /*Map<String, List<String>> productoMap = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.mapping(Producto::getNombre, Collectors.toList())
                )); */



    }
}
