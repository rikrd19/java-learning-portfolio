package ws.ricardo_avila.ciclos;

import java.util.Scanner;

public class EjercicioAplicacionCajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoActual = 1000.00;
        boolean salir = false;

        //menu de aplicacion
        while (!salir) {
            System.out.print("""
                    \n***** Aplicación de Cajero Automático *****
                    Operaciones que puedes realizar:
                      1. Consultar Saldo
                      2. Retirar
                      3. Depositar
                      4. Salir
                      Escoge una opción:\s""");

            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                System.out.printf("Tu saldo actual es: $%.2f%n", saldoActual);
            } else if (opcion == 2) {
                System.out.print("Ingrese el monto a retirar: ");
                double montoRetirar = Double.parseDouble(scanner.nextLine());

                if (montoRetirar > saldoActual) {
                    System.out.printf("NO cuentas con el saldo suficiente. Saldo actual es: $%.2f%n", saldoActual);
                } else {
                    saldoActual -= montoRetirar;
                    System.out.printf("Tu nuevo saldo es: $%.2f%n", saldoActual);
                }
            } else if (opcion == 3) {
                System.out.print("Ingresa el monto a depositar: ");
                double deposito = Double.parseDouble(scanner.nextLine());

                saldoActual += deposito;
                System.out.printf("Tu nuevo saldo actual es: $%.2f%n", saldoActual);
            } else if (opcion == 4) {
                System.out.println("Saliendo del cajero automático. Hasta pronto!");
                salir = true;
            } else {
                System.out.println("Opción Inválida. Selecciona otra opción");
            }
        }
    }
}
