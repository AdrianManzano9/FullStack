/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Ej.Colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import sun.security.action.GetBooleanAction;

/**
 *
 * @author Pc
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Integer> list_prod = new HashMap();
        while (true) {
            System.out.println("MENU");
            System.out.println("1: Introducir un producto.");
            System.out.println("2: Modificar precio de un producto.");
            System.out.println("3: Eliminar un producto.");
            System.out.println("4: Mostrar los productos.");
            System.out.println("5: Salir");
            System.out.println("Ingrese su elección");
            int res = leer.nextInt();
            String nombre;
            switch (res) {
                case 1:
                    System.out.println("Ingrese el nombre del producto.");
                    nombre = leer.next();
                    System.out.println("Ingrese el precio.");
                    list_prod.put(nombre, leer.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto.");
                    nombre = leer.next();
                    System.out.println("Ingrese el nuevo precio.");
                    list_prod.replace(nombre, leer.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a remover.");
                    list_prod.remove(leer.next());
                    break;
                case 4:
                    for (Map.Entry<String, Integer> entry : list_prod.entrySet()) {
                        System.out.println("******************Productos*****************");
                        System.out.println("Producto: " + entry.getKey() + " Valor: $" + entry.getValue());
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}
