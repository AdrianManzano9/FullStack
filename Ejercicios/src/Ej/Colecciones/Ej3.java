/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */
package Ej.Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String Res = "S";
        ArrayList<Alumno> list_alum = new ArrayList<>();
        while (Res.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el nombre del alumno.");
            Alumno An = new Alumno(leer.next());
            System.out.println("Ingrese las 3 notas correspondientes.");
            System.out.print("N1: ");
            An.getNotas().add(leer.nextInt());
            System.out.print("N2: ");
            An.getNotas().add(leer.nextInt());
            System.out.print("N3: ");
            An.getNotas().add(leer.nextInt());
            System.out.println("¿Quiere ingresar a otro alumno? (S/N)");
            Res = leer.next();
            An.notaFinal();
            while (!Res.equalsIgnoreCase("s") && !Res.equalsIgnoreCase("n")) {
                System.out.println("Respuesta incorrecta");
                System.out.println("¿Quiere ingresar a otro alumno? (S/N)");
                Res = leer.next();
            }
            list_alum.add(An);
        }
       
    }

}
