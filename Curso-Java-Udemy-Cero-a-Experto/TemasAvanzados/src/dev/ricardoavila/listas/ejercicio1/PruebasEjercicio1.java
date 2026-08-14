package dev.ricardoavila.listas.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PruebasEjercicio1 {
    public static void main(String[] args) {
        List<Integer> numerosEnteros = new ArrayList<>();

        numerosEnteros.add(1);
        numerosEnteros.add(2);
        numerosEnteros.add(43);
        numerosEnteros.add(4);
        numerosEnteros.add(62);

        Ejercicio1.imprimirPares(numerosEnteros);

        System.out.println();
    }
}


