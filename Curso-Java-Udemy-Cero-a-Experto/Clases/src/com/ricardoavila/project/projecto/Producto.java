package com.ricardoavila.project.projecto;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public static void main(String[] args) {
        System.out.println("***** Clase Producto ***** ");

        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.precio = 1200.0;
        producto1.cantidad = 3;

        producto1.mostrarProducto();
        System.out.println("Total: " + producto1.calcularTotal());

        System.out.println("-".repeat(40));


        Producto producto2 = new Producto();
        producto2.nombre = "Mouse";
        producto2.precio = 25.0;
        producto2.cantidad = 10;

        producto2.mostrarProducto();
        System.out.println("Total: "+ producto2.calcularTotal());

    }

}
