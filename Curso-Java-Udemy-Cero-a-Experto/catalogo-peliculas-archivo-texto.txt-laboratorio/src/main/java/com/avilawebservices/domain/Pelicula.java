package com.avilawebservices.domain;

/*
 *  Representa los objetos película utilizados en la aplicación
 * catálogo de películas
 * */
public class Pelicula {
    private String nombre;

    // Constructor
    public Pelicula() {
    }

    // Constructor con parámetros
    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
