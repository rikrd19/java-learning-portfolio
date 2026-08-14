import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks extends Snack {
    public static void main(String[] args) {

        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        boolean salir = false;

        Scanner scanner = new Scanner(System.in);

        //Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Máquina de Snacks ***");
        Snacks.mostrarSnacks();

        while (!salir) {
            try {
                int opcion = mostrarMenu(scanner);
                salir = ejecutarOpciones(opcion, scanner, productos);

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
                4. Salir
                Elige una opción (1-4):\s""");
        // leemos y retornamos la opcion seleccionada por el usuario
        return Integer.parseInt(scanner.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner scanner, List<Snack> productos) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> comprarSnack(scanner, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(scanner);
            case 4 -> {
                System.out.println("Regresa Pronto!");
               salir = true; // Salir del programa
            }
            default -> System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
        }
        return salir; // Continuar en el menú

    }

    private static void comprarSnack(Scanner scanner, List<Snack> productos) {
        System.out.print("Que snack quieres comprar(id)? ");
        int idSnack = Integer.parseInt(scanner.nextLine());
        // validar que el snack exista en la lista de snacks disponibles
        boolean snackEncontrado = false;

        for (Snack snack : Snacks.getSnack()) {
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

    private static void agregarSnack(Scanner scanner) {
        System.out.println("Nombre del snack: ");
        String nombre = scanner.nextLine();
        System.out.println("Precio del snack: ");
        double precio = Double.parseDouble(scanner.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnacks();

    }

}