/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cant_1 = 0;
        int cant_2 = 0;
        int cant_3 = 0;
        int cant_4 = 0;
        int cant_5 = 0;
        System.out.println("Ingrese tamaño del vector");
        int Tamaño = leer.nextInt();
        int[] vector = new int[Tamaño];
        for (int i = 0; i < Tamaño; i++) {
            vector[i] = (int) (Math.random() * 99999);
        }
        for (int i = 0; i < Tamaño; i++) {
            String numCadena = String.valueOf(vector[i]);
            if (numCadena.length() == 1) {
                cant_1 = cant_1 + 1;
            } else if (numCadena.length() == 2) {
                cant_2 = cant_2 + 1;
            } else if (numCadena.length() == 3) {
                cant_3 = cant_3 + 1;
            } else if (numCadena.length() == 4) {
                cant_4 = cant_4 + 1;
            } else if (numCadena.length() == 5) {
                cant_5 = cant_5 + 1;
            }
        }
        System.out.println("Se encontraron:" + cant_1 + " valores de un dígito, ");
        System.out.println("               "+ cant_2 + " de 2 dígitos, ");
        System.out.println("               "+ cant_3 + " de 3 dígitos, " );
        System.out.println("               "+ cant_4 + " de 4 dígitos, ");
        System.out.println("               "+ cant_5 + " de 5 dígitos.");
    }
    

}
