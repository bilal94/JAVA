/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin;

/**
 *
 * @author Bilal
 */
public class Empleado {
    /*En Java, crea una clase Empleado que controle el DNI con letra del empleado,
    que su nombre y apellidos sea una cadena de texto inferior a 30 y 80 caracteres, que solicite el sueldo bruto, 
    le reste el 15% y calcule el sueldo neto. 
    Debemos tener funciones para que muestren todas las variables por pantalla. Realiza pruebas unitarias de la clase.*/
    private String dni;
    private String nombre,apellidos;
    private double sueldoBruto;

    public Empleado(String dni, String nombre, String apellidos, double sueldoBruto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBruto = sueldoBruto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
}
