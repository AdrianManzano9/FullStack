/*
11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingresar una frase");
         String Frase = leer.next();
         System.out.println(Frase.substring(0, 1));
         if (Frase.substring(0, 1).equals("A")){
         System.out.println("CORRECTO");
         } else {
         System.out.println("INCORRECTO");
         }
    }
    
}
