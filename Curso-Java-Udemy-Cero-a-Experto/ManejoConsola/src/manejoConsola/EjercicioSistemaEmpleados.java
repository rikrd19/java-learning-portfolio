package manejoConsola;

import java.util.Scanner;

public class EjercicioSistemaEmpleados {
    public static void main(String[] args) {

        System.out.println("*** Sistema de Empleados ***");

        Scanner scanner = new Scanner(System.in);

        // nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = scanner.nextLine();

      // Edad del empleado
       System.out.print("Edad del Empleado: ");
       var edadEmpleado = Integer.parseInt(scanner.nextLine());

       // salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(scanner.nextLine());

        //Es jefe del departamento
        System.out.print("¿Es jefe del departamento? (true/false): ");
        var esJefeDepartamento = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("\nDatos del empleado:");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $ %.2f%n",salarioEmpleado); // para que tenga dos decimales el salario
        System.out.println("\tEs jefe del departamento: " + esJefeDepartamento);





    }
}
