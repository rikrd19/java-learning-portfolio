package dev.ricardoavila.main;

import dev.ricardoavila.persona.Persona;

public class PruebPersona {
    static void main(String[] args) {

        Persona object1 = new Persona("Abel", "Lopez");
        System.out.println(object1); // automaticamente se llama al método toString() de la clase Persona
    }
}
