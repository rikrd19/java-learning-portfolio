package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioTablaDeMultiplicar {

    // Método void no devuelve nada (return)
    public static void immpimirTabla(int numero) {

        for (int i = 1; i <= 10; i++) {
            //  int resultado = numero * i;
            System.out.println(numero + " x " + i + " =" + "\t" + numero * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Tabla de Multiplicar *****");

        // Pedir ingrese un número para generar su tabla
        System.out.print("Ingrese un numero a multiplicar: ");
        int numero = Integer.parseInt(scanner.nextLine());

        // Lamado a la funcion, impresion de tabla de multiplicar
        immpimirTabla(numero);
    }
}
