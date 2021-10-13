/*
1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
 */
package ej.excepciones;

/**
 *
 * @author Pc
 */
public class EjEXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P1 = new Persona();
        try {
          P1.calcularEdad();  
        } catch (NullPointerException e) {
            System.out.println("La persona no fue creada");
        } 
        
    }
    
}
