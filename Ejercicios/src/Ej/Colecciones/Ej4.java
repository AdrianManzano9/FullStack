/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
 */
package Ej.Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        String Res = "s";
        ArrayList<Pelicula> list_pelis = new ArrayList<>();
        while (Res.equalsIgnoreCase("s")) {
            Pelicula Pn = new Pelicula();
            System.out.println("Ingrese el nombre de la película");
            Pn.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            Pn.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la película en horas");
            Pn.setDuracion(leer.nextDouble());
            list_pelis.add(Pn);
            do {
                System.out.println("¿Quiere ingresar otra película?");
                Res = leer.next();
                if (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n")) {
                    System.out.println("Respuesta incorrecta");
                }
            } while (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n"));

        }
        Iterator<Pelicula> it = list_pelis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        System.out.println("Peliculas con una duración mayor a 1 hora.");
        for (Iterator<Pelicula> iterator = list_pelis.iterator(); iterator.hasNext();) {
            Pelicula next = iterator.next();

            Integer aux = (Double.compare(next.getDuracion(), 1.00));

            if (aux.equals(0) || aux.equals(1)) {
                System.out.println(next);
            }

        }
        System.out.println("Ordenados por duración (de mayor a menor)");
        Collections.sort(list_pelis, Comparadores.ordenarPorDuracionDes);
        for (Iterator<Pelicula> iterator = list_pelis.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println("Ordenados por duración (de menor a mayor)");
        Collections.sort(list_pelis, Comparadores.ordenarPorDuracionAsen);
        for (Iterator<Pelicula> iterator = list_pelis.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println("Ordenados por Título (Alfabeticamente)");
        Collections.sort(list_pelis, Comparadores.ordenarPorTituloAsen);
        for (Iterator<Pelicula> iterator = list_pelis.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        Collections.sort(list_pelis, Comparadores.ordenarPorDirectorAsen);
        for (Pelicula list_peli : list_pelis) {
            System.out.println(list_peli);
        }
    }
}
