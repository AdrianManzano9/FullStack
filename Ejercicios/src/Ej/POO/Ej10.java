/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package Ej.POO;

import java.util.Arrays;

/**
 *
 * @author Pc
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        for (int i = 0; i < 50; i++) {
            A[i] = Math.random();
        }
        Ej10.mostrarArreglo(A);
        Arrays.sort(A);
        System.out.println("Arreglo ordenado");
        Ej10.mostrarArreglo(A);
        B = Arrays.copyOf(A, 20);
        Arrays.fill(B, 10,20,0.5);
        System.out.println("B");
        Ej10.mostrarArreglo(B);
    }

    public static void mostrarArreglo(double[] A) {
        System.out.println("***Arreglo***");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
