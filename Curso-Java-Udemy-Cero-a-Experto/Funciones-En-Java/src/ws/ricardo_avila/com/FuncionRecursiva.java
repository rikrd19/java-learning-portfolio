package ws.ricardo_avila.com;

public class FuncionRecursiva {

    // Imprimir 1 al 5 usando una función recursiva
    // Función recursiva
    public static void funcionRecursiva(int numero){
        //caso base
        if (numero == 1) {
            System.out.print(numero + " ");
        } else {
            // caso recursivo
            System.out.print(numero + " ");
            funcionRecursiva(numero - 1);

        }
    }


    public static void main(String[] args) {
        funcionRecursiva(10);

    }
}
