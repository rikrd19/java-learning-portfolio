package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioLlenarYMostrarMatrizDinamica {
    public static void main(String[] args) {

        System.out.println("***** Ejercicio 1:  Llenar y mostrar una matriz dinámica *****");

        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar numero filas y columnas
            System.out.print("Ingrese el número de filas: ");
            int filas = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el número de columnas: ");
            int columnas = Integer.parseInt(scanner.nextLine());

            // Crear la matriz dinámica
            int[][] matriz = new int[filas][columnas];

            // Llenar la matriz con valores dados por el usuario
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print("Ingresa el valor [" + f + "][" + c + "]: ");
                    matriz[f][c] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println();

            // Mostrar los valores de la matriz
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print(matriz[f][c] + "\t");
                }
                System.out.println();
            }

            System.out.println("\n" + "=".repeat(50)); // Salto de línea al dar el resultado
            System.out.println("***** Ejercicio 2:  Sumar filas Individualmente *****");

            // Sumar los valores de cada fila individualmente
            for (int f = 0; f < matriz.length; f++) {
                int sumaFila = 0;

                for (int c = 0; c < matriz[f].length; c++) {
                    sumaFila += matriz[f][c];

                }
                System.out.println("Suma fila " + f + ": " + sumaFila);
            }

        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida. Ingrese solo números enteros.");
        } finally {
            scanner.close();
        }


    }
}
