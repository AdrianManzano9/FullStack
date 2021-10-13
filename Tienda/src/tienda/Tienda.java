/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import tienda.Servicios.fabricanteService;
import tienda.Servicios.productoService;

/**
 *
 * @author Pc
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        productoService PS = new productoService();
        fabricanteService FS = new fabricanteService();
        System.out.println("Manu");
        System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.\n"
                + "b) Lista los nombres y los precios de todos los productos de la tabla producto.\n"
                + "c) Listar aquellos productos que su precio esté entre 120 y 202.\n"
                + "d) Buscar y listar todos los Portátiles de la tabla producto.\n"
                + "e) Listar el nombre y el precio del producto más barato.\n"
                + "f) Ingresar un producto a la base de datos.\n"
                + "g) Ingresar un fabricante a la base de datos\n"
                + "h) Editar un producto con datos a elección.");
        String eleccion = leer.next();
        if(eleccion.equalsIgnoreCase("a")){
            PS.mostrarProductos();
        }
    }

}
