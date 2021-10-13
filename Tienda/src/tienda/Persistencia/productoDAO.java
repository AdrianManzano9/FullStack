/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author Pc
 */
public final class productoDAO extends DAO {

    public Producto buscarPorNombre(String nombre) throws Exception {
        try {
            executeQuery("SELECT * FROM Producto WHERE Nombre= '" + nombre + "';");
            Producto producto = null;
            while (Resultado.next()) {
                producto.setCodigo(Resultado.getInt(1));
                producto.setNombre(Resultado.getString(2));
                producto.setPrecio(Resultado.getDouble(3));
                producto.setCodigo_fabricante(Resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) " + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + " , " + producto.getCodigo_fabricante() + ");";
            executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            desconectarBase();
        }
    }

    public Collection<String> mostrarProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            executeQuery(sql);
            String nombre;
            Collection<String> nombres = new ArrayList();
            while (Resultado.next()) {
                nombre = Resultado.getString(1);
                nombres.add(nombre);
            }
            desconectarBase();
            return nombres;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
