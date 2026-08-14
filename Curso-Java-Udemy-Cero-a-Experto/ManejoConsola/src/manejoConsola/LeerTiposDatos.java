package manejoConsola;


import java.util.Locale;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Forzamos el uso de punto para decimales

        // Read a type of data
        // read a type int
        System.out.print("Input your age : ");
        var age = scanner.nextInt();
        System.out.println("You age is: " + age);

        // leer un tipo double
        System.out.print("Input your tall: ");
        var estatura = scanner.nextDouble();
        System.out.println("Tu estatura es: " + estatura + " metros");

        // Consumimos el caracter de salto de línea pendiente
        scanner.nextLine();

        // leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = scanner.nextLine(); // next() - nextLine()
        System.out.println("Tu nombre es: " + nombre);

        //conversion de datos
        System.out.print("Ingresa un valor entero: ");
//        var enteroString = scanner.nextLine();
//        var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(scanner.nextLine()); // En un solo paso
        System.out.println("El valor entero es: " + entero);

        // tipo flotante
        System.out.print("Ingrese un valor flotante: ");
        var flotante = Float.parseFloat(scanner.nextLine());
        System.out.println("El valor flotante es: " + flotante);


        //Double.parseDouble(scanner.nextLine());
        //Boolean.parseBoolean(scanner.nextLine());
    }
}
