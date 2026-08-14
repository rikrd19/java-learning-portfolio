package dev.ricardoavila.mapa.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
    public static void main(String[] args) {

        Map<String, Double> catalogo = new HashMap<>();

        catalogo.put("Leche", 5.50);
        catalogo.put("Pan", 3.00);
        catalogo.put("Harina", 4.25);
        catalogo.put("Azucar", 2.75);

        catalogo.forEach((producto, precio) -> System.out.println("Producto: " + producto + ", Precio: " + precio));
        System.out.println();
        catalogo.entrySet().forEach(System.out::println);

    }
}