package dev.ricardoavila.listas.ejercicio2;

/*Ejercicio 2 — Lista de precios
Crea una List<Double> con 5 precios. Calcula e imprime el total de todos
los precios sumados.
// Pista — declara la variable antes del foreach
double total = 0.0;   */

import java.util.List;

public class ListaPrecios {

    public static double sumaPrecios(List<Double> precios){
        double total = 0.0;
        for(Double precio : precios){
            total += precio;
        }
        return total;
    }


}
