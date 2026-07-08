package manejoConsola;

import java.util.Scanner;

public class EjercicioCasaEspejos {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.print("**** Casa de los Espejos ****");

        System.out.print("\nTienes menos de 10 años?(true/false): ");
        boolean edad = sca.nextBoolean();

        System.out.print("Tienes miedo a la oscuridad?(true/false): ");
        boolean miedoOscuridad = sca.nextBoolean();

        if (!edad && !miedoOscuridad) {
            System.out.println("\nPuedes entrar a la Casa de los Espejos !!");
        }else {
            System.out.println("\nLo siento la Casa de los Espejos podria darte miedo!!");
        }

    }
}
