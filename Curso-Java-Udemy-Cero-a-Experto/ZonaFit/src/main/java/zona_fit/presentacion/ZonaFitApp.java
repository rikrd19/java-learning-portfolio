package zona_fit.presentacion;

import zona_fit.datos.ClienteDao;
import zona_fit.datos.IClienteDao;
import zona_fit.dominio.Cliente;

import java.util.List;
import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp() {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        IClienteDao clienteDao = new ClienteDao();

        while (!salir) {
            try {
                int opcion = mostrarMenu(scanner);
                salir = ejecutarOpciones(scanner, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner scanner) {
        System.out.print("""
                **** Zona Fit (GYM) ****
                1. Listar clientes
                2. Buscar cliente por ID
                3. Agregar cliente
                4. Modificar cliente
                5. Eliminar cliente
                6. Salir
                Elije una opcion:\s""");
        return Integer.parseInt(scanner.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner scanner, int opcion, IClienteDao clienteDao) {
        boolean salir = false;
        switch (opcion) {
            case 1 -> { // Listar clientes
                System.out.println("*** Listado de Clientes ****");
                List<Cliente> clientes = clienteDao.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> { // Buscar Cliente por ID
                System.out.print("Ingrese el ID del cliente a buscar: ");
                int idCliente = Integer.parseInt(scanner.nextLine());
                Cliente cliente = new Cliente(idCliente);
                boolean encontrado = clienteDao.buscarClientePorId(cliente);
                if (encontrado) {
                    System.out.println("Cliente encontrado: " + cliente);
                } else {
                    System.out.println("No se encontro cliente con ID: " + cliente);
                }

            }
            case 3 -> { // Agregar cliente
                System.out.println("---- Agregar Cliente ----");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Membresia: ");
                int membresia = Integer.parseInt(scanner.nextLine());

                Cliente nuevoCliente = new Cliente(nombre, apellido, membresia);
                boolean agregado = clienteDao.agregarCliente(nuevoCliente);
                if (agregado) {
                    System.out.println("Cliente agregado: " + nuevoCliente);
                } else {
                    System.out.println("No se agrego el cliente: " + nuevoCliente);
                }
            }
            case 4 -> { // Modificar cliente existente
                System.out.println("---- Modificar Cliente ----");
                System.out.print("Id cliente: ");
                int idCliente = Integer.parseInt(scanner.nextLine());
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Membresia: ");
                int membresia = Integer.parseInt(scanner.nextLine());
                // Creamos el objeto a modificar
                Cliente modificarCliente = new Cliente(idCliente, nombre, apellido, membresia);
                boolean modificado = clienteDao.modificarCliente(modificarCliente);
                if (modificado) {
                    System.out.println("Cliente modificado: " + modificarCliente);
                } else {
                    System.out.println("No se modifico el cliente: " + modificarCliente);
                }
            }
            case 5 -> { // Eliminar cliente
                System.out.println("---- Eliminar Cliente ----");
                System.out.print("Id cliente: ");
                int idCliente = Integer.parseInt(scanner.nextLine());
                Cliente eliminarCliente = new Cliente(idCliente);
                boolean eliminado = clienteDao.eliminarCliente(eliminarCliente);
                if (eliminado) {
                    System.out.println("Cliente eliminado: " + eliminarCliente);
                } else {
                    System.out.println("No se elimino el cliente: " + eliminarCliente);
                }
            }
            case 6 -> { // Salir
                System.out.println("Hasta Pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida: " + opcion);
        }

        return salir;
    }
}
