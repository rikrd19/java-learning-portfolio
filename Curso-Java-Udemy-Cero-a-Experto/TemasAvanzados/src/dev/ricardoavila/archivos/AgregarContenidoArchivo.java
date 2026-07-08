package dev.ricardoavila.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {

        boolean anexar = false; // si anexar es true, el contenido se agregará al final del archivo existente, §

        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);

        try {
            // Verificar si el archivo existe
            anexar = archivo.exists();

            // Crear el archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            String nuevoContenido = "Nuevo\nContenido";
            salida.println(nuevoContenido);
            // Guardar la información en el archivo
            salida.close();

            System.out.println("Se ha agregado el nuevo contenido al archivo...");
        } catch (Exception e) {
            System.out.println("Error al agregar contenido al archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}