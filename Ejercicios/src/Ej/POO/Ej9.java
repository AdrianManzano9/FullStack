/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor.
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package Ej.POO;

/**
 *
 * @author Pc
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Matemática M1=new Matemática(Math.random(),Math.random());
        System.out.println(M1.toString());
        System.out.println(M1.devolverMayor());
        System.out.println(M1.calcularPotencia());
        System.out.println(M1.calculaRaiz());
        
    }
    
}
