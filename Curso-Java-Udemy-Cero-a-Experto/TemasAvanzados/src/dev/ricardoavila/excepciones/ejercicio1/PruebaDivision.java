package dev.ricardoavila.excepciones.ejercicio1;

public class PruebaDivision {
    public void main(String[] args) {

        // Prueba con división entre cero
        try {
            int resultado = Division.dividir(9, 0);
            System.out.println("Resultado de la división: "+ resultado);
        }catch (ArithmeticException e){
            System.out.println("Error: " + e);
        }

        System.out.println("-".repeat(60));

        // Prueba con división normal
        try {
            int resultado = Division.dividir(50, 5);
            System.out.println("Resultado: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
