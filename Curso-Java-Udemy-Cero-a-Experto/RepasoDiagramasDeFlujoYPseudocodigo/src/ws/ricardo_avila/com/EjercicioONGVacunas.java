package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioONGVacunas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * 4. Una ONG tiene puntos de reparto de vacunas que se pretende funcionen de la siguiente
        manera. Cada día, empezar con 1000 vacunas disponibles y a través de un programa que
        controla las entregas avisar si el inventario baja de 200 unidades. Desarrollar pseudocódigo y
        diagrama de flujo.*/

        int stockInicial = 1000;
        int stockMinimo = 200;
        int vacunasPedidas = 0;

        while (stockInicial > 0) {
            System.out.print("\nCuantas vacunas vas a pedir:? ");
            vacunasPedidas = Integer.parseInt(scanner.nextLine());

            if (vacunasPedidas <= 0) {
                System.out.println("Ingrese cantidad valida !");
                continue;
            }

            // Validar si hay suficiente stock para entregar las vacunas pedidas
            if (vacunasPedidas > stockInicial) {
                System.out.println("¡Alerta! El pedido es mayor al stock disponible. Stock actual: " + stockInicial);
                continue;
            }
            // descontar el inventario
            stockInicial -= vacunasPedidas;
            System.out.println("Entrega exitosa quedan: " + stockInicial);


            // Alerta si el inventario baja de 200 unidades
            if (stockInicial < stockMinimo && stockInicial > 0) {
                System.out.println("¡Alerta! El inventario ha bajado a menos de 200 unidades. Stock actual: " + stockInicial);
            }
        }
        System.out.println("Se han Agotado las vacunas por el dia de hoy!");
    }
}




