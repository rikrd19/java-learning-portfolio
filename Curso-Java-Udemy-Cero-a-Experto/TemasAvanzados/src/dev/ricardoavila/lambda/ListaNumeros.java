package dev.ricardoavila.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(List.of(3, 8, 15, 4, 22, 7, 10));

        // Usa forEach con lambda para imprimir solo los impares.

       numeros.forEach(numero -> {
           if(numero % 2 != 0){
               System.out.println("Numero impar: "+ numero);
           }
       });


       // No aconsejable con logica reducir a metododo de referendia
       System.out.println("****  metodo de referencia ****");
       numeros.forEach(System.out::println);
    }
}



