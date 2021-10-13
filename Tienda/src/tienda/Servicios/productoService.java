/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.Servicios;

import java.util.Collection;
import sun.print.PSPrinterJob;
import tienda.Persistencia.DAO;
import tienda.Persistencia.productoDAO;
import tienda.entidades.Producto;

/**
 *
 * @author Pc
 */
public class productoService {
    private productoDAO dao = new productoDAO();
    public void crearProducto(String nombre, Double precio, Integer codigo_fabricante) throws Exception{
        try {
            if (nombre == null) {
                throw new Exception("Debe ingresar un nombre");
            }
            if (precio == null) {
                throw new Exception("Debe ingresar un precio");
            }
            if (codigo_fabricante == null) {
                throw new Exception("Debe ingresar el codigo del fabricante");
            }
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigo_fabricante(codigo_fabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarProductos() throws Exception {
        try {
          Collection<String> productos= dao.mostrarProductos();
          if(productos.isEmpty()){
              throw new Exception("No hay productos");
          } else {
              for (String producto : productos) {
                  System.out.println(producto);
              }
          }
        } catch (Exception e) {
        }
    }
    
}
