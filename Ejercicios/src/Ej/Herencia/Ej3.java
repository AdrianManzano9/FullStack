/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package Ej.Herencia;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodoméstico> Productos = new ArrayList();
        Double T_L = 0.0;
        Double T_T = 0.0;
        Lavadora L1 = new Lavadora(50, 0, "azul", "D", 100);
        System.out.println(L1.toString());
        Productos.add(L1);
        Televisor T1 = new Televisor(78, true, 400, "blanco", "A", 500);
        System.out.println(T1.toString());
        Productos.add(T1);
        Lavadora L2 = new Lavadora(100, 0, "rojo", "B", 400);
        System.out.println(L2.toString());
        Productos.add(L2);
        Televisor T2 = new Televisor(120, false, 500, "negro", "D", 600);
        System.out.println(T2.toString());
        Productos.add(T2);
        for (Electrodoméstico Producto : Productos) {
            Producto.precioFinal();
            if (Producto.getClass().equals(Televisor.class)) {
                T_T += Producto.getPrecio();
            } else if (Producto.getClass().equals(Lavadora.class)) {
                T_L += Producto.getPrecio();
            }
        }
        System.out.println("El precio total de las lavadoras es de " + T_L);
        System.out.println("El precio total de los televisores es de " + T_T);
    }

}
