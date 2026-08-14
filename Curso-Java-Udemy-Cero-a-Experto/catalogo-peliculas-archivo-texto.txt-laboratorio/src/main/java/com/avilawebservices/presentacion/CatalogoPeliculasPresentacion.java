package com.avilawebservices.presentacion;

import com.avilawebservices.negocio.CatalogoPeliculasImplementacion;
import com.avilawebservices.negocio.ICatalogoPeliculas;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImplementacion();

        while (opcion != 0) {
            System.out.println("""
                    \n\n***** Bienvenido al Catálogo de Películas *****
                    1. Iniciar catalogo de peliculas
                    2. Agregar pelicula
                    3. Listar peliculas
                    4. Buscar pelicula
                    0. Salir 
                    
                    Elige una opcion: """);
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula: ");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula a buscar: ");
                    String buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
            }
        }


    }


}
