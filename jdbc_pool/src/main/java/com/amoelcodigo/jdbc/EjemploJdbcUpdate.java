package com.amoelcodigo.jdbc;

import com.amoelcodigo.jdbc.models.Producto;
import com.amoelcodigo.jdbc.repository.ProductoRepositoryImpl;
import com.amoelcodigo.jdbc.repository.Repository;
import com.amoelcodigo.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {


            Repository<Producto> repository = new ProductoRepositoryImpl();
            System.out.println("========= LISTAR ======");
            repository.findAll().forEach(System.out::println);

            System.out.println("========= By ID ======");
            System.out.println(repository.findById(1L));

            System.out.println("========= INSERT ======");
            Producto producto = new Producto();
            producto.setId(2L);
            producto.setNombre("Teclado mecanico Razar");
            producto.setPrecio(600);
            producto.setFechaRegistro(new Date());
            repository.save(producto);
            System.out.println("Producto guardado con éxito");
            repository.findAll().forEach(System.out::println);
    }
}