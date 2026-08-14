package com.ricardoavila.project.projecto;

public class Persona {

    //Atributos
    String nombre;
    String apellido;

    // Metodo
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

    }

    public class Main {
        public static void main(String[] args) {

            System.out.println("***** Creacion de Clase y Objetos Persona ******");

            // Creacion de primer objeto de la clase Persona
            Persona objeto1 = new Persona();
            objeto1.nombre = "Layla";
            objeto1.apellido = "Acosta";

            objeto1.mostrarPersona();

            System.out.println("-".repeat(40));

            // Creacion de segundo objeto de la clase Persona
            Persona objeto2 = new Persona();
            objeto2.nombre = "Roberto";
            objeto2.apellido = "Cortes";

            objeto2.mostrarPersona();

            System.out.println("-".repeat(40));

            // Creacion de tercer objeto de la clase Persona
            Persona objeto3 = new Persona();
            objeto3.nombre = "Sara";
            objeto3.apellido = "Timana";

            objeto3.mostrarPersona();

            System.out.println("-".repeat(40));
            // Creacion de objeto la clase Persona
            Persona objeto4 = new Persona();
            objeto4.nombre = "Carlos";
            objeto4.apellido = "Alvarez";

            objeto4.mostrarPersona();


        }
    }

}

