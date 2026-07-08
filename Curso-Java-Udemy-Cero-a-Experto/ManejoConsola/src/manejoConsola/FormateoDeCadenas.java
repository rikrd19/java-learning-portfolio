package manejoConsola;

public class FormateoDeCadenas {
    public static void main(String[] args) {

        System.out.println("*** Formateo de Cadenas ***");

        var nombre = "Matias";
        var edad = 30;
        var salario = 21000.50;
        var numeroEmpleado = 12;

        // String.format() para formatear cadenas
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: €%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // metodo printf() para formatear cadenas
        System.out.printf("Nombre: %s, Edad: %d, Salario: €%.2f%n", nombre, edad, salario);

        //formateo con text block
        mensaje = """
                %nDetalle Pesona:\s
                -----------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: €%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);


        // formateo con text block y printf
        System.out.printf("""
                %nDetalle Pesona:\s
                -----------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: €%.2f
                """, nombre, numeroEmpleado, edad, salario);





        System.out.println("*** Ilerna ***");

        var instituto = "Ilerna";
        var direccion = "Calle Falsa 123";
        var correo = "ilerna@ilerna.com";
        var telefono = "+34555-1234";
        var turno = "Tarde";





    }
            }
