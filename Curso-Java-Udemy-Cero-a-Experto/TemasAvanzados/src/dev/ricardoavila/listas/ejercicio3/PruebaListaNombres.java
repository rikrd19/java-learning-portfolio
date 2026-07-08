package dev.ricardoavila.listas.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PruebaListaNombres {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Lola");
        nombres.add("Ricardo");
        nombres.add("Sofia");
        nombres.add("Luis");
        nombres.add("Valentina");
        nombres.add("Carlos");
        nombres.add("Alejandro");

        ListaNombres.imprimirNombresLargos(nombres);
    }
}
