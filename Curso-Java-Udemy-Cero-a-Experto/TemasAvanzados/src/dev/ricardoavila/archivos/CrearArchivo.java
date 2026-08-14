package dev.ricardoavila.archivos;

import java.io.File; // input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "mi_archivo.txt";

        File archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe en la ruta especificada!");
            } else {
                // creamos el archivo
                FileWriter archivoWriter = new FileWriter(archivo);
                PrintWriter salida = new PrintWriter(archivoWriter);
                //PrintWriter salida = new PrintWriter(new FileWriter(archivo)); // se puede hacer en una sola linea
               // Se guarda el archivo a disco
                salida.close();

                System.out.println("Se ha creaddo el archivo");
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivos: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}