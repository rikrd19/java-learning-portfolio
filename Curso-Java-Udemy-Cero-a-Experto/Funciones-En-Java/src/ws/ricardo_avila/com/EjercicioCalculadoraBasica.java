package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioCalculadoraBasica {


    public static double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public static double restar(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public static double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println(" NO SE PUEDE DIVIDIR ENTRE CERO(0) ");
            return 0;
        }
        return num1 / num2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer numero: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el segundo numero: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        // Realizar las operaciones y mostrar los resultados
        //1. Suma
        System.out.println("1. La suma es: " + sumar(num1, num2));

        //2. Resta
        System.out.println("2. La resta es: " + restar(num1, num2));

        //3. Multiplicacion
        System.out.println("3. La multiplicacion es: " + multiplicar(num1, num2));

        //4. Division
        System.out.println("4. La division es: " + dividir(num1, num2));


    }
}
