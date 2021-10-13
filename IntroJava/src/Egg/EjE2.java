/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EjE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int aux;
        System.out.println("Ingresar el valor de las variables");
        System.out.print("A: "); int A=leer.nextInt();
        System.out.print("B: "); int B=leer.nextInt();
        System.out.print("C: "); int C=leer.nextInt();
        System.out.print("D: "); int D=leer.nextInt();
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("A: "+A); 
        System.out.println("B: "+B); 
        System.out.println("C: "+C); 
        System.out.println("D: "+D); 
    }
}
