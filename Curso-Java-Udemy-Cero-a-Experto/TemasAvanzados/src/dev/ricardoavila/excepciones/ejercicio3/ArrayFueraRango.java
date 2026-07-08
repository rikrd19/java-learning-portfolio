package dev.ricardoavila.excepciones.ejercicio3;

public class ArrayFueraRango {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println("Elemento: "+ array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error indice fuera de rango: " + e.getMessage());
        }finally {
            System.out.println("Operación finalizada");
        }

    }
}
