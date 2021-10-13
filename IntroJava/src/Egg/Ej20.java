/*
20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar 4 números (entre 1 y 20)");
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        int Num3 = leer.nextInt();
        int Num4 = leer.nextInt();
        if (Num1 <= 20 && Num1 >= 1) {
            System.out.print(Num1 + " ");
            for (int i = 1; i <= Num1; i++) {
                if (i < Num1) {
                    System.out.print("*");
                } else {
                    System.out.println("*");
                }
            }
        } else {
            System.out.println("error");
        }
        if (Num2 <= 20 && Num2 >= 1) {
            System.out.print(Num2 + " ");
            for (int i = 1; i <= Num2; i++) {
                if (i < Num2) {
                    System.out.print("*");
                } else {
                    System.out.println("*");
                }
            }
        } else {
            System.out.println("error");
        }
        if (Num3 <= 20 && Num3 >= 1) {
            System.out.print(Num3 + " ");
            for (int i = 1; i <= Num3; i++) {
                if (i < Num3) {
                    System.out.print("*");
                } else {
                    System.out.println("*");
                }
            }
        } else {
            System.out.println("error");
        }
        if (Num4 <= 20 && Num4 >= 1) {
            System.out.print(Num4 + " ");
            for (int i = 1; i <= Num4; i++) {
                if (i < Num4) {
                    System.out.print("*");
                } else {
                    System.out.println("*");
                }
            }
        } else {
            System.out.println("error");
        }
    }
}
