package com.ricardoavila.project.projecto;

public class Empleado {
    String nombre;
    String puesto;
    double salario;

    // Constructor vacio
    public Empleado() {
        nombre = "Sin Asignar";
        puesto = "Sin Asignar";
        salario = 0.0;
    }

    // Constructor con parametros
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public void aplicarAumento(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Puesto: " + this.puesto);
        System.out.println("Salario: " + this.salario);
    }


    public static void main(String[] args) {

        System.out.println("***** Clase Empleado *****");

        Empleado empleado1 = new Empleado();
        empleado1.mostrarEmpleado();

        System.out.println("-".repeat(40));

        Empleado empleado2 = new Empleado("Ana", "Supervisor", 1000.0);
        empleado2.aplicarAumento(5);
        empleado2.mostrarEmpleado();


        System.out.println("-".repeat(40));

        Empleado empleado3 = new Empleado("Karla", "Manager", 2000.0);
        empleado3.aplicarAumento(10);
        empleado3.mostrarEmpleado();
    }
}
