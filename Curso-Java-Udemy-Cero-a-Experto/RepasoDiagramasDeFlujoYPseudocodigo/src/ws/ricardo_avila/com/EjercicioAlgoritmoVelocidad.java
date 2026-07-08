package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioAlgoritmoVelocidad {
    public static void main(String[] args) {

        /*
         * 2. Desarrolla un algoritmo que dada la velocidad de un coche en km por hora
         *  (km/hora), la convierta a metros por segundo(m/s).
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la velocidad del coche en km/hora: ");
        double velocidadKmHora = Double.parseDouble(scanner.nextLine());

        double velocidadMetrosSegundo = velocidadKmHora * 1000/3600;

        System.out.println("La velocidad en mts/seg es: " + velocidadMetrosSegundo);
    }
}



