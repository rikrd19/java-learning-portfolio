package manejoConsola;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumeroAleatorios {
    public static void main(String[] args) {

        System.out.println("*** Numeros Aleatorios ***");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // generar un numero aleatorio entre 0 y 9
        int numeroAleatorio = random.nextInt(10);
        System.out.println("Numero aleatorio entre 1 y 9: " + numeroAleatorio);

        // generar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("Numero aleatorio entre 1 y 10: " + numeroAleatorio);

        // generar un numero aleatorio entre 1 y 20
        numeroAleatorio = random.nextInt(20) + 1;
        System.out.println("Numero aleatorio entre 1 y 20: " + numeroAleatorio);

        //generar un numero flotante entre 0.0 y 1.0
        float flotanteAleatorio = random.nextFloat();
        System.out.println("Flotante entre 0.0 y 1.0: " + flotanteAleatorio);

        //generar un numero flotante entre 0.0 y 8.0
        float floatAleatorio2 = random.nextFloat(8.0f) + 1.0f;
        System.out.printf("Flotante aleatorio2 entre 0 y 8 = %.2f%n ", floatAleatorio2);

        // simular el lanzamiento de un dado(1 y 6)
        int lanzamientoDado = random.nextInt(6) + 1;
        System.out.println("Resultado al lanzar el dado = " + lanzamientoDado);

        // ejercicios de practica con la clase Random
        /* 1.Crea un programa que simule lanzar el dado de 6 caras 10 veces
            y muestre los resultados y al final indica cuantas veces salio el numero 6.  */
        System.out.println("-".repeat(50));

        int contadorSeis = 0;

        for (int i = 1; i <= 10; i++) {
            lanzamientoDado = random.nextInt(6) + 1;
            System.out.println("Nro. lanzamiento dado[" + i + "] = " + lanzamientoDado);

            if (lanzamientoDado == 6) {
                contadorSeis++;
            }
        }
        System.out.println("\nEl número 6 salió = " + contadorSeis + " veces");

        System.out.println("-".repeat(50));
        /* 2. Crea un generador de contraseñas aleatorias de exactamente 8 caracteres.
         la contraseña debe contener:
         • 2 letras mayúsculas (A-Z)
         • 2 letras minúsculas (a-z)
         • 2 digitos (0-9) .
         • 2 caracteres especiales @, #, $, %        */

        String mayusculas = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String minusculas = ("abcdefghijklmnopqrstuvwxyz");
        String digitos = ("0123456789");
        String caracteresEspeciales = ("@#$%");

        List<Character> password = new ArrayList<>();

        // Agregar 2 letras mayúsculas aleatorias
        for (int i = 0; i < 2; i++) {
            password.add(mayusculas.charAt(random.nextInt(mayusculas.length())));
        }
            // Agregar 2 letra        }s minúsculas aleatorias
            for (int i = 0; i < 2; i++) {
                password.add(minusculas.charAt(random.nextInt(minusculas.length())));
            }

            // Agregar 2 dígitos aleatorios
            for (int i = 0; i < 2; i++) {
                password.add(digitos.charAt(random.nextInt(digitos.length())));
            }

            // Agregar 2 caracteres especiales aleatorios
            for (int i = 0; i < 2; i++) {
                password.add(caracteresEspeciales.charAt(random.nextInt(caracteresEspeciales.length())));
            }

            // Mezclar todos los caracteres
            Collections.shuffle(password, random);

            // Convertir lista a String
            StringBuilder resultado = new StringBuilder();
            for (char c : password) {
                resultado.append(c);
            }

            System.out.println("Contraseña generada: " + resultado);


//Contraseña generada: p6RrN#9$
//Contraseña generada: $5x8Wn$N
//Contraseña generada: nPa#9%8N
//Contraseña generada: @x3#X7La

            System.out.println("-".repeat(50));
/* 3.Simulador de loteria (Avanzado)
simula un sorteo de loteria donde:
• Se generan 6 números aleatorios entre 1 y 49
• Los numeros deben estar ordenados de menor a mayor
• El usuario apuesta por 6 numeros (puedes hardcodearlos o pedirlos por consola)
• Muestra cuantos aciertos tuvo el usuario.

NO pueden repetirse los numeros en el sorteo.
Usar Random u estructuras de datos apropiadas.
 */

            // ====== GENERAR NUMEROS GANADORES ======
            Set<Integer> numerosGanadores = new TreeSet<>(); //TreeSet ordena los numeros automaticamente

            while (numerosGanadores.size() < 6) {
                int numero = random.nextInt(49) + 1; // Genera un número entre 1 y 49
                numerosGanadores.add(numero); // El Set se encargará de evitar duplicados automáticamente
            }
            System.out.println("Numeros ganadores: " + numerosGanadores);


            // ===== PEDIR APUESTA DEL USUARIO =====
            Set<Integer> apuestaUsuario = new TreeSet<>();

            System.out.println("Ingresa tus 6 numeros (1-49): ");
            while (apuestaUsuario.size() < 6) {
                System.out.println("Numero " + (apuestaUsuario.size() + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero < 1 || numero > 49) {
                    System.out.println("Numero fuera de rango.Intenta de nuevo");
                } else if (!apuestaUsuario.add(numero)) {
                    System.out.println("Numero repetido. Intenta de nuevo");
                }
            }

            System.out.println("\nTu apuesta: " + apuestaUsuario);

            // ====== CALCULAR ACIERTOS ======
            Set<Integer> aciertos = new TreeSet<>(numerosGanadores);
            aciertos.retainAll(apuestaUsuario); // Interseccion de conjuntos

            System.out.println("\n Numeros acertados: " + aciertos);
            System.out.println("Total aciertos: " + aciertos.size());

            // Mensaje segun aciertos
            switch (aciertos.size()) {
                case 6 -> System.out.println("¡Felicidades! ¡Ganaste el premio mayor!");
                case 5 -> System.out.println("¡Excelente! ¡Ganaste un premio grande!");
                case 4 -> System.out.println("¡Muy bien! ¡Ganaste un premio mediano!");
                case 3 -> System.out.println("¡Bien! ¡Ganaste un premio pequeño!");
                default -> System.out.println("Lo siento, no ganaste esta vez. ¡Intenta de nuevo!");
            }

            scanner.close();
    }
}