package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioIntroducirValoresArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Introducir valores a un arreglo ******");

        // Declarar el arreglo 
        System.out.print("Proporcione el largo del arreglo: ");
        int largoArreglo = Integer.parseInt(scanner.nextLine());

        // Crear de manera dinámica el arreglo
        int[] enteros = new int[largoArreglo];

        // Solicitar los valores del arreglo
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingresa enteros[" + (i) + "] = ");
            enteros[i] = Integer.parseInt(scanner.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del arreglos: ");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros[" + (i + 1) + "] = " + enteros[i]);
        }
        System.out.println("\n" + "-".repeat(60));
        System.out.println("--- Listas de Notas ---\n");

        // Arreglo de notas
        System.out.print("Ingrese el número total de notas: ");
        int cantidadNotas = Integer.parseInt(scanner.nextLine());

        // Creacion Arreglo dinámico
        double[] notas = new double[cantidadNotas];

        // Solicitar las notas al usuario
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota [" + i + "]: ");
            notas[i] = Double.parseDouble(scanner.nextLine());
        }

        // imprimir las notas ingresadas
        System.out.println("\nNotas Ingresadas");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("nota[" + i + "] = " + notas[i]);
        }
    }
}
