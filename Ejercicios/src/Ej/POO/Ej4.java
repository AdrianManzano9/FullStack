/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
 */
package Ej.POO;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo R1 = new Rectangulo();
        R1 = R1.crearRectangulo();
        R1.perímetro();
        R1.superficie();
        System.out.println(R1.toString());
        R1.Dibujar();

    }
}
