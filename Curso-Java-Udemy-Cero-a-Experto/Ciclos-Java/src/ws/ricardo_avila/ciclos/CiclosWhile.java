package ws.ricardo_avila.ciclos;

import java.util.Random;
import java.util.Scanner;

public class CiclosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Ciclo While ******");

        int count = 1;
        while (count <= 7) {
            System.out.println(count++); // contador++ tambien funciona incrementar al momento de imprimir

            // contador++; // Incrementamos el contador en cada iteración
        }


        System.out.println("**** Números Pares del 0 al 20 ****");

        int contador = 0;

        while (contador <= 20) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;


            System.out.println("*** Ejercicios de Practica ***");

            System.out.println("\n" + "=".repeat(50));
            System.out.println("Ejercicio 1: Validación de Entrada (Básico)");
            System.out.println("=".repeat(50));


            final int CONTRASENA_CORRECTA = 9999;
            int intentos = 0;
            int contadorIntentos = 0;

            while (true) {
                System.out.print("Ingrese una contraseña de 4 digitos: ");
                int passwordIngresado = scanner.nextInt();
                intentos++;

                if (passwordIngresado == CONTRASENA_CORRECTA) {
                    break;
                }
                System.out.println("Contraseña incorrecta. Intentos " + intentos);
            }
            System.out.println("¡Acceso concedido! Contraseña correcta en " + intentos + " intentos.");


            System.out.println("\n" + "=".repeat(50));
            System.out.println("Ejercicio 2: Menú Interactivo (Intermedio)");
            System.out.println("=".repeat(50));

            int opcion = 0;

            while (true) {
                System.out.print("""
                        ==== CALCULADORA ====
                        1.Sumar
                        2.Restar
                        3.Multiplicar
                        4.Dividir
                        0.Salir
                        
                        Seleccione opción (0-4):\s""");

                opcion = scanner.nextInt();

                if (opcion == 0) {
                    System.out.println("¡Hasta luego!");
                    break;
                } else if (opcion < 0 || opcion > 4) {
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción entre 0 y 4.\n");
                    continue; // Volver al inicio del ciclo para solicitar una opción válida

                }

                System.out.print("Ingrese primer número:  ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese segundo número:  ");
                double num2 = scanner.nextDouble();

                if (opcion == 1) {
                    double resultado = num1 + num2;
                    System.out.println("\nResultado: " + resultado + "\n");
                } else if (opcion == 2) {
                    double resultado = num1 - num2;
                    System.out.println("\nResultado: " + resultado + "\n");
                } else if (opcion == 3) {
                    double resultado = num1 * num2;
                    System.out.println("\nResultado: " + resultado + "\n");
                } else if (opcion == 4) {
                    if (num2 == 0) {
                        System.out.println("\n¡NO se puede dividir entre 0!\n");
                    } else {
                        double resultado = num1 / num2;
                        System.out.println("\nResultado: " + resultado + "\n");
                    }
                }

            }


            System.out.println("\n" + "=".repeat(50));
            System.out.println(" Ejercicio 3: Juego de Adivinanza con Pistas (Avanzado)");
            System.out.println("=".repeat(50));

            Random random = new Random();

            final int NUMERO_ALEATORIO = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
            final int MAX_INTENTOS = 7;

            System.out.print("\n¡Adivina el número entre 1 y 100!: ");
            System.out.println("Tienes " + MAX_INTENTOS + " intentos.");

            int intentosRealizados = 0;
            boolean adivinado = false;

            while (intentosRealizados < MAX_INTENTOS && !adivinado) {
                intentosRealizados++;

                System.out.printf("Intento %d de %d: ", intentosRealizados, MAX_INTENTOS);
                int numeroIngresado = scanner.nextInt();

                // validar rango
                if (numeroIngresado < 1 || numeroIngresado > 100) {
                    System.out.println("Número fuera de rango (1-100)");
                    continue;
                }

                // Dar pista
                if (numeroIngresado == NUMERO_ALEATORIO) {
                    adivinado = true;
                } else if (numeroIngresado < NUMERO_ALEATORIO) {
                    System.out.println("El número es Mayor  ");
                } else {
                    System.out.println("El número es Menor  ");
                }
            }

            // Resultado final(fuera del while)
            if (adivinado) {
                System.out.println("\n¡Felicidades! Has adivinado el número " + intentosRealizados);
            } else {
                System.out.println("\n¡GAME OVER! El número era: " + NUMERO_ALEATORIO);
            }
        }
    }
}