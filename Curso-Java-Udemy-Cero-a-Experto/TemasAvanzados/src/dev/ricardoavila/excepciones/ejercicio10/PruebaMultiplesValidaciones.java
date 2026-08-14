package dev.ricardoavila.excepciones.ejercicio10;

public class PruebaMultiplesValidaciones {
    public static void main(String[] args) {

        try {
            MultiplesValidaciones.procesarUsuario("Juan", 34, 5000.00);
        } catch (NullPointerException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }

        try {
            MultiplesValidaciones.procesarUsuario(null, 34, 5000.00);
        } catch (NullPointerException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }

        try {
            MultiplesValidaciones.procesarUsuario("Pedro", 14, 5000.00);
        } catch (NullPointerException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }

        try {
            MultiplesValidaciones.procesarUsuario("Teresa", 34, -5000.00);
        } catch (NullPointerException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
