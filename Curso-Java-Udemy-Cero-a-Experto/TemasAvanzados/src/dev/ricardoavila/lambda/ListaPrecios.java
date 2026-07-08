package dev.ricardoavila.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListaPrecios {
    public static void main(String[] args) {

        List<Double> precios = new ArrayList<>(List.of(19.99, 5.50, 32.0, 8.75, 14.30));

        // Usa forEach con lambda para imprimir cada precio con un 20% de
        // descuento aplicado.

        precios.forEach(precio -> {
            double precioFinal = precio - (precio * 0.20);
            System.out.println("Precio original: $" + precio + " - Precio con descuento: $" + String.format("%.2f", precioFinal));
        });
    }
}
