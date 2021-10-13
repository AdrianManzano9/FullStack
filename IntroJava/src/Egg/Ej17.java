/*
17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Egg;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;

/**
 *
 * @author Pc
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Co = 0;
        int Inco = 0;
          while (true) {
        System.out.println("Ingresar cadena (no mas de 5 caracteres),para finalizar ingresar “&&&&&”");
      
            String Cadena = leer.next();
            Cadena=Cadena.toLowerCase() ;
            if (!Cadena.equals("&&&&&") && Cadena.length() == 5 && Cadena.substring(0, 1).equals("x") && Cadena.substring(Cadena.length()-1, Cadena.length()).equals("o")) {
                System.out.println("Correcta");
                Co = Co + 1;
            } else if (Cadena.equals("&&&&&")) {
                break;
            } else {
                System.out.println("Incorrecta");
                Inco = Inco + 1;
            }
        }

        System.out.println("De las secuencias ingresadas " + Co + " fueron correctas y " + Inco + " fueron incorrectas");
    }
}
