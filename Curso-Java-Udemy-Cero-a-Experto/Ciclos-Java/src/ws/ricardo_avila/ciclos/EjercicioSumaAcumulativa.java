package ws.ricardo_avila.ciclos;

import java.sql.PseudoColumnUsage;

public class EjercicioSumaAcumulativa {
    public static void main(String[] args) {

        System.out.println("**** Suma Acumulativa ****");

        final int VALOR_MAXIMO = 15;
        int acumuladorSuma =0;
        int contador = 1;

        // iterar los valores
        while (contador <= VALOR_MAXIMO) {
            // imprimir lo que va a sumar
            System.out.println("acumuladorSuma + suma -> " + acumuladorSuma + " + " + contador);

            // Suma acumulativa
            acumuladorSuma += contador; // acumuladorSuma = acumuladorSuma + contador
            contador++; // incrementamos el contador

            //suma parcial acumulada
            System.out.println("suma parcial acumulada: "+ acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros 5 numeros es  "+ acumuladorSuma);


        System.out.println("\n" + "=".repeat(60));
        System.out.println("**** Suma acumulativa (do - while) ****");
        System.out.println("" + "=".repeat(60));

        final int VALOR_MAX = 5;
        int acumuladorSum =0;
        int contad = 1;

        do {
            System.out.println("Acumulador + numero -> "+ acumuladorSum + " + " + contad);

            acumuladorSum += contad;
            
            System.out.println("Resultado parcial acumulado: " + acumuladorSum + "\n");
            contad++;

        } while ( contad <= VALOR_MAX);

        System.out.println("Suma de los primeros " + VALOR_MAX + " es: " + acumuladorSum);


        System.out.println("\n" + "=".repeat(35));
        System.out.println("**** Suma acumulativa (for) ****");
        System.out.println("" + "=".repeat(35));

        final int VALOR_MAXi = 5;
        int acumulaSum =0;
        int conta = 1;

        for (int i = 1; i <= VALOR_MAXi; i++) {
            //imprimir lo que se va a sumar
            System.out.println("Acumulador + numero -> " +acumulaSum + " + " + i);

            acumulaSum += i;
            //imprimir la suma parcial acumulada
            System.out.println("suma parcial acumulada = "+ acumulaSum + "\n");
            conta++;
        }
        System.out.println("La suma de los "+ VALOR_MAXi + " primeros números es :" + acumulaSum);
    }
}
