package dev.ricardoavila.lambda;

import java.util.ArrayList;
import java.util.List;

public class FiltrarNombres {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(List.of("Ricardo", "Ana", "Carlos", "Lucía", "Miguel", "Sofía"));

/*Imprime solo los nombres con más de 4 caracteres usando forEach con una
condición dentro de la lambda.*/

    nombres.forEach(nombre -> {
          if(nombre.length() > 4){
              System.out.println("Nombre: " + nombre);
          }
      });
    }

}
