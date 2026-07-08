package ws.ricardo_avila.ciclos;

public class CicloDoWhile {
    public static void main(String[] args) {

        System.out.println("**** Ciclo do-while ****");

        int contador = 1;

        do {
            System.out.println(contador++);
        } while (contador <= 3);

        System.out.println("\n" + "=".repeat(60) + "\n");

        System.out.println("***** Numeros Inversos *****");

        contador = 10;  // fue declarado en en ejercicio anterior

        do {
            //System.out.print(contador-- + " "); //decrementamos el contador despues de imprimir
            System.out.print(contador);
            System.out.print((contador > 1) ? ", " : ""); // coma si no es el ultimo numero
            contador--; // decrementamos el contador despues de imprimir

        } while (contador > 0);


        System.out.println("\n" + "=".repeat(60) + "\n");

        System.out.println("***** Numeros Inversos (practicando while *****");

        contador = 10; // reiniciamos el contador

        while (contador > 0) {
            System.out.print(contador);
            System.out.print((contador > 1) ? ", " : ""); // coma si no es el ultimo numero
            contador--;
        }

        System.out.println("\n" + "=".repeat(60) + "\n");

        System.out.println("***** Numeros Impares del 0 al 20 *****");

        int count = 0;

        do {
            //revision si es numero impar
            if (count % 2 != 0) {
                System.out.print(count);
                System.out.print((count < 19) ? ", " : "");
            }
            count++;

        } while (count < 20);


        System.out.println("\n" + "=".repeat(50));

        int conta = 0;

        do {
            if (conta % 2 != 0) {
                System.out.print(conta);
                if (conta < 19) {
                    System.out.print(", ");
                }
            }
            conta++;

        } while (conta < 20);
    }
}


