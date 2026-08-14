package manejoConsola;

import java.util.Scanner;

public class EjercicioMayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("\n***** Numero Mayor de Dos Numeros *****");

System.out.print("Ingrese el primer número: ");
int num1 = scanner.nextInt();

System.out.print("Ingrese el segundo número: ");
int num2 = scanner.nextInt();
 
String resultado = (num1 > num2) ? "El número " + num1 + " es mayor que " + num2 :
                   (num2 > num1) ? "El número " + num2 + " es mayor que " + num1 :
                   "Ambos números son iguales";

System.out.println(resultado);

        
    }
}
