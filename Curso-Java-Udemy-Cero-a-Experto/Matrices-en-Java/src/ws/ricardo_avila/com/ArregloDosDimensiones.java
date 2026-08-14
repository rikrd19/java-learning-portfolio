package ws.ricardo_avila.com;

public class ArregloDosDimensiones {
    public static void main(String[] args) {

        System.out.println("** Matriz 2x3 **");
        //Definir una matriz
        int[][] matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };
        // Recorrer una matriz
        // 1. Ciclo mas externo. Recorre las filas
        for (int f = 0; f < matriz.length; f++) {
            // 2. Ciclo interno. Recorre las columnas
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println("Valor [" + f + "][" + c + "] = " + matriz[f][c]);
            }
        }
    }
}
