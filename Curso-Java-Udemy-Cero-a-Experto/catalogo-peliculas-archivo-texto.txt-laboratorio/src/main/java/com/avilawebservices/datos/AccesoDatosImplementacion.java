package com.avilawebservices.datos;


import com.avilawebservices.domain.Pelicula;
import com.avilawebservices.excepciones.AccesoDatosException;
import com.avilawebservices.excepciones.EscrituraDatosException;
import com.avilawebservices.excepciones.LecturaDatosException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
 *  Contiene  las operaciones a ejecutar en el archivo de peliculas.txt
 */
public class AccesoDatosImplementacion implements IAccesoDatos {

    @Override
    // Metodo para verificar si el archivo existe
    public boolean existe(String nombreRecurso) throws AccesoDatosException {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    // Metodo para listar las películas en el archivo
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosException {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosException("Excepcion al listar peliculas: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosException("Excepcion al listar peliculas: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    // Metodo para escribir una película en el archivo
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosException {
        File archivo = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + pelicula);
        } catch (IOException e) {
            throw new EscrituraDatosException("Excepcion al escribir peliculas: " + e.getMessage());
        }
    }

    @Override
    // Metodo para buscar una película por su nombre en el archivo
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosException {
        File archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;  // Para saber el indice que vamos leyendo - pelicula buscando
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula: " + linea + " encontrada en el indice: " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosException("Excepcion al buscar pelicula: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosException("Excepcion al buscar pelicula: " + e.getMessage());
        }
        return resultado;
    }

    @Override
    // Metodo para crear un nuevo archivo
    public void crear(String nombreRecurso) throws AccesoDatosException {
        File archivo = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            throw new AccesoDatosException("Excepcion al crear archivo: " + e.getMessage());
        }
    }

    @Override
    // Metodo para borrar un archivo
    public void borrar(String nombreRecurso) throws AccesoDatosException {
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Se ha borrado el archivo");
            } else {
                throw new AccesoDatosException("No se pudo borrar el archivo");
            }
        } else {
            throw new AccesoDatosException("El archivo no existe");
        }
    }
}
