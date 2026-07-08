package ws.ricardo_avila.ciclos;

import java.util.Scanner;

public class EjercicioAdministracionCuentas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.print("""
                    \n***** Sistema de Administración de Cuentas *****
                    Menu:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    
                    Escoje una opción:\s""");
            int opcion = Integer.parseInt(scanner.nextLine());

            // Evaluar cada opción
            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta...");
                case 2 -> System.out.println("Eliminando tu cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                    salir = true; // Cambiamos la condición para salir del ciclo
                }
                default -> System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }


        }

    }

}
