package ws.ricardo_avila.ciclos;

import java.util.Scanner;

public class EjercicioAplicacionCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Aplicacion Calculadora ****");

        boolean salir = false;
        double num1 = 0.0, num2 = 0.0, resultado = 0.0;

        while (!salir) {
            System.out.print("""
                    \n***** Calculadora en Java *****
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");
            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Dame el valor 1: ");
                num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Dame el valor 2: ");
                num2 = Double.parseDouble(scanner.nextLine());
            }

            switch (opcion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.printf("Resultado suma: %.2f%n", resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.printf("Resultado resta: %.2f%n", resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.printf("Resultado multiplicación: %.2f%n", resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado división: %.2f%n", resultado);
                    } else {
                        System.out.println("Error: División entre cero");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, selecciona otra opción....");
            }
        }
    }
}
