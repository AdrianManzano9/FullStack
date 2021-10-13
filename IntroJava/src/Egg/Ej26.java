/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o
viceversa). 
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean antisi = true;
        System.out.println("Ingresar tamaño de matriz");
        int Tamaño = leer.nextInt();
        int[][] matriz = new int[Tamaño][Tamaño];
        System.out.println("Ingresar valores (por fila)");
        for (int i = 0; i < Tamaño; i++) {
            for (int j = 0; j < Tamaño; j++) {
                System.out.print("Fila " + (i + 1) + " Columna " + (j + 1) + ": ");
                matriz[i][j] = leer.nextInt();
            }  
        }
        System.out.println("Matriz");
        for (int i = 0; i < Tamaño; i++) {
            for (int j = 0; j < Tamaño; j++) {
                if (j < Tamaño - 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.println(matriz[i][j]);
                }
                if (matriz[i][j] != (matriz[j][i] * -1)) {
                    antisi = false;
                }
            }
        }
        if (antisi) {
            System.out.println("Es anti simétrica");
        } else {
            System.out.println("No es anti simétrica");
        }
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < Tamaño; i++) {
            for (int j = 0; j < Tamaño; j++) {
                if (j < Tamaño - 1) {
                    System.out.print(matriz[j][i] + " ");
                } else {
                    System.out.println(matriz[j][i]);
                }
            }
        }

    }

}
