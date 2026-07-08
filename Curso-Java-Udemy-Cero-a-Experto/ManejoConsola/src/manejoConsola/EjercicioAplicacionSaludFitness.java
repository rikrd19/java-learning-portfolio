package manejoConsola;

import java.util.Scanner;

public class EjercicioAplicacionSaludFitness {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("\n*** Salud y Fitness ***");

        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04; //Valor aproximado en kilocalorias por paso

        System.out.print("Cual es tu nombre: ");
        String nombre = sca.nextLine();

        System.out.print("Ingresa los pasos diarios que has dado: ");
        int pasosDiarios = Integer.parseInt(sca.nextLine());

        // sca.nextLine(); // innecesario en este caso ya que no se va a leer mas texto despues de esto

        double caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        String metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? "Si :)" : "No :(";

        /*
         * se usa el metodo CapitalizarNombre mejora la presentacion del nombre del usuario
         * System.out.println("\n" + nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase() + ": " + metaAlcanzada);
         */

        // Uso del metodo capitalizarNombre mejorando la presentacion del nombre del usuario

        System.out.printf("""
        %nUsuario: %s
        \tPasos dados: %d
        \tCalorias quemadas: %.2f  kcal
        \tMeta de pasos diario alcanzada: %s
        ------------------------------------
        La meta de pasos diarios es de: %d pasos
        """, capitalizarNombre(nombre),pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIOS);


        System.out.println("\n" + "-".repeat(50));
        // ======= Seccion 2: Capitalizar otro nombre de usuario =======
        System.out.println("\nCapitaliza otro nombre de usuario: ");

       // Limpiar el buffer del scanner para evitar problemas al leer el siguiente texto

        System.out.print("Ingresa otro nombre de usuario: ");
        String texto = sca.nextLine();
        System.out.println("Nombre Capitalizado: " + capitalizarNombre(texto));



        sca.close();
    }

    //metodo auxiliar para capitalizar el nombre del usuario
    public static String capitalizarNombre(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto; // Retorna el texto original si es nulo o vacío
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}



   
