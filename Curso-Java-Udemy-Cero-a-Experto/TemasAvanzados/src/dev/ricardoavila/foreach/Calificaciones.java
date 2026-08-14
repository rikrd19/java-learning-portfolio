package dev.ricardoavila.foreach;

public class Calificaciones {
    static void main(String[] args) {

        int[] calificaciones = {85, 92, 60, 45, 78, 95, 55};
        double sumaNotas = 0.0;

        for (int nota : calificaciones) {
            String estado;
            if (nota >= 60) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }
            System.out.println("Nota: " + nota + " -> " + estado);
            sumaNotas += nota;
        }
        double promedio = sumaNotas / calificaciones.length;
        System.out.printf("\tEl promedio de las notas es: %.2f%n", promedio);


        System.out.println("\n***** Otra forma de hacerlo *****" + "-".repeat(40) + "\n");

        double sumaNotas1 = 0.0;

        for (int nota : calificaciones) {
            String estado = (nota >= 60) ? "Aprobado" : "Reprobado";
            System.out.println("Nota: " + nota + " -> " + estado);
            sumaNotas1 += nota;
        }

       double promedio1 = sumaNotas / calificaciones.length;
        System.out.printf("El promedio de las notas es: %.2f", promedio);


    }
}