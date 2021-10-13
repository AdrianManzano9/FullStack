/*
6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt()
 */
package Egg;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número");
        int Numero = leer.nextInt();
        System.out.println(Numero*2);
        System.out.println(Numero*3);
        System.out.println(sqrt(Numero));
        
    }
    
}
