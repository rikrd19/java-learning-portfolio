package persona;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarPerson() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String setNombre(String nombre) {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String setApellido(String apellido) {
        return this.apellido;
    }
}
