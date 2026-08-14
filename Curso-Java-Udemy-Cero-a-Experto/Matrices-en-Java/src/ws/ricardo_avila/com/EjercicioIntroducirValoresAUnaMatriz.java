package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioIntroducirValoresAUnaMatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definir la matriz
        System.out.print("Proporciona los filas: ");
        int filas = Integer.parseInt(scanner.nextLine());

        System.out.print("Proporciona los columnas: ");
        int columnas = Integer.parseInt(scanner.nextLine());

        // Definir la matriz
        int[][] matriz = new int[filas][columnas];

        //Solictar los valores de la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("Valor [" + f + "][" + c + "] = ");

                matriz[f][c] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("\n"+ "-".repeat(50)); // Salto de línea al dar el resultado

        // Iterar los valores de la matriz
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Matriz["+ c + "][" +f+ "] = "+ matriz[f][c]);
            }
        }


    }
}
