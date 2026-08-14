package dev.ricardoavila.excepciones;

public class Excepciones {
    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 0;

        try{
            // Esto lanzará una ArithmeticException: división por cero
            int resultado = valor1 / valor2;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {  // clase padre de todas las excepciones
            System.out.println("Error: No se puede dividir por cero. "+ e);
        }

    }
}
