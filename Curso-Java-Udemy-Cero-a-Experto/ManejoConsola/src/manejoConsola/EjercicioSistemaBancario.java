package manejoConsola;

import java.util.Scanner;

public class EjercicioSistemaBancario {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("*** Sistema Bancario ***");

        boolean salirSistema = false
                ;

        //while (!salirSistema) {
            System.out.print("\nDeseas  salir del Sistema?(true/false): ");
            salirSistema = sca.nextBoolean();

            if (!salirSistema) {
                System.out.print("\nContinuamos dentro del sistema.....");
                //break;
            } else {
                System.out.println("\nSaliendo del sistema.....");
               // break;
          //  }
        }
    }
}
