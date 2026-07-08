package com.ricardoavila.project.projecto;

public class Estudiante {

    String nombre;
    double nota1;
    double nota2;

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());
    }

    public static void main(String[] args) {
        System.out.println("***** Clase Estudiante *****");

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Ana";
        estudiante1.nota1 = 8.0;
        estudiante1.nota2 = 9.0;

        estudiante1.mostrarEstudiante();

        System.out.println("-".repeat(40));

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Luis";
        estudiante2.nota1 = 6.0;
        estudiante2.nota2 = 6.0;

        estudiante2.mostrarEstudiante();
    }
}
