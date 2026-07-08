package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioTransponerUnaMatrizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Transponer una Matriz Cuadrada ****");

        // Solicitar el tamaño de la matriz cuadrada
        System.out.print("Ingrese el numero de filas: ");
        int filas = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el numero de columnas: ");
        int columnas = Integer.parseInt(scanner.nextLine());

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Pedir al usuario que ingrese los valores de la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("Valor [" + f + "][" + c + "]: ");
                matriz[f][c] = Integer.parseInt(scanner.nextLine());

            }
        }

        System.out.println("\nOriginal: ");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTranspuesta: ");
        for (int c = 0; c < columnas; c++) {
            for (int f = 0; f < filas; f++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }


    }
}
