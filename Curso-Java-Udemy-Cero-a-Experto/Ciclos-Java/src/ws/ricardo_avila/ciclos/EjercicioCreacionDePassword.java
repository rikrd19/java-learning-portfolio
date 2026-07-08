package ws.ricardo_avila.ciclos;

import java.util.Scanner;

public class EjercicioCreacionDePassword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Creación y Validación de Password ***");

        System.out.print("Ingresa un password (de al menos 6 caracteres): ");
        String password = scanner.nextLine();

        // validar el password
        while (password.length() < 6) {

            System.out.println("El password no cumple con los requisitos." +
                    "Debe tener al menos 6 caracteres.");

            System.out.print("Ingresa un valor de password: ");
            password = scanner.nextLine();
        }

        System.out.println("El valor de password es válido " + password);


        // ejercicio de validacion

        System.out.print("\nIngrese un password de al menos (6 números): ");
        String passwNum = scanner.nextLine();

        while (passwNum.length() < 6) {
            System.out.println("El password no cumlple con los requisitos. " +
                    "Debe tener al menos 6 números.");

            System.out.println("Ingrese un nuevo valor de password: ");
            passwNum = scanner.nextLine();
        }
        System.out.println("El valor de password es válido: " + passwNum);

        // validador de Rango y reintentos
        System.out.println("\n" + "=".repeat(45));
        System.out.println("***** Calificación de Calidad *****");
        System.out.println("=".repeat(45));


        boolean salir = false;
        int contadorIntentos = 0;

        while (!salir) {
            System.out.print("\nIngrese un número decimal (entre 1.0 y 10.0): ");
            double numDecimal = Double.parseDouble(scanner.nextLine());

            if (numDecimal < 1.0 || numDecimal > 10.0) {
                System.out.println("Error.Calificación fuera de rango");

                contadorIntentos++;
                System.out.println("Intentos " + contadorIntentos + " fallidos");
            } else {
                System.out.println("\nNota válida : " + numDecimal);
                System.out.println("Intento " + contadorIntentos + " fallido(s) realizado(s) por el usuario: ");
                salir = true;
            }
        }


        // Sistema de Logine con límite de intentos
        System.out.println("\n" + "=".repeat(45));
        System.out.println("***** Sistema de Login *****");
        System.out.println("=".repeat(45));

        final String PASSWORD_CORRECTO = "Admin123";
        final int MAX_INTENTOS = 3;
        int intentosRealizados = 0;
        boolean accesoConcedido = false;

        while (intentosRealizados < MAX_INTENTOS && !accesoConcedido) {
            System.out.print("Ingrese su password: ");
            String passwordIngresado = scanner.nextLine();
            intentosRealizados++;

            if (passwordIngresado.equals(PASSWORD_CORRECTO)) {
                accesoConcedido = true;
            } else {
                int restantes = MAX_INTENTOS - intentosRealizados;
                if (restantes > 0) {
                    System.out.println("Password Incorrecto. Te quedan " + restantes + "\n");
                }
            }
        }
        // Bloque de decision final (fuera de bucle)
        if (accesoConcedido) {
            System.out.println("\nAcceso Concedido! Bienvenido al sistema.");
        } else {
            System.out.println("\nCuenta Bloqueada por seguridad. Agotaste tus " + MAX_INTENTOS + " intentos.");
        }


         /******** otra forma de resolver el ejercicio Bucle FOR
        (se conoce el limite maximo de intentos) ********/
        System.out.println("\n" + "=".repeat(45));
        System.out.println("***** Sistema de Login *****");
        System.out.println("=".repeat(45));

        final String PASSWORD_CORRECT = "Admin123";
        final int MAX_INTENTO = 3;
        boolean accesConcedido = false;


        // Al saber el límite exacto, un bucle FOR es perfecto aquí
        for (int intento = 1; intento <= MAX_INTENTOS; intento++) {
            System.out.print("Ingrese su password: ");
            String passwordIngresado = scanner.nextLine();

            if (passwordIngresado.equals(PASSWORD_CORRECT)) {
                accesConcedido = true;
                break; // Rompe el bucle inmediatamente, ya no necesitamos seguir preguntando
            }

            // Si llegamos aquí, sabemos que la contraseña fue incorrecta
            int restantes = MAX_INTENTOS - intento;
            if (restantes > 0) {
                System.out.println("Password Incorrecto. Te quedan " + restantes + "\n");
            }
        }
        // Bloque de decisión final
        if (accesConcedido) {
            System.out.println("\nAcceso Concedido! Bienvenido al sistema.");
        } else {
            System.out.println("\nCuenta Bloqueada por seguridad. Agotaste tus " + MAX_INTENTOS + " intentos.");
        }

        // Ejercicio de Contador de Vocales
        System.out.println("\n" + "=".repeat(52));
        System.out.println("***** Contador de Vocales (Lógica de Strings) *****");
        System.out.println("=".repeat(52));

        int contadorVocales = 0;

        System.out.print("Ingresa una palabra para contar las vocales en ella: ");
        String palabra = scanner.nextLine();
        String palabraEnMinuscula = palabra.toLowerCase();

        for (int i = 0; i < palabraEnMinuscula.length();i++) {
            char letra = palabraEnMinuscula.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("la cantidad de vocales en la palabra "+ palabra + " es: " + contadorVocales);


    }
}
