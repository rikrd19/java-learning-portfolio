package dev.ricardoavila.archivos;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {

        String miArchivo = "mi_archivo.txt";

        try {
            // Leer el contenido del archivo completo(todas las lineas)
            List<String> lineas = Files.readAllLines(Paths.get(miArchivo));
            System.out.println("Contenido del Archivo: ");
           /* for (String linea : lineas) {
                System.out.println(linea);
            }*/

            // Otra forma de imprimir el contenido del archivo usando lambda
            lineas.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error al leer Archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
