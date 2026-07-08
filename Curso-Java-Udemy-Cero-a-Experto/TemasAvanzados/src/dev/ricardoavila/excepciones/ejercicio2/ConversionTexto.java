package dev.ricardoavila.excepciones.ejercicio2;

public class ConversionTexto {
    public static void main(String[] args) {

        String[] valores = {"42", "hola", "100", "abc", "7", "3.14", "-5"};

        for (String valor : valores) {
            try {
                int numero = Integer.parseInt(valor);
                System.out.println("\"" + valor + "\" convertido a: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("\"" + valor + "\" no es un número válido.");
            }
            System.out.println();
        }
    }
}