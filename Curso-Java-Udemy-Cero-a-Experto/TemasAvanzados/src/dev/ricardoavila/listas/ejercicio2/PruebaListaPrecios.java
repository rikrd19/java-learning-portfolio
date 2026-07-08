package dev.ricardoavila.listas.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PruebaListaPrecios {
    public static void main(String[] args) {

        List<Double> precios = new ArrayList<>();
        precios.add(19.99);
        precios.add(5.50);
        precios.add(32.0);
        precios.add(8.75);
        precios.add(14.30);

        double total = ListaPrecios.sumaPrecios(precios);
        System.out.printf("Total: $%.2f", total);
    }
}
