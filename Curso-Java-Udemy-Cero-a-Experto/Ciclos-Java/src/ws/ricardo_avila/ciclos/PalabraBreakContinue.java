package ws.ricardo_avila.ciclos;

public class PalabraBreakContinue {
    public static void main(String[] args) {

        System.out.println("**** Break y Continue ****");

        // Ejemplo de Break, Imprimir solo el primer número par
        System.out.println("\nPalabra break: ");
        for (int numero= 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }
        }
System.out.println("\n"+ "-".repeat(60));
        // Ejemplo con Continue. Imprimir solo números pares, ignore impares
        System.out.println("\nPalabra continue: ");

        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 1) { // numero impar
                continue; // saltamos a la siguiente iteracion
            }
            System.out.print(numero + " "); // números pares
        }
    }
}
