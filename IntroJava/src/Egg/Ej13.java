/*
13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 

 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int NOTA;
        do {
         System.out.println("Ingresar Nota (entre 1 y 10)");
        NOTA = leer.nextInt();
    }while(NOTA>10||NOTA<1);
    }
}
