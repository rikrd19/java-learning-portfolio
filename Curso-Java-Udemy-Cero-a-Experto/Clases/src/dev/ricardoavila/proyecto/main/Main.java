package dev.ricardoavila.proyecto.main;

import dev.ricardoavila.proyecto.modelo.Libro;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();

        Libro libro2 = new Libro("Odisea", "Homero", 70.00, 550);

        Libro libro3 = new Libro("El Quijote", "Miguel de Cervantes", 100.00, 900);

        libro3.aplicarDescuento(15);

        libro1.mostrarLibro();
        System.out.println();

        libro2.mostrarLibro();
        System.out.println();

        libro3.mostrarLibro();


    }

}
