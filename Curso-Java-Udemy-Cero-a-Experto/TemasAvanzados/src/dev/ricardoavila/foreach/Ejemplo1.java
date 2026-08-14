package dev.ricardoavila.foreach;

public class Ejemplo1 {
    static void main(String[] args) {
        System.out.println("\n**** Ejercicio 1 ****\n");
        String[] productos = {"platos", "vasos", "cucharas", "jarras", "servilleteros"};


        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }

        System.out.println("\n**** Ejercicio 2 ****\n");

        int[] numeros = {5, 12, 3, 8, 20, 1, 15};
        int suma = 0;

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
            suma += numero;
        }
        System.out.println("Suma Total = " + suma);


        System.out.println("\n**** Ejercicio 3 ****\n");

        String[] nombres = {"Ana", "Calos", "Maria", "Pedro", "Laura"};

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre.toUpperCase());
        }

    }

}
