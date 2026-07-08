package dev.ricardoavila.argumentosvariables;

public class ArgumentosVariables {

    static void main(String[] args) {

        imprimirNumeros(1, 2, 3, 4, 5, 6, 7, 8); // varargs = argumentos variables

        variosParametros("Ricardo", 30, "Programador", "Java", "Python", "C++");

        parametrosVarios("Juana", 10, 20, 30, 40, 50);

    }

    static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    static void variosParametros(String nombre, int edad, String... programas) {
        System.out.println("\nNombre: " + nombre + " Edad: " + edad);
        for (int i = 0; i < programas.length; i++) {
            System.out.print(programas[i] + " ");
        }

    }
    static void parametrosVarios(String nombre, int... numeros){
        System.out.println("\nNombre: " + nombre);
            imprimirNumeros(numeros);

    }
}


