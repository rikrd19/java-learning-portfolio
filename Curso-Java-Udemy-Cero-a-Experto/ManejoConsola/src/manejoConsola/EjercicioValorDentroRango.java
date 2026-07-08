package manejoConsola;

import java.util.Scanner;

public class EjercicioValorDentroRango {
    public static void main(String[] args) {



        //definir lso limites del rango
        final int MINIMO = 0;
        final int MAXIMO = 5;

        //solicitar un valor entre o y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        int dato = Integer.parseInt(new Scanner(System.in).nextLine());

        //verificar si el dato esta dentro del rango
        boolean estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Esta dentro del rango? " + estaDentroRango);




    }
}
