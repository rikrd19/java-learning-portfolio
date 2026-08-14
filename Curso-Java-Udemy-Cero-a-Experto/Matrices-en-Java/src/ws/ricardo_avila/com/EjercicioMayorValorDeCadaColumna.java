package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioMayorValorDeCadaColumna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar numero filas y columnas
            System.out.print("Ingrese la cantidad de filas: ");
            int filas = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese la cantidad de columnas: ");
            int columnas = Integer.parseInt(scanner.nextLine());

            // Crear la matriz dinámica
            int[][] matriz = new int[filas][columnas];

            // Pedir al usuario que ingrese los valores de la matriz
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print("Valor [" + f + "][" + c + "]:  ");
                    matriz[f][c] = Integer.parseInt(scanner.nextLine());
                }
            }
            int mayorValor = 0;
            for (int c = 0; c < columnas; c++) {
                mayorValor = matriz[0][c]; // asume que el primero de la columna es el mayor
                for (int f = 1; f < filas; f++) {
                    if (matriz[f][c] > mayorValor) {
                        mayorValor = matriz[f][c];
                    }
                }
                System.out.println("Mayor valor columna " + c + ": " + mayorValor);
            }

        } catch (NumberFormatException e) {
            System.out.println("\nNúmero inválido. Ingrese solo números enteros.");
        } finally {
            scanner.close();
        }


    }
}
