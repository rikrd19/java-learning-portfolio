package ws.ricardo_avila.ciclos;

import java.util.Scanner;

public class EjercicioDibujaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Dibuja un Triangulo ****");

        System.out.print("Cuántas filas quieres que tenga el triángulo?: ");
        int numeroFilas = Integer.parseInt(scanner.nextLine());

        // iteramos por cada fila del triangulo
        for (int fila = 1; fila <= numeroFilas; fila++) {

            String espaciosBlanco = " ".repeat(numeroFilas - fila);
            String asteriscos = "*".repeat(2 * fila - 1);

            System.out.println(espaciosBlanco + asteriscos);
        }



        // ejercicio 2: Dibuja un triángulo invertido
        System.out.println("\n" + "=".repeat(45));
        System.out.println("***** Dibuja Triangulo *****");
        System.out.println("=".repeat(45));

        System.out.print("Ingresa las filas a dibujar: ");
        int filasDibujo = Integer.parseInt(scanner.nextLine());

        // iteramos por cada fila del triangulo
        for (int fila = 1; fila <= filasDibujo; fila++) {
            String espaciosBlancos = " ".repeat(filasDibujo - fila);
            String letrasA = "B".repeat(2 * fila -1);
            System.out.println(espaciosBlancos + letrasA);

        }
    }
}
