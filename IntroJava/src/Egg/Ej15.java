/*

 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar primer número");
        int Num1 = leer.nextInt();
        System.out.println("Ingresar segundo número");
        int Num2 = leer.nextInt();
        System.out.println("MENU\n" + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n" + "Elija opción:");
        int opcion = leer.nextInt();
        switch(opcion){
           case 1: System.out.println("Respuesta: "+Num1+Num2);break;
           case 2: System.out.println("Respuesta: "+(Num1-Num2));break;
           case 3: System.out.println("Respuesta: "+Num1*Num2);break;
           case 4: System.out.println("Respuesta: "+Num1/Num2);break;
           case 5:  break;
        }
    }
}


