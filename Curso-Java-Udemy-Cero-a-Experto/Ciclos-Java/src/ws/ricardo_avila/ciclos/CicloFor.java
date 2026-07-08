package ws.ricardo_avila.ciclos;

public class CicloFor {
    public static void main(String[] args) {

        System.out.println("**** Ciclo For ****");

        for (int contador = 1; contador <= 50; contador++) {
            if (contador <= 50 && contador > 1){
                System.out.print(", ");
            }
                System.out.print(contador);
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.println("**** Numeros pares del 0 al 20 ****");
        System.out.println("" + "=".repeat(60));

        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i);
                if(i < 20 && i>= 0){
                    System.out.print(", ");
                }
            }

        }

    }
}
