package manejoConsola;

import java.util.Scanner;

public class Ejercicio2CondicionalTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Ejercicio 1: Calificaciones con operador ternario
        System.out.println("**** Calificaciones *****");

        System.out.print("\nIngresa la calificacion del alumno(0 - 100): ");
        int calificacion = scanner.nextInt();

        String resultado = (calificacion >= 60) ? "Aprobado" :
                (calificacion >=0 || calificacion < 60) ? "Reprobado" : "Invalido (fuera de rango)";

        System.out.println("Por tu notas "+calificacion + " estas: "+ resultado);


        // Ejercicio 2: Mayor de tres numeros con operador ternario
        System.out.print("\n**** Mayor de tres numeros *****");

        System.out.print("\nIngresa el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero entero");
        int num3 = scanner.nextInt();

        String numeroMayor = (num1 > num2 && num1 > num3) ? "El numero " + num1 + " es Mayor " :
                            (num2 > num1 && num2 > num3) ? "El numero " + num2 + " es Mayor " :
                            (num3 > num1 && num3 > num2) ? "Es numero " + num3 + " es Mayor " : "Hay numeros iguales";

        System.out.println(numeroMayor);


        // Ejercicio 3: Clasificador de Triangulos (operador ternario)
        System.out.println("\n***** Clasificador de Triangulos *****");

        System.out.println("Ingresa el primer lado del triangulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo lado del triangulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingresa el tercer lado del triangulo: ");
        double lado3 = scanner.nextDouble();

        boolean esValido = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

      resultado  = (!esValido) ?
                "No es un triangulo valido" :
                        (lado1 == lado2 && lado2 == lado3) ? "Triangulo Equilatero" :
                        (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) ? "Triangulo Isosceles" : "Triangulo Escaleno";


        System.out.println("El tipo de triangulo es: " + resultado);
    }
}
