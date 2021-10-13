/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package Ej.Colecciones;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Pc
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String Res = "s";
        Set<String> Paices = new TreeSet();
        do {
            System.out.println("Ingrese un paíz.");
            Paices.add(leer.next());
            do {
                System.out.println("¿Quiere ingresar otro paíz? (s/n)");
                Res = leer.next();
                if (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n")) {
                    System.out.println("Respuesta incorrecta");
                }
            } while (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n"));

        } while (Res.equalsIgnoreCase("s"));
        for (String Paíz : Paices) {
            System.out.println("Lista actualizada.");
            System.out.println(Paíz);
        }
        boolean borr = false;
        do {
            System.out.println("¿Que paíz quiere borrar?");
            String BPaíz = leer.next();
            for (Iterator<String> iterator = Paices.iterator(); iterator.hasNext();) {

                if (BPaíz.equals(iterator.next())) {
                    iterator.remove();
                    borr = true;
                }
            }
            if (!borr) {
                System.out.println("No se encontro el paíz.");
            }
            for (String Paíz : Paices) {
                System.out.println("Lista actualizada.");
                System.out.println(Paíz);
            }
            do {
                System.out.println("¿Quiere borrar otro paíz? (s/n)");
                Res = leer.next();
                if (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n")) {
                    System.out.println("Respuesta incorrecta");
                }
            } while (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n"));
        } while (Res.equalsIgnoreCase("s"));
    }

}
