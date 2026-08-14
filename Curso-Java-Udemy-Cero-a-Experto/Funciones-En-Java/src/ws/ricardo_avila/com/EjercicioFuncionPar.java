package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioFuncionPar {

    // Método para saber si un numeros es par
    public static boolean esPar(int numero) {
//        if (numero % 2 == 0) {
//            return true;
//        }else {
//            return false;
//        }

        // Simplificando el código anterior(if ternario)
        return (numero % 2 == 0) ? true : false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona un valor númerico: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("\nNumero Par?: "+ esPar(numero)); // llamado a la función
    }
}
