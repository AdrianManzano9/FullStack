/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int sumaA = 0;
        int sumaB = 0;
        int sumaC = 0;
        int sumaH = 0;
        int ingr;
        int[][] matriz = new int[3][3];
        System.out.println("Ingresar valores entre 1 y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                System.out.print("Fila " + (i + 1) + " Columna " + (j + 1) + ": ");
                ingr = leer.nextInt();
                if (ingr < 10 && ingr > 0) {
                    matriz[i][j] = ingr;
                } else {
                    System.out.println("Valor incorrecto");
                }
                }while(ingr > 10 || ingr < 0);
            }
        }
        for (int i = 0; i < 3; i++) {

            suma1 = suma1 + matriz[0][i];
            suma2 = suma2 + matriz[1][i];
            suma3 = suma3 + matriz[2][i];
            sumaA = sumaA + matriz[i][0];
            sumaB = sumaB + matriz[i][1];
            sumaC = sumaC + matriz[i][2];
            sumaH = sumaH + matriz[i][i];
        }

        if (((suma1+suma2+suma3+sumaA+sumaB+sumaC)/6)==sumaH) {
            System.out.println("El cubo es mágico");
        }else{
           System.out.println("El cubo no es mágico"); 
        }
    }
}
