package dev.ricardoavila.excepciones.ejercicio8;

/*Ejercicio 3 — Conversión múltiple
Dado el array:
String[] datos = {"15", "abc", "30", null, "100"};
Recórrelo con foreach. Para cada elemento maneja por separado
NumberFormatException y NullPointerException — cada una con
su propio catch.*/

public class ConversionMultiple {
    public static void main(String[] args) {

        String[] datos = {"15", "abc", "30", null, "100"};

        for (String dato : datos) {
            try {
                int numero = Integer.parseInt(dato);
                System.out.println("Número \""+ dato + "\" convertido: " + numero);
            } catch (NullPointerException e) {
                System.out.println("Error el valor es null");
            } catch (NumberFormatException e) {
                System.out.println("Error: \""+ dato + "\" no es un numero");
            }
        }


    }
}
