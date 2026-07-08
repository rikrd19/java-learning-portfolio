package dev.ricardoavila.mapa.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class ConteoAccesos {
    public static void main(String[] args) {

        Map<String, Integer> registroAccesos =  new HashMap<>();

        registroAccesos.put("Ricardo", 5);
        registroAccesos.put("Sofia", 2);
        registroAccesos.put("Luis", 8);
        registroAccesos.put("Ana", 1);

        registroAccesos.forEach((nombre, accesos)-> {
            if (accesos > 3) {
                System.out.println("Nombre: " + nombre + ", Accesos: " + accesos);
            }
        } );


    }
}
