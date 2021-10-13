/*
21. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar cantidad de Euros");
        int Eur = leer.nextInt();
        System.out.println("Ingresar moneda a converir (dólares, yenes o libras)");
        String moneda = leer.next();
        moneda = moneda.toLowerCase();
        if (moneda.equals("dolares")) {
            System.out.println("$" + Eur * 1.28611);
        } else if (moneda.equals("yenes")) {
            System.out.println(Eur * 129.852 + " yenes");
        } else if (moneda.equals("libras")) {
            System.out.println(Eur * 0.86 + " libras");
        }else{
            System.out.println("Tipo de moneda ingresada invalida");
        }
    }

}
