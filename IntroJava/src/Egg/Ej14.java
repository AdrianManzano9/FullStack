/*
14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Suma = 0;
        System.out.println("Ingresar límite");
        int Límite = leer.nextInt();
        System.out.println("Ingresar valores a sumar");
        while (Suma < Límite) {
            int Valor = leer.nextInt();
            Suma = Suma + Valor;
        }
        System.out.println("Limite superado");
    }

}
