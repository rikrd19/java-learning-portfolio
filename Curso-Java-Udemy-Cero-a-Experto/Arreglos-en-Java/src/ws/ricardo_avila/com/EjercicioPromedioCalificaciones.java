package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioPromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Promedio de Calificaciones ****\n");

        // pedir al usuario el número de calificaciones
        System.out.print("Cuántas Calificaciones deseas agregar?: ");
        int cantidadCalificaciones = Integer.parseInt(scanner.nextLine());

        // crear arreglo dinamico almacenar calificaciones
        double[] calificaciones = new double[cantidadCalificaciones];
        double sumaCalificaciones = 0.0;

        // solcitar ingreso calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese calificación [" + i + "]: ");
            calificaciones[i] = Double.parseDouble(scanner.nextLine());

            //promedio calificaciones
            sumaCalificaciones += calificaciones[i];

        }
        // calcular el promedio
        double promedio = sumaCalificaciones / cantidadCalificaciones;
        System.out.printf("\nPromedio de las calificaciones: %.2f%n", promedio);


    }
}
