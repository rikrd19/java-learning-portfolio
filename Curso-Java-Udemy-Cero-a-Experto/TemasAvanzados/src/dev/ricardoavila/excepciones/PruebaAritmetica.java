package dev.ricardoavila.excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
            int resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error " + e);
        }finally {
            System.out.println("Se reviso la división entre cero");
        }
    }
}