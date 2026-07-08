package dev.ricardoavila.excepciones.ejercicio9;


/*Ejercicio 4 — Acceso a array con índice del usuario
Crea un array String[] colores = {"rojo", "azul", "verde"}. Intenta acceder 
a las posiciones 1, 5 y 0 usando un for tradicional.
 Maneja ArrayIndexOutOfBoundsException y usa finally para imprimir 
 "Intento finalizado" en cada iteración.*/


public class AccesoAIndice {
    public static void main(String[] args) {

        String[] colores = {"Rojo", "Verde", "Azul"};
        int[] indices = {1, 5, 0};

        for (int i : indices) {

            try {
                System.out.println("Color: " + colores[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: indice " + i + " fuera de rango");
            } finally {
                System.out.println("Intento Finalizado");
            }
        }
    }
}