package dev.ricardoavila.foreach;

public class ForEach {
    static void main(String[] args) {

        int edades[] = {5, 10, 30, 40, 45};

        // for each - directo al elemento del arreglo
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        System.out.println("-".repeat(60));

        // for tradicional - necesitas gestionar el indice del arreglo
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edad = " + edades[i]);
        }
    }

}
