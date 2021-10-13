/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ej.POO;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la frase");
        Cadena C1 = new Cadena(leer.next());
        System.out.println("Hay "+C1.mostrarVocales()+" vocales");
        System.out.println("Frase invertida: "+C1.invertirFrase());
        System.out.println("Ingrese la letra a contar");
        C1.vecesRepetido(leer.next());
        System.out.println("Ingresar frase para comparar su longuitud");
        C1.compararLongitud(leer.next());
        System.out.println("Ingresar frase a unir");
        C1.unirFrases(leer.next());
        System.out.print("Reemplazar las letras 'a' por: ");
        C1.reemplazar(leer.next());
        System.out.println("Ingrese la letra a buscar");
        System.out.println(C1.contiene(leer.next()));
    }
    
}
