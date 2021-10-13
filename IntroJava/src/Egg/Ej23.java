/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Cant = 0;
        String Lugares = " ";
        System.out.println("Ingrese tamaño del vector");
        int Tamaño = leer.nextInt();
        int[] vector = new int[Tamaño];
        for (int i = 0; i < Tamaño; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ingresar valor a buscar (entre 1 y 100)");
        int Num = leer.nextInt();
        for (int j = 0; j < Tamaño; j++) {
            if (vector[j] == Num) {
                Cant = Cant + 1;
                String numCadena = String.valueOf(j + 1);
                Lugares = Lugares.concat(numCadena) + " ";
            }
        }
        if (Cant > 1) {
            System.out.println("El valor se a encontrado " + Cant + " veces, en las pocisiones" + Lugares);
        } else if (Cant == 1) {
            System.out.println("El valor se a encontrado " + Cant + " vez, en la pocisión" + Lugares);
        } else {
            System.out.println("No se encontrado ese valor");
        }

    }

}
