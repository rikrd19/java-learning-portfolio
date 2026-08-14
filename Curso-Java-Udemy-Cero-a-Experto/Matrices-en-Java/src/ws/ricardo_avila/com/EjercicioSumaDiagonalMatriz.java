package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioSumaDiagonalMatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Diagonal Matriz ******");

        try {
            // pedir al usuario el numero de filas y columnas
            System.out.print("Ingresa el numero de fila: ");
            int filas = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el numero de columnas: ");
            int columnas = Integer.parseInt(scanner.nextLine());

            // Crear la matriz dinámica
            int[][] matriz = new int[filas][columnas];

            // Pedir al usuario que ingrese los valores de la matriz
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print("Valor [" + f + "][" + c + "]: ");
                    matriz[f][c] = Integer.parseInt(scanner.nextLine());
                }
            }

            // Suma de la diagonal de la matriz
            int sumaDiagonal = 0;
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    if (f == c) {
                        sumaDiagonal += matriz[f][c];
                    }

                }
            }
            System.out.println("\nSuma diagonal = " + sumaDiagonal);

        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número entero válido.");
        } finally {
            scanner.close();
        }


    }
}
