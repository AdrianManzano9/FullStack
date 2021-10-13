/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package Egg;

/**
 *
 * @author Pc
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Vector = new int[100];
        for (int i = 0; i < 100; i++) {
            Vector[i] = 100 - i;
        }
        for (int elemento : Vector) {
            System.out.print(elemento + ", ");
        }
    }
}
