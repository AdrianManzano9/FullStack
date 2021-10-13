/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
 */
package Ej.Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <String> Razas = new ArrayList<>();
        String res;
        do{
            System.out.println("Ingresar el nombre de la raza.");
            Razas.add(leer.next());
            System.out.println("¿Quiere guardar otro perro? (S/N)");
            res = leer.next();
        } while (res.equals("S")||res.equals("s"));
        if(!res.equals("N")||!res.equals("n")){
            System.out.println("Respuesta incorrecta.");
        }
        System.out.println("Lista");
        for(String aux : Razas){
            System.out.println(aux);
        }
        
        System.out.println("Ingrese una raza de perro a eliminar");
        String E_Raza =leer.next();
        Iterator<String> it = Razas.iterator();
        boolean aux=false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(E_Raza)) {
               it.remove();
              aux=true; 
            }
        }
        if(aux){
            System.out.println("No se encontro la raza ingresada.");
        }
        System.out.println("Lista actualizada");
        Razas.forEach((e)->System.out.println(e));
    }
}
