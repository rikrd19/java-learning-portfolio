package dev.ricardoavila.excepciones.ejercicio5;

public class MultiplesExcepciones {

    public static void procesarDato(String texto, int indice) {

        try {
            int numero = Integer.parseInt(texto);
            int[] datos = {10, 20, 30};
            System.out.println("Numero: "+ " - Dato: "+ datos[indice]);
        } catch (NumberFormatException e) {
            System.out.println("Error de conversion: \""+ texto+ " \" no es un número");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error de indice: posicion "+ indice + " No existe");
        }
    }

    public static void main(String[] args) {

        procesarDato("50", 1);
        procesarDato("abc", 1);
        procesarDato("50", 10);

    }
}


