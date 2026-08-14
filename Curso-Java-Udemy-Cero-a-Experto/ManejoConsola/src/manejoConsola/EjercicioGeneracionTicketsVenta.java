package manejoConsola;

import java.util.Scanner;

public class EjercicioGeneracionTicketsVenta {
    public static void main(String[] args) {

        System.out.println("*** Generacion de ticket de venta ***");

        Scanner sca = new Scanner(System.in);

        System.out.print("Precio leche: ");
        double precioLeche = sca.nextDouble();

        System.out.print("Precio avena: ");
        double precioAvena = sca.nextDouble();

        System.out.print("Precio pan: ");
        double precioPan = sca.nextDouble();

        System.out.print("Precio lechuga: ");
        double precioLechuga = sca.nextDouble();

        System.out.print("Precio platanos: ");
        double precioPlatanos = sca.nextDouble();

        // calcular el subtotal de la compras sin impuestos
        double subTotal = precioLeche + precioAvena + precioPan + precioLechuga + precioPlatanos;

        //calculos con impuestos
        double impuesto = subTotal * 0.16; // 16% de impuesto

        // calculo total a pagar de la compra con impuestos
        double costoTotalCompra = subTotal + impuesto;

        // imprimir el ticket de venta
        System.out.printf("""
                %n*** Ticket de Venta ***"
                ------------------
                \tSubtotal: $%.2f
                \tImpuesto (16%%): $%.2f
                \tCosto total de la compra: $%.2f
                """, subTotal, impuesto, costoTotalCompra);
    }
}
