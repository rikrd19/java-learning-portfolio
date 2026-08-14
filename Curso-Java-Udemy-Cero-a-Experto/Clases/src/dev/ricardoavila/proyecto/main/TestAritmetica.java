package dev.ricardoavila.proyecto.main;

import dev.ricardoavila.proyecto.aritmetica.Aritmetica;

public class TestAritmetica {

    public static void main(String[] args) {
        System.out.println("\n**** Creación de la Clase Aritmetica ****");

        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());

        // Modificar el valor Operando1 utilizando el setter
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);

        aritmetica1.sumar();
        aritmetica1.restar();


        System.out.println("-".repeat(40));

        // Creacion de segundo objeto de la clase Aritmetica
        Aritmetica aritmetica2 = new Aritmetica(10, 15);

        aritmetica2.sumar();
        aritmetica2.restar();
    }

}
