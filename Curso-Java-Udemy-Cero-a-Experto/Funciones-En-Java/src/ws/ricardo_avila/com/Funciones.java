package ws.ricardo_avila.com;

public class Funciones {

    // 1. Este método NO retorna nada - solo ejecuta
    public static void saludar(String mensaje) {
        System.out.println("\nMensaje: " + mensaje);
    }


    // 2. Este método retorna un valor - puedes guardarlo o usarlo
    public static int sumar(int a, int b) {
        int resultado = a + b; // devuelve un int
        return resultado;
    }

    public static void main(String[] args) {
        // 1.
        saludar("Hola desde Java");
        saludar("Adios");

        System.out.println("\n" + "=".repeat(50));


        //2.  Método que retorna un valor
        int arg1 = 3;
        int arg2 = 8;

        int resultado_funcion = sumar(arg1, arg2);
        System.out.println("Resultado_función = " + resultado_funcion);

        // con otros valores
        resultado_funcion = sumar(10, 20);
        System.out.println("Resultado_funcion = " + resultado_funcion);
        
        // colocando otros valores
        resultado_funcion = sumar(50, 50);
        System.out.println("Resultado_funcion = " + resultado_funcion);



    }
}
