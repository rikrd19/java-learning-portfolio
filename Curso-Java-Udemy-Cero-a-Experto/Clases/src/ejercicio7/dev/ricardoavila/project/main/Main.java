package ejercicio7.dev.ricardoavila.project.main;

import ejercicio7.dev.ricardoavila.project.Biblioteca.Biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca bibliot1 = new Biblioteca("Biblioteca Central", 1000, 500, false);
        bibliot1.agregarLibro(20);
        bibliot1.retirarLibro(5);
        bibliot1.abrirBiblioteca();
        bibliot1.mostrarEstado();
        System.out.println("-".repeat(60));

        Biblioteca bibliot2 = new Biblioteca("Biblioteca Central", 2000, 800, false);
        bibliot2.agregarLibro(20);
        bibliot2.retirarLibro(5);
        bibliot2.abrirBiblioteca();
        bibliot2.mostrarEstado();
        System.out.println("-".repeat(60));

        Biblioteca bibliot3 = new Biblioteca("Biblioteca Central", 1000, 100, false);
        bibliot3.agregarLibro(20);
        bibliot3.retirarLibro(5);
        bibliot3.abrirBiblioteca();
        bibliot3.mostrarEstado();
        System.out.println("-".repeat(60));
    }
}
