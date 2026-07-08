package dev.ricardoavila.listas.ejercicio1;

import java.util.List;

public class Ejercicio1 {

    public static void imprimirPares(List<Integer> numeros) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");

            }
        }
    }
}

