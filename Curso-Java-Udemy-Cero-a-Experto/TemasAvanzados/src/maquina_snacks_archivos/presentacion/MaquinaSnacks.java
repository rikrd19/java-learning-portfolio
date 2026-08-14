package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServiciosSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        // Llamado de funcion
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        // ** Creamos el objeto para obtener el servicio de snacks(lista)
        // IServiciosSnacks servicioSnacks = new ServicioSnacksLista();
        IServiciosSnacks servicioSnacks = new ServicioSnacksArchivos();


        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Máquina de Snacks ***");
        servicioSnacks.mostrarSnacks(); // Mostrar inventario de snacks disponibles

        while (!salir) {
            try {
                int opcion = mostrarMenu(scanner);
                salir = ejecutarOpciones(opcion, scanner, productos, servicioSnacks);

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            } finally {
                System.out.println(); // imprime un salto de linea con cada iteración del menú
            }
        }
    }

    private static int mostrarMenu(Scanner scanner) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar Ticket
                3. Agregar nuevo snack
                4. Mostar inventario de snacks
                5. Salir
                Elige una opción (1-4):\s""");
        // leemos y retornamos la opcion seleccionada por el usuario
        return Integer.parseInt(scanner.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner scanner, List<Snack> productos, IServiciosSnacks servicioSnacks) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> comprarSnack(scanner, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(scanner, servicioSnacks);
            case 4 -> listarInventarioSnacks(scanner, servicioSnacks);
            case 5 -> {
                System.out.println("Regresa Pronto!");
               salir = true; // Salir del programa
            }
            default -> System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
        }
        return salir; // Continuar en el menú

    }

    private static void listarInventarioSnacks(Scanner scanner, IServiciosSnacks servicioSnacks) {
        servicioSnacks.mostrarSnacks();
    }
    private static void comprarSnack(Scanner scanner, List<Snack> productos, IServiciosSnacks servicioSnacks) {
        System.out.print("Que snack quieres comprar(id)? ");
        int idSnack = Integer.parseInt(scanner.nextLine());
        // validar que el snack exista en la lista de snacks disponibles
        boolean snackEncontrado = false;

        for (Snack snack : servicioSnacks.getSnack()) {
            if (idSnack == snack.getIdSnack()) {
                // Agregamos el snack a la lista de productos comprados
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos) {
        String ticket = "***** Ticket de venta *****\n";
        double total = 0.0;
        // Iterar cada uno de los objetos de tipo producto
        for (Snack producto : productos) {
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner scanner, IServiciosSnacks servicioSnacks) {
        System.out.print("Nombre del snack: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio del snack: ");
        double precio = Double.parseDouble(scanner.nextLine());
        servicioSnacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente");
        servicioSnacks.mostrarSnacks();

    }

}