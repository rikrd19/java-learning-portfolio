package sentenciasDeDecisionJava;

import java.util.Scanner;

public class SistemasDeCalificaciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\n***** Sistema de Calificaciones *****");

        System.out.print("Ingrese el numero de calificación entre 0 y 10: ");
        double calificacion = s.nextDouble();

        String resultado = (calificacion >= 9 && calificacion <= 10) ? "\"A\"" :
                (calificacion >= 8 && calificacion < 9) ? "B" :
                        (calificacion >= 7 && calificacion < 8) ? "C" :
                                (calificacion >= 6 && calificacion < 7) ? "D" :
                                        (calificacion >= 0 && calificacion < 6) ? "F" : "Valor Desconocido";

        System.out.println("El número ingresado " + calificacion + " corresponde a la calificación: " + resultado);


        System.out.println("-".repeat(50));
        System.out.println("***** Usando el if/else *****");

        System.out.print("Ingrese el numero de calificación entre 0 y 10: ");
        calificacion = s.nextDouble();

        if (calificacion >= 9 && calificacion <= 10) {
            resultado = "A";
        } else if (calificacion >= 8 && calificacion < 9) {
            resultado = "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            resultado = "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            resultado = "D";
        } else if (calificacion >= 0 && calificacion < 6) {
            resultado = "F";
        } else {
            resultado = "Valor Desconocido";
        }

        System.out.println("El número ingresado " + calificacion + " corresponde a la calificación: " + resultado);

    }
}
