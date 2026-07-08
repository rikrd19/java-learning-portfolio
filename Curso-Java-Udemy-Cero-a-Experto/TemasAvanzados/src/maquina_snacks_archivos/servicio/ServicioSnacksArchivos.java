package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;

public class ServicioSnacksArchivos implements IServiciosSnacks {

    private final String NOMBRE_ARCHIVO = "snacks.txt";

    // Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor clase
    public ServicioSnacksArchivos() {
        // Creamos el archivo si no existe
        File archivo = new File(NOMBRE_ARCHIVO);
        boolean existeArchivo = false;

        try {
            existeArchivo = archivo.exists();
            if (existeArchivo) {
                this.snacks = obtenerSnacks();
            } else { // Creamos el archivo si no existe
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Guardamos el archivo en disco
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());

        }
        // Si no existe el archivo, cargamos algunos snacks iniciales
        if (!existeArchivo) {
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 7));
        this.agregarSnack(new Snack("Refresco", 5));
        this.agregarSnack(new Snack("Sandwich", 12));
    }

    private List<Snack> obtenerSnacks() {
        List<Snack> snacks = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String[] lineaSnack = linea.split(", "); // parseo separado por una coma y un espacio
                int idSnack = Integer.parseInt(lineaSnack[0]); // no se usa pero se mantiene para futuras mejoras
                String nombre = lineaSnack[1];
                double precio = Double.parseDouble(lineaSnack[2]);
                Snack snack = new Snack(nombre, precio);
                snacks.add(snack); //agregamos el snack a la lista de snacks
            }
        } catch (Exception e) {
            System.out.println("Error al leer arhivo de snacks" + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo snack, 1. a la lista en memoria
        // 1. Guardamos el nuevo snack en memoria
        this.snacks.add(snack);
        // 2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack) {
        boolean anexar = false;
        File archivo = new File(NOMBRE_ARCHIVO);

        try {
            anexar = archivo.exists(); // Verificamos si el archivo existe para anexar o crear
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close(); // Se escribe la información en el archivo
        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }

    }

    @Override
    public void mostrarSnacks() {
        System.out.println("------ Snacks en el inventario ------");
        String inventarioSnacks = "";
        for (Snack snack : this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnack() {
        return this.snacks;
    }
}
