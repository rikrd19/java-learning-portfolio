package ws.ricardo_avila.com;

public class Matrices {
    public static void main(String[] args) {

        // Definir una matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {11, 8, 10}
        };
        System.out.println("--- Matriz 3x3 ---");

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }

        // Definir una matriz
        // int[][] matriz = new int[3][2];
        int[][] matriz2 = new int[2][3];

        System.out.println("\n" + "-".repeat(50) + "\n");

        // Modificar los valores de la matriz
        matriz2[0][0] = 100;
        matriz2[0][1] = 200;
        matriz2[0][2] = 300;
        matriz2[1][0] = 400;
        matriz2[1][1] = 500;
        matriz2[1][2] = 600;

        // Acceder a los valores
        System.out.println("Valor 1 [0][0] = " + matriz2[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz2[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz2[1][2]);

        System.out.println("\n" + "-".repeat(50) + "\n");

        // Modificar un valor específico
        matriz2[0][0] = 800;
        System.out.println("Valor 1 [0][0] = " + matriz2[0][0]);

        System.out.println("\n" + "-".repeat(50) + "\n");
        //Definir una matriz
        final int FILAS = 2;  // filas
        final int COLUMNAS = 3;

        int[][] matriz3 = new int[FILAS][COLUMNAS];

        // Modificar los valores de la matriz
        // Modificar los valores de la matriz
        matriz3[0][0] = 100;
        matriz3[0][1] = 200;
        matriz3[0][2] = 300;
        matriz3[1][0] = 400;
        matriz3[1][1] = 500;
        matriz3[1][2] = 600;

        // Recorrer una matriz
        // 1. Ciclo mas externo. Recorrer los reglones
        for (int f = 0; f < FILAS; f++) {
            // 2. Ciclo mas interno. Recorrer las columnas
            for (int c = 0; c < COLUMNAS; c++) {
                System.out.println("Valor[" + f + "][" + c + "] = " + matriz3[f][c]);
            }

        }

    }

}

