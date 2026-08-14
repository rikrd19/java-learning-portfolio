package manejoConsola;

public class FormateoCadenas {
    public static void main(String[] args) {

        System.out.println("*** Formateo de Cadenas ***");

        String nombre = "Matias";
        int edad = 30;
        double salario = 21000.50;

// String.format() para formatear cadenas
        String mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

// printf() para formatear y mostrar directamente en consola
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);

        int numeroEmpleado = 12;
        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNro. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        //formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNro. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
