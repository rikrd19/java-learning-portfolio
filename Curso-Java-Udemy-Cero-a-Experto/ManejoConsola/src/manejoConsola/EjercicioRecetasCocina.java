package manejoConsola;

import java.util.Scanner;

public class EjercicioRecetasCocina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n*** Recetas de Cocina ***\n");

        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = scanner.nextLine();

        System.out.print("Ingresa los ingredientes (seguidos de comas): ");
        var ingredientes = scanner.nextLine();

        System.out.print("Tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(scanner.nextLine());

//       scanner.nextLine();  // se comenta porque ya se consume el salto de línea en la línea anterior
        //porque se hace el paraseInt
        System.out.print("Ingresa la dificultad: ");
        var dificultad = scanner.nextLine();

        System.out.println("\n---- Receta de Cocina ----");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultad);


    }
}
