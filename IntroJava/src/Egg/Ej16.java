/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Suma = 0;
        System.out.println("Ingresar 20 números");
        for (int i = 1; i < 20; i++) {
            int Valor = leer.nextInt();
            if (Valor > 0) {
                Suma = Suma + Valor;
            } else if (Valor == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
        }
        System.out.println("La suma es de " + Suma);
    }

}
