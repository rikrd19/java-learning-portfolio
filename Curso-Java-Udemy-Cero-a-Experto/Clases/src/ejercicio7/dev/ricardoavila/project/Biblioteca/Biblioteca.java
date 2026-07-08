package ejercicio7.dev.ricardoavila.project.Biblioteca;

public class Biblioteca {

    private String nombre;
    private int capacidadLibros;
    private int librosActuales;
    private boolean abierta;

    public Biblioteca() {
        nombre = nombre;
        capacidadLibros = 0;
        librosActuales = 0;
        abierta = false;
    }

    public Biblioteca(String nombre, int capacidadLibros, int librosActuales, boolean abierta) {
        this.nombre = nombre;
        this.capacidadLibros = capacidadLibros;
        this.librosActuales = librosActuales;
        this.abierta = abierta;
    }

    /*agregarLibro(int cantidad) — incrementa librosActuales sin superar
    capacidadLibros*/
    public void agregarLibro(int cantidad) {
        if (librosActuales + cantidad > capacidadLibros) {
            librosActuales = capacidadLibros;
            System.out.println("Capacidad Maxima alcanzada ");
            return;
        }
        librosActuales += cantidad;
        System.out.println("Libros actuales: "+ librosActuales);
    }

    /*retirarLibro(int cantidad) — decrementa librosActuales sin
    bajar de 0*/
    public void retirarLibro(int cantidad) {
        if (cantidad > librosActuales) {
            librosActuales = 0;
            System.out.println("No hay suficientes libros. Biblioteca vacia");
            return;
        }
        librosActuales -= cantidad;
        System.out.println("Libros actuales: "+ librosActuales);
    }

    /*abrirBiblioteca() — solo abre si hay al menos un libro*/
    public void abrirBiblioteca() {
        if (librosActuales == 0) {
            System.out.println("No se puede abrir. No hay libros.");
            return;
        }
        abierta = true;
        System.out.println("Biblioteca abierta");
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad de libros: " + capacidadLibros);
        System.out.println("Libros actuales: " + librosActuales);
        System.out.println("Espacio disponible: " + (capacidadLibros - librosActuales));
        System.out.println("Abierta: " + abierta);
    }
}
