package manejoConsola;

import java.util.Scanner;

public class EjercicioEstacionDelAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n****** Identifica la Estacion del Año ******");

        System.out.print("\nPara saber la estacion ingrese el valor numerico del mes (1 - 12): ");
        int mes = scanner.nextInt();

        String estacion = (mes == 1 || mes == 2 || mes == 12) ? "La estacion para el mes" + mes+ " es Invierno" :
                (mes == 3 || mes == 4 || mes == 5) ? "La estacion para el mes " + mes+ " es  Primavera" :
                (mes == 6 || mes == 7 || mes == 8) ? "La estacion para el mes " + mes+ " es Verano" :
                (mes == 9 || mes == 10 || mes == 11) ? "La estacion para el mes " + mes+ " es  Otoño" : "La estacion para el mes " + mes+ " es Estacion Desconocida";


        System.out.println(estacion);

    }

}
