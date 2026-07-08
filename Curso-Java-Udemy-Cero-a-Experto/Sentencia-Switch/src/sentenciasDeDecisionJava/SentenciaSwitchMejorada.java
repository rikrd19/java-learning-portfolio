package sentenciasDeDecisionJava;

import java.util.Scanner;

public class SentenciaSwitchMejorada {
    public static void main(String[] args) {

        System.out.println("\n***** Sistema de Estacion Del Año *****");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporcione el valor del mes(1-12): ");
        int mes = Integer.parseInt(scanner.nextLine());

        switch (mes) {
            case 1, 2, 12 -> System.out.println("El número " + mes + " corresponde a la estación Invierno");
            case 3, 4, 5 -> System.out.println("El numero " + mes + " corresponde a la estación Primavera");
            case 6, 7, 8 -> System.out.println("El nùmero " + mes + " corresponde a la estación Verano");
            case 9, 10, 11 -> System.out.println("El número " + mes + " corresponde a la estación Otoño");
            default -> System.out.println("El número " + mes + " Estación Desconocida");
        }
    }
}
