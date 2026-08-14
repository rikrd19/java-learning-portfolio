package manejoConsola;

import java.util.Scanner;

public class EjercicioSistemaAutenticacion {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        final String USUARIO_VALIDO = "admin";
        final String PASSWORD_VALIDO = "1234";

        // solicitar usuario
        System.out.print("Ingresa tu usuario: ");
        String usuarioIngresado = sca.nextLine().trim().toLowerCase();

        // solicitar contraseña
        System.out.print("Ingresa tu contraseña: ");
        String passwordIngresada = sca.nextLine().trim().toLowerCase();

        if (usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresada.equals(PASSWORD_VALIDO)) {
            System.out.println("Usuario y Password correctos, puedes acceder");
        } else {
            System.out.println("Usuario o Password incorrectos, no puedes acceder");
        }

        System.out.println("-".repeat(50));
        boolean datosCorrectos = usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresada.equals(PASSWORD_VALIDO);
        System.out.println("Datos son correctos?:  " + datosCorrectos);
    }
}
