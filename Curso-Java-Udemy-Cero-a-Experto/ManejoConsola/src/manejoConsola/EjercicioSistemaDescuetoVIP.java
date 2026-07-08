package manejoConsola;

import java.util.Scanner;

public class EjercicioSistemaDescuetoVIP {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("*** Sistema de Descuento VIP ***");

        System.out.print("Cuántos productos ha comprado?: ");
        int cantidadProdictos = sca.nextInt();

        System.out.print("Cuenta con membresia(true/false): ");
        boolean tieneMembresia = sca.nextBoolean();

        if (cantidadProdictos >= 10 && tieneMembresia == true) {
            System.out.println("Felicidades! tienes acceso a un descuento VIP");
        } else {
            System.out.println("Lo sentimos, no tienes membresia y/o no comprastes más de 10 productos");
        }
    }
}
