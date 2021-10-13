package Ej.RelacionesEntreClases;

import java.util.Scanner;

/*
. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */

/**
 *
 * @author Pc
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona P1 =Persona.crearPersona();
       Persona P2 =Persona.crearPersona();
        System.out.println("Perfil 1");
        System.out.println(P1.toString());
        System.out.println("Perfil Mascota");
        System.out.println(P1.getPerro().toString());
        System.out.println("Perfil 2");
        System.out.println(P2.toString());
    }
    
}
class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
    public static Persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su edad");
        Integer edad = leer.nextInt();
        System.out.println("Ingresar su DNI");
        Integer documento = leer.nextInt();
        System.out.println("Perfil de su mascota");
        Perro perro = Perro.crearPerro();
        return new Persona(nombre,apellido,edad,documento,perro);
    }

    @Override
    public String toString() {
        return "MPersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + '}';
    }

}
class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamaño;
    
    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    

  public static Perro crearPerro(){
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      System.out.println("Ingrese el nombre del perro");
      String nombre = leer.next();
      System.out.println("Ingrese la raza del perro");
      String raza = leer.next();
      System.out.println("Ingrese la edad del perro");
      Integer edad = leer.nextInt();
      System.out.println("Ingrese tamaño del perro");
      String tamaño = leer.next();
      return new Perro(nombre, raza, edad, tamaño);
  }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
}

