package dev.ricardoavila.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {

        // Leer archivo
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);

        try {
            System.out.println("Contenido del Archivo: ");
            // Abrir el archivo para lectura
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            // Leer el contenido del archivo linea por linea
            String linea = entrada.readLine();
            // Para leer todo el contenido del archivo se puede usar un ciclo while(todas las lineas)
            while (linea != null){
                System.out.println(linea);
                // Para leer la sgte linea, antes de terminar el ciclo, nos movemos a la sgte linea
                linea = entrada.readLine();
            }
                // Cerrar el archivo
                entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer archivo "+ e);
        }



    }
}
