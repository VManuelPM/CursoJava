package com.amoelcodigo.jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static String url = "jdbc:mysql://localhost:3306/java_curso";
    private static String username = "root";
    private static String password = "";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
       if(pool == null) {
           pool = new BasicDataSource();
           pool.setUrl(url);
           pool.setUsername(username);
           pool.setPassword(password);
           //Tamaño inicial del pool, por defecto es 8
           pool.setInitialSize(3);
           //Minimo de conexiones inactivas
           pool.setMinIdle(3);
           //Maxima de conexiones inactivas
           pool.setMaxIdle(8);
           pool.setMaxTotal(8);
       }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
