package manejoConsola;

import java.util.Scanner;
import java.util.Random;

public class EjercicioGeneradorIdUnico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** Sistema Generador de ID Único ***");

        // solicitamos nombre de usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine().trim();
        String dosLetrasNombre = nombre.substring(0, 2).toUpperCase(); // Obtener las dos primera letra del nombre

        // solicitamos apellido de usuario
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine().trim();
        String dosLetrasApellido = apellido.substring(0, 2).toUpperCase(); // Obtener las dos primera letra del apellido

        // solicitamos año de nacimiento del usuario
        System.out.print("Ingrese su año de nacimiento (YYYY): ");
        String anioNacimiento = scanner.nextLine();
        String dosNumerosAnio = anioNacimiento.substring(0, 2); // Obtener las dos primera letra del año de nacimiento

        // generar un número aleatorio de 4 dígitos
        int valorAleatorio = random.nextInt(9999)+1; // Genera un número aleatorio entre 0 y 999

        // impresion del ID único generado
        String idUnico = """
                %nHola %s
                \tTu nuevo numero de identificación (ID) generado por el sistema es:
                \t%s%s%s%04d
                    Felicidades !!!!
                """.formatted(nombre, dosLetrasNombre, dosLetrasApellido, dosNumerosAnio, valorAleatorio);

        System.out.print(idUnico);

        System.out.printf("""
                %nHola %s,
                \tTu nuevo numero de identificación (ID) generado por el sistema es:
                \t%s%s%s%04d
                \tFelicidades !!!!
                """, nombre, dosLetrasNombre, dosLetrasApellido, dosNumerosAnio, valorAleatorio);

    }
}
