package matrizSpiral_5x5;

public class MatrizSpiral_5x5 {

    public static void main(String[] args) {

        int n = 5;

        String[][] matrix = new String[n][n];

        int a = 0;
        int b = n - 1;
        int valor = 1;


        for (int j = 0; j < matrix.length; j++) {


            // Llenar la fila superior de izquierda a derecha ⬆️
            for (int i = a; i <= b; i++) {
                matrix[a][i] = valor++ + " \u2192 \t";

            }

            // Llenar la columna del extremo derecho ⬇️
            for (int i = a + 1; i <= b; i++) {
                matrix[i][b] = valor++ + " \u2193 \t";
            }

            // Llenar la fila inferior de derecha a izquierda ⬅️
            for (int i = b - 1; i >= a; i--) {
                matrix[b][i] = valor++ + " \u2190 \t";

            }

            // Llenar la columna del extremo izquierdo de abajo hacia arriba ⬆️
            for (int i = b - 1; i >= a + 1; i--) {
                matrix[i][a] = valor++ + " \u2191 \t";
            }

            a++;
            b--;

        } //End the for main loop

        // print the matrix
        for (int f = 0; f < matrix.length; f++) {
            for (int i = 0; i < matrix[f].length; i++) {
                System.out.print(matrix[f][i]);
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}