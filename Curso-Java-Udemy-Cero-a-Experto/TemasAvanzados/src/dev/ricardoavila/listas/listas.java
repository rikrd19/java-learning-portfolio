package dev.ricardoavila.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        //miLista.add("Domingo"); // lista permite elementos duplicados


        for (String elemento : miLista) {
            System.out.println(elemento);
        }


        System.out.println("\n***** Funciones lambda(funcion anonima de un codigo muy compacto *****\n");

        miLista.forEach(elemento ->
                System.out.println("Elemento: " + elemento));

        System.out.println();

        miLista.forEach(System.out::println); // metodo de referencia


        System.out.println("\n**** Metodo de referencia *****\n");
        List<String> nombres = Arrays.asList("Ricardo", "Ana", "Carlos", "Lucía", "Miguel", "Sofía","Carlos");

        System.out.println("Lista de nombres: ");
        nombres.forEach(System.out::println);
    }
}
