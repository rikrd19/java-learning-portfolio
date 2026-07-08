package dev.ricardoavila.persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;


    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Asignamos el id unico con ayuda de la variable estatica
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "id: " + this.idPersona +
                ", Nombre: " + this.nombre +
                ", Apellido: " + this.apellido +
                ", Dir. Mem. " + super.toString();
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }
}
