package dev.ricardoavila.excepciones.ejercicio4;

public class ObjetoNull {
    public static void main(String[] args) {

        String nombre = null;

        try {
            System.out.println("Nombre: " + nombre.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        nombre = "Alberto";

        try {
            System.out.println("Nombre: " + nombre.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
