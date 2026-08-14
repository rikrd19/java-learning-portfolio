package manejoConsola;

import java.util.Scanner;

public class EjercicioSistemaPrestamoLibros {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("*** Sistema de Préstamo de Libros ***");
        int distanciaMaximaEnKm = 3; // distancia máxima en km para poder solicitar el préstamo

        System.out.print("Tiene credencial de estudiante? (true/false): ");
        boolean tieneCredencial = sca.nextBoolean();

        System.out.print("A que distacia de la biblioteca vives?: ");
        int viveCercaBibioteca = sca.nextInt();

        if (tieneCredencial == true || viveCercaBibioteca <= distanciaMaximaEnKm) {
            System.out.print("Puedes solicitar el préstamo de libros");

        } else {
            System.out.println("Lo sentimos, no cumples con los requisitos para solicitar el préstamo de libros");
        }

    }
}
