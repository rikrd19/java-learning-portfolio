
package dev.ricardoavila.mapa;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "Diego");
        persona.put("apellido", "Galindez");
        persona.put("edad", "31");
        persona.put("edad", "31"); // no se permiten duplicados

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //se sobrescribe el valor de la clave "edad" con el nuevo valor "35"
        persona.put("edad", "35"); //modifica el valor de llave existente
        System.out.println("\nNuevos valores del mapa");
        persona.entrySet().forEach(System.out::println);

        // si se quiere eliminar alguno de los valores usar el metodo .remove()
        persona.remove("apellido");
        System.out.println("\nElemento removido = 'apellido'");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterar los elementos (llave, valor)");
        persona.forEach((llave, valor)-> {
            System.out.println("Llave: " + llave + ", Valor: " + valor);
        });

    }
}