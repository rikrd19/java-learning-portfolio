package com.tienda.modelo;

public class Producto {

    private String nombre;
    private double precio;

  /*  public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);  // reutiliza la validacion aqui
    }*/

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("Error: El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
}