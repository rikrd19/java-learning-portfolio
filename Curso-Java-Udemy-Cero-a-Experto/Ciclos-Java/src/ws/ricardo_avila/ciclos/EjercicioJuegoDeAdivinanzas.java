package ws.ricardo_avila.ciclos;

import java.util.Random;
import java.util.Scanner;

public class EjercicioJuegoDeAdivinanzas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Juego de Adivinanzas ****");

        Random numeroRandom = new Random();
        int numeroSecreto = numeroRandom.nextInt(50) + 1; // Genera un número aleatorio entre 1 y 50

        final int INTENTOS_MAXIMOS = 5;
        int numeroAdivinado = 0;
        int contadorIntentos = 0;

        while (numeroAdivinado != numeroSecreto && contadorIntentos < INTENTOS_MAXIMOS) {
            System.out.print("Ingrese un número entero entre 1 y 50: ");
            numeroAdivinado = Integer.parseInt(scanner.nextLine());

            // ayuda al jugador
            if (numeroAdivinado < numeroSecreto) {
                System.out.println("El numero es MAYOR");
            } else if (numeroAdivinado > numeroSecreto) {
                System.out.println("El numero es MENOR");
            }
            // incrementamos el contador de intentos
            contadorIntentos++;
        }
        if (numeroAdivinado == numeroSecreto) {
            System.out.printf("Felicidades adivinaste el número secreto!: %d%n", numeroSecreto);
            System.out.printf("Intentos realizados: %d%n", contadorIntentos);
        }else{
            System.out.printf("Lo siento excediste los %d intentos Maximos. Total intentos: %d%n", INTENTOS_MAXIMOS, contadorIntentos);
            System.out.println();
        }
            






















        /*final int INTENTOS_MAXIMOS = 5;
        Random numeroRandom = new Random();
        int numeroSecreto = numeroRandom.nextInt(50) + 1;

        int contadorIntentos = 0;
        int numeroIngresado = 0;

        while (numeroIngresado != numeroSecreto && contadorIntentos < INTENTOS_MAXIMOS) {

            System.out.print("Ingrese un número entero entre 1 y 50 para adivinarlo: ");
            numeroIngresado = Integer.parseInt(scanner.nextLine());
            contadorIntentos++;

            // ayuda para orientar la jugador
            if (numeroIngresado < numeroSecreto) {
                System.out.println("\nEl número secreto es MAYOR");
            } else if (numeroIngresado > numeroSecreto) {
                    System.out.println("\nEl número secreto es MENOR");
            }
            //incrementamos el contador de intentos
           // contadorIntentos++;

        }
        // Conclusion del juego
        if (numeroIngresado == numeroSecreto) {
            System.out.println("\nFelicidades! Adivinaste el número secreto!");
            System.out.println("Intentos realizados " + contadorIntentos);
        } else {
            System.out.printf("Lo siento, has agotado tus intentos maximos: %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El número secreto era: %d%n", numeroSecreto);
        }*/


    }
}
