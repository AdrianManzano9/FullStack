/*
28. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean aux=false;
        int[][] P = new int[3][3];
        System.out.println("Ingresar valores de la submatriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Fila " + (i + 1) + " Columna " + (j + 1) + ": ");
                P[i][j] = leer.nextInt();

            }
        }
        System.out.println("Sub Matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.print(P[i][j] + " ");
                } else {
                    System.out.println(P[i][j]);
                }
            }
        }
        int[][] M = new int[10][10];
        System.out.println("Ingresar valores de la matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print("Fila " + (i + 1) + " Columna " + (j + 1) + ": ");
                M[i][j] = leer.nextInt();

            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 9) {
                    System.out.print(M[i][j] + " ");
                } else {
                    System.out.println(M[i][j]);
                }
                
            }
        }
        Buscador(M, P);
    }
    public static void Buscador (int[][]M,int[][]P){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean aux= true;
              for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(M[i+k][l+j]!=P[k][l]){
                            aux=false;
                            break;
                        }
                    }
                }  
              if(aux){
                  System.out.println("Se encontro la submatriz,empieza en la la fila: "+(i+1)+" y en la columna: "+(j+1));
                  return;
              }
            }
        }
       System.out.print("No se encontro ninguna coincidencia.");
    }
}
