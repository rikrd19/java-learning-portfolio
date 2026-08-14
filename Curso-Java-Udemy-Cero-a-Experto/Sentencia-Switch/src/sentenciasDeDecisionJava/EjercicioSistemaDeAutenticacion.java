package sentenciasDeDecisionJava;

import java.util.Scanner;

public class EjercicioSistemaDeAutenticacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("**** Sistema de Autenticacion ****");

        final String USUARIO_VALIDO = "admin";
        final String PASSWORD_VALIDO = "123";

        System.out.print("Ingresa tu usuario: ");
        String usuario = s.nextLine().strip();

        System.out.print("Ingresa tu password: ");
        String password = s.nextLine().strip();

        // Cada caso de validacion de usuario y password

        String resultado = switch (usuario) {
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password)) {
                    yield "Bienvenido al sistema";
                } else {
                    yield "Usuario o password incorrecto";
                }
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password)) {
                    yield "Usuario o password incorrecto";
                } else {
                    yield "Usuario incorrecto, favor de corregirlo";
                }

            }
        };
        System.out.println(resultado);// imprimir el resultado de la autenticacion
    }

}
