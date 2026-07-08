package dev.ricardoavila.persona;

public class Persona extends Object {

    protected String nombre;
    protected String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", \nApellido: " + this.apellido + ","
                + "\nDir. Memoria " + super.toString(); // super.toString() llama al método toString() de la clase Object
    }
}
