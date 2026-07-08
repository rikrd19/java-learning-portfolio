package com.avilawebservices.negocio;


import com.avilawebservices.datos.AccesoDatosImplementacion;
import com.avilawebservices.datos.IAccesoDatos;
import com.avilawebservices.domain.Pelicula;
import com.avilawebservices.excepciones.AccesoDatosException;

import java.util.List;

/*
 * Contiene las implementacion de las operaciones
 * necesarias de la aplicación CatalogoPeliculas
 */
public class CatalogoPeliculasImplementacion implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImplementacion() {
        this.datos = new AccesoDatosImplementacion();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosException e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (AccesoDatosException e) {
            System.out.println("Error de acceso datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosException e) {
            System.out.println("Error de acceso datos");
            e.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            } else {
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosException e) {
            System.out.println("Error al iniciar catalogo de peliculas");
            e.printStackTrace(System.out);
        }

    }
}
