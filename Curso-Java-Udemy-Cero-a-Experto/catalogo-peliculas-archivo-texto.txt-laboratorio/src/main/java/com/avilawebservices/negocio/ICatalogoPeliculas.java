package com.avilawebservices.negocio;


/*
 * Contiene las operaciones necesarias de la
 * aplicación CatálogoPelículas
 */
public interface ICatalogoPeliculas {
    public static final String NOMBRE_RECURSO = "peliculas.txt";

    // Agrega una película al catálogo
    public void agregarPelicula(String nombrePelicula);

    // Lista todas las películas del catálogo
    public void listarPeliculas();

    // Busca una película por su nombre en el catálogo
    public void buscarPelicula(String buscar);

    // Inicia el catálogo de películas, creando un nuevo archivo
    public void iniciarCatalogoPeliculas();
}