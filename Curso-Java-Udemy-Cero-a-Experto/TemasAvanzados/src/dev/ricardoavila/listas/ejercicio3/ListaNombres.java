package dev.ricardoavila.listas.ejercicio3;

/*Ejercicio 3 — Lista de nombres
Crea una List<String> con 6 nombres. Recórrela e imprime solo los que
tengan más de 5 caracteres.
// Pista
nombre.length()*/

import java.util.List;

public class ListaNombres {

    public static void imprimirNombresLargos(List<String> nombres) {
        for (String nombre : nombres) {
            if (nombre.length() > 5) {
                System.out.println("Nombre largo: " + nombre);
            }
        }
    }
}
