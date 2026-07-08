package dev.ricardoavila.persona;

public class Main {
    static void main(String[] args) {

        System.out.println("**** Creación de Clase y Objetos Persona ****");
        System.out.println("Variable estática " + Persona.getContadorPersonas());

        Persona objeto1 = new Persona("Layla", "García");
        System.out.println(objeto1);
        System.out.println("Variable estática " + Persona.getContadorPersonas());

        // Segundo objeto
        Persona objeto2 = new Persona("Amanda", "Garcia");
        System.out.println(objeto2);
        System.out.println("Variable estática " + Persona.getContadorPersonas());
    }
}

