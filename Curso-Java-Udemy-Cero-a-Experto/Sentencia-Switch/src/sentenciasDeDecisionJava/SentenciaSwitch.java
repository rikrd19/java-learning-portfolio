package sentenciasDeDecisionJava;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n**** Dia de la Semana ****");

        System.out.print("Ingrese un numero del 1 al 7 para conocer el dia de la semana: ");
        int dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El numero " + dia + " corresponde al dia Lunes");
                break;
            case 2:
                System.out.println("El numero " + dia + " corresponde al dia Martes");
                break;
            case 3:
                System.out.println("El numero " + dia + " corresponde al dia Miercoles");
                break;
            case 4:
                System.out.println("El numero " + dia + " corresponde al dia Jueves");
                break;
            case 5:
                System.out.println("El numero " + dia + " corresponde al dia Viernes");
                break;
            case 6:
                System.out.println("El numero " + dia + " corresponde al dia Sabado");
                break;
            case 7:
                System.out.println("El numero " + dia + " corresponde al dia Domingo");
                break;
            default:
                System.out.println("El numero " + dia + " no corresponde a ningun dia de la semana");
        }


        //mejora de version de Switch
        System.out.print("\nIngrese un numero del 1 al 7 para conocer el dia de la semana: ");
        dia = scan.nextInt();

        switch (dia) {
            case 1 -> System.out.println("El numero " + dia + " corresponde al dia Lunes");
            case 2 -> System.out.println("El numero " + dia + " corresponde al dia Martes");
            case 3 -> System.out.println("El numero " + dia + " corresponde al dia Miercoles");
            case 4 -> System.out.println("El numero " + dia + " corresponde al dia Jueves");
            case 5 -> System.out.println("El numero " + dia + " corresponde al dia Viernes");
            case 6 -> System.out.println("El numero " + dia + " corresponde al dia Sabado");
            case 7 -> System.out.println("El numero " + dia + " corresponde al dia Domingo");
            default -> System.out.println("El numero " + dia + " es Dia Invalido");
        };
    }
}
