package dev.ricardoavila.excepciones.ejercicio6;

public class EdadValida {

    public static void validarEdad(int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("Edad No válida: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {


        int[] edades = {25, -5, 150, 294, 03, 0, 120};

        for (int edad : edades) {
            try {
                validarEdad(edad);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}


