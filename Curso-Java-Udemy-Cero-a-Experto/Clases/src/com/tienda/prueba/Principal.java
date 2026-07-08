package com.tienda.prueba;

import com.tienda.modelo.Producto;

public class Principal {

    public static void main(String[] args) {
        System.out.println("*** Clase Producto ***");

        Producto product = new Producto();
        product.setNombre("Cocina");

        try {
            product.setPrecio(50.00);
        } catch (IllegalArgumentException e) {
            System.out.println("CUIDADO: " + e.getMessage());
        }

        // El programa sigue aqui de forma segura
        System.out.println("Nombre del producto: " + product.getNombre());
        System.out.printf("Precio del producto: %.2f", product.getPrecio());
    }
}
