package ws.ricardo_avila.com;

public class Arreglos {
    public static void main(String[] args) {

        // Arreglos
        // 1. Declaramso un arreglos
        int[] enteros;

        // 2.Inicializar el arreglo
        enteros = new int[3];

        // 3. Declarar e inicializar el arreglo en una sola linea
        // int[] numeros = new int[2];
        var numeros = new int[2]; // al usar 'var' hay que asignar un valor para inferir el tipo de dato


        // Arreglos
        int[] enters = new int[5]; // Declarar e inicializar un arreglo de enteros con 3 elementos

        // Modificar los elementos
        enters[0] = 13; // Asignar el valor 13 al primer elemento (índice 0)
        enters[1] = 21;  // Asignar el valor 21 al segundo elemento (índice 1)
        enters[4] = 62;  // Asignar el valor 62 al 'quinto' elemento (indice 4)
        /*
         *** Asignar un valor a un elemento que no existe por encima de lo declarado -
         * Esto causará un error de índice fuera de rango--> ArrayIndexOutOfBoundsException
         */
        // leer los elementos de un arreglo
        System.out.println("Valor 1 = " + enters[0]); // Imprimir el valor del primer elemento
        System.out.println("Valor 2 = " + enters[1]); // Imprimir el valor del segundo elemento
        System.out.println("Valor 4 = " + enters[4]); // Imprimir el valor del tercer elemento (que no ha sido asignado, por lo que mostrará el valor predeterminado de 0)

        System.out.println("\n" + "-".repeat(60) + "\n");

        System.out.println("Sintaxis simplificada de Arreglos\n");
        // var enteros2 = new int[]{100, 200, 300, 400, 500}; // al usar 'var' hay que asignar un valor para inferir el tipo de dato

        // Declarar e inicializar un arreglo de enteros con valores específicos
        int[] enteros2 = {100, 200, 300, 400, 500};

        // Acceder a los elementos del arreglo y mostrarlos
        System.out.println("Valor 1: " + enteros2[0]);
        System.out.println("Valor 2: " + enteros2[1]);
        System.out.println("Valor 3: " + enteros2[2]);
        System.out.println("Valor 4: " + enteros2[3]);
        System.out.println("Valor 5: " + enteros2[4]);

        // Imprimir el arreglo directamente: esto mostrará la referencia(direccion) de memoria, no los valores)
        System.out.println("Imprimir el arreglo: " + enteros2);


        System.out.println("\n" + "-".repeat(60));
        System.out.println("Iteracion con ciclo FOR\n");

        // Arreglos
        int[] numerosEnteros = {600, 700, 800, 900, 500};

        // Iterar los elementos de arreglo
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Valor del indice: " + i + " = " + numerosEnteros[i]);
        }

        System.out.println("\n" + "-".repeat(60));
        System.out.println("--- Listas de Frutas ---\n");

        // Arreglos de String
        String[] frutas = {"Manzana", "Pera", "Uva", "Mango", "Banana"};

        // Iterar los elementos del arreglo de frutas
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta indice " + i + ": " + frutas[i]);
        }

        System.out.println("\n" + "-".repeat(60));
        System.out.println("--- Listas de Frutas ---\n");

        // Arreglos
        String[] carrito = {"leche", "pan", "huevos", "queso", "frutas"};

        // buscar 'huevos' y cambiarlo por 'mantequilla'
        for (int i = 0; i < carrito.length; i++) {

            // IMPORTANTE: Para comparar Strings usamos el metodo .equals() en lugar del operador '=='
            if (carrito[i].equals("huevos")) {
                carrito[i] = "mantequilla"; // Cambiar 'huevos' por 'mantequilla'
            }
            // Se coloca en mayúsculas
            carrito[i] = carrito[i].toUpperCase();
        }

        // Impresion el resultado final
        System.out.println("Carrito actualizado:");
        for (String fruta : carrito) {
            System.out.println("- " + fruta);
        }

    }
}
