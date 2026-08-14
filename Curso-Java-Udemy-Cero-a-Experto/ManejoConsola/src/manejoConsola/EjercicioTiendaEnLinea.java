package manejoConsola;

import java.util.Scanner;

public class EjercicioTiendaEnLinea {
    public static void main(String[] args) {

        /*
        * crear un sistema que ofresca descuentos dependiendo del monto de la compra,
        * o si es mienmbro  de la tienda. */

        Scanner sca = new Scanner(System.in);


        System.out.println("***** Tienda en Línea con Descuentos*****");





        System.out.print("Cual fue el monto de tu compra: ");
        double montoCompra = sca.nextDouble();

        System.out.print("Eres miembro de la tienda?(true/false: ");
        boolean esMiembroTienda = sca.nextBoolean();

        final double descuentoMiembro = montoCompra * 0.10; // 10% de descuento para miembros
        final double descuentoSoloMiembro = montoCompra * 0.05; // 5% de descuento solo por ser miembro

        if (montoCompra >= 1000 && esMiembroTienda) {
            double totalPagar = montoCompra  - descuentoMiembro;
            System.out.printf("""
        %nFelicidades has obtenido un desc.10%%
        \tMonto de la compra: %.2f
        \tMonto descuento: %.2f
        \tMonto final de la compra: $%.2f""",montoCompra, descuentoMiembro, totalPagar);
        } else if (montoCompra < 1000 && esMiembroTienda) {
            double totalPagar = montoCompra - descuentoSoloMiembro;
            System.out.printf("""
        %nFelicidades has obtenido un desc.5%%
        \tMonto de la compra: %.2f
        \tMonto descuento: %.2f
        \tMonto final de la compra: $%.2f""",montoCompra, descuentoSoloMiembro, totalPagar);
        }else {
            System.out.printf("""
        %nNo obtuviste ningún tipo de descuento
        Te invitamos a hacerte Miembro de la tienda
        \tTotal a pagar: $%.2f""", montoCompra);
        }


    }
}
