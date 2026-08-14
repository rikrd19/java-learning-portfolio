package dev.ricardoavila.excepciones.ejercicio6;

public class PruebaEdadValida {
    public static void main(String[] args) {

        int[] edades = {25, -5, 150, 294, 3, 0, 120};

        for (int edad : edades) {
            try {
                EdadValida.validarEdad(edad);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
