package dev.ricardoavila.foreach;

/*Ejercicio 4 — Productos
Crea un array de 4 objetos Producto con nombre y precio. Usa foreach para
imprimir cada producto e imprime el precio total al final.*/

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " = $" + precio;
    }
}

class PruebaProductos {
    static void main(String[] args) {

        Producto[] productos = {
                new Producto("Camisa", 5.00),
                new Producto("Libro", 15.50),
                new Producto("Vajilla", 15.00),
                new Producto("Jarron", 28.50)
        };

        double precioTotal = 0.0;

        for (Producto p : productos){
            System.out.println(p);
            precioTotal += p.getPrecio();
        }
        System.out.println("\tTotal: $"+ precioTotal);
    }
}
