package dev.ricardoavila.foreach;

public class Temperatura {
    static void main(String[] args) {

        double[] temperaturas = {36.5, 37.2, 37.5, 38.0, 36.8, 39.1};

        for (double temp : temperaturas) {
            if (temp < 37.5) {
                System.out.println("Normal = "+ temp);
            } else if (temp <= 38.5) {
                System.out.println("Fiebre leve = " + temp);
            } else {
                System.out.println("Fiebre alta = "+ temp);
            }
        }

        System.out.println("\n***  Otra forma de hacerlo ****" + "-".repeat(40)+ "\n");

        // otra forma de hacerlo, asignando el estado a una variable y luego imprimiendo el resultado
        for (double temp : temperaturas) {
            String estado;
            if (temp < 37.5) {
                estado = "Normal";
            } else if (temp <= 38.5) {
                estado = "Fiebre leve";
            } else {
                estado = "Fiebre alta";
            }
            System.out.println("Temperatura: " + temp + " → " + estado);
        }
    }


}
