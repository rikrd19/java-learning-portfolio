package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioAnalistaTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Analista de Temperaturas *****");

        int diasTemperaturas = 0;

        while (true) {
            // Solicitar los dias de registro de temperaturas
            System.out.print("\nIngrese los dias a registrar: ");
            diasTemperaturas = Integer.parseInt(scanner.nextLine());

            if (diasTemperaturas == 0){
                System.out.println("¡Error!: Ingresa un dia diferente a 0");
            } else {
                break;
            }
        }

        // Crear arreglo dinamico para almacenar las temperaturas
        double[] temperaturas = new double[diasTemperaturas];

        double sumaTemperaturas = 0.0;
        double max =  temperaturas[0];
        double min = temperaturas[0];

        // Solicitar las temperaturas al usuario
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingresa temperatura [" + i + "]: ");
            temperaturas[i] = Double.parseDouble(scanner.nextLine());

            sumaTemperaturas += temperaturas[i];

            if (i == 0) {
                max = temperaturas[i];
                min = temperaturas[i];
            }else{
                if (temperaturas[i] > max) {
                    max = temperaturas[i];
                }
                if (temperaturas[i] < min) {
                    min = temperaturas[i];
                }
            }

        }
        System.out.printf("El promedio de las temperaturas es: %.2f%n", sumaTemperaturas / temperaturas.length);
        System.out.println("La temperatura mas alta registrada es: " + max);
        System.out.println("La temperatura mas baja registrada es: " + min);


    }
}
