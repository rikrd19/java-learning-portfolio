package ws.ricardo_avila.com;

public class EjercicioAlgoritmoCalculoSuma {
    public static void main(String[] args) {

        /*1. Desarrolla un algoritmo que calcule la suma de los múltiplos
        de 5 entre 1 y 100. El programa
        debe imprimir los múltiplos y la suma.
        */

        int suma = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0) {
                suma += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nLa suma es: "+ suma);

    }
}
