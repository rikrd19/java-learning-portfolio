package com.avilawebservices.datos;


import com.avilawebservices.domain.Pelicula;
import com.avilawebservices.excepciones.AccesoDatosException;
import com.avilawebservices.excepciones.EscrituraDatosException;
import com.avilawebservices.excepciones.LecturaDatosException;

import java.util.List;

/*
 *  Contiene  las operaciones a ejecutar en el archivo de peliculas.txt
 */
public interface IAccesoDatos {

    // Método para verificar si el archivo existe
    public boolean existe(String nombreRecurso) throws AccesoDatosException;

    // Método para listar las películas en el archivo
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosException;

    // Método para escribir una película en el archivo
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosException;

    // Método para buscar una película por su nombre en el archivo
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosException;

    // Método para crear un nuevo archivo
    public void crear(String nombreRecurso) throws AccesoDatosException;

    // Método para borrar un archivo
    public void borrar(String nombreRecurso) throws AccesoDatosException;

}
