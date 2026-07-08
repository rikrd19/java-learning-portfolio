package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioMayorDeTresNumeros {

    public static int mayorDeTres(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > c && c > a) {
            return b;
        } else {
            return c;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n******* Mayor de tres numeros *******\n");

        System.out.print("Ingrese el primer número: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el segundo número: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el tercer número: ");
        int c = Integer.parseInt(scanner.nextLine());

        // Llamado a la función para obtener el número mayor
        System.out.println("\nEl número mayor es: " + mayorDeTres(a,b,c));


    }
}
