package Ej.POO;

import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pc
 */
public class Persona {

    private String Nombre;
    private Date Nacimiento;
    private int Edad;

    public Persona() {
    }

    public Persona(String Nombre, Date Nacimiento) {
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public static Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String Nom = leer.next();
        System.out.println("Ingrese su fecha de nacimiento (solo números)");
        System.out.println("Año");
        int Anio = leer.nextInt();
        System.out.println("Mes");
        int Mes = leer.nextInt();
        System.out.println("Día");
        Date Nac = new Date(Anio - 1900, Mes, leer.nextInt());
        return new Persona(Nom, Nac);
    }

    public void calcularEdad() throws NullPointerException{
        Date Actual = new Date();
        Edad=Actual.getYear()-Nacimiento.getYear();
        
       
        System.out.println("Tu edad es de " + Edad+" años");
    }

    public boolean menorQue(int edad) {
        if (edad < Edad) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPersona() {
        System.out.println( "Persona{" + "Nombre=" + Nombre + ", Nacimiento=" + Nacimiento + ", Edad= " + Edad + '}');
    }
    
}
