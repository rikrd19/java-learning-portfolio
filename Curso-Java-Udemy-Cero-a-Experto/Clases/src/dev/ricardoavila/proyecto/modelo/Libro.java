package dev.ricardoavila.proyecto.modelo;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int paginas;

    // constructor vacio
    public Libro() {
        titulo = "Sin definir";
        autor = "Sin definir";
        precio = 0.0;
        paginas = 0;
    }

    // constructor con parametros
    public Libro(String titulo, String autor, double precio, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = this.precio * (porcentaje / 100);
        this.precio -= descuento;
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: " + this.precio);
        System.out.println("Paginas: " + this.paginas);
    }
}
