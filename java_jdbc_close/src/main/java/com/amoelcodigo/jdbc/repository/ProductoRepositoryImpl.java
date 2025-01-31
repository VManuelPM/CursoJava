package com.amoelcodigo.jdbc.repository;

import com.amoelcodigo.jdbc.models.Categoria;
import com.amoelcodigo.jdbc.models.Producto;
import com.amoelcodigo.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryImpl implements Repository<Producto> {

    @Override
    public List<Producto> findAll() {
        List<Producto> productos = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("SELECT p.*, c.nombre as categoria FROM PRODUCTOS as p inner join categorias " +
                     "as c ON (p.categoria_id = c.id)")) {
            while (rs.next()) {
                Producto p = getProducto(rs);
                productos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto findById(Long id) {
        Producto producto = null;
        try (Connection conn = getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement("SELECT p.*, c.nombre as categoria FROM PRODUCTOS as p " +
                     "inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id = ? ");
        ) {
            preparedStatement.setLong(1, id);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    producto = getProducto(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producto;
    }

    @Override
    public void save(Producto producto) {
        String sql = null;
        if (producto.getId() != null && producto.getId() > 0) {
            sql = "UPDATE productos SET nombre=?, precio=?, categoria_id WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, categoria_id, fecha) VALUES(?,?,?,?)";
        }
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setInt(2, producto.getPrecio());
            statement.setLong(3, producto.getCategoria().getId());
            if (producto.getId() != null && producto.getId() > 0) {
                statement.setLong(4, producto.getId());
            } else {
                statement.setDate(4, new Date(producto.getFechaRegistro().getTime()));
            }

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(Long id) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn
                     .prepareStatement("DELETE FROM productos WHERE id=?")) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }

    private static Producto getProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha"));
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong("categoria_id"));
        categoria.setNombre(rs.getString("categoria"));
        p.setCategoria(categoria);
        return p;
    }
}
