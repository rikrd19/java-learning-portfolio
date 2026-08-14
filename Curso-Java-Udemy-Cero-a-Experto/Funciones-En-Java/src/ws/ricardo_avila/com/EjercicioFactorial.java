package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioFactorial {

    public static long factorial(int n) {
        if (n < 0) {
            return -1; // Indica que el factorial no está definido para números negativos
        }

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Numero Factorial *****");

        System.out.println("Ingrese un número: ");
        int n = Integer.parseInt(scanner.nextLine());

        long resultado = factorial(n);
        if (resultado == -1) {
            System.out.println("El numero debe ser positivo");
        } else {
            System.out.println("Factorial: " + resultado);
        }


    }
}
