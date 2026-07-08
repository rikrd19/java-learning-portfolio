package ejercicio4.dev.ricardoavila.project.main;

import ejercicio4.dev.ricardoavila.project.factura.Factura;

public class Main {
    public static void main(String[] args) {

        Factura factura1 = new Factura("001", "Juan Perez", 1000.00, 16.00/100);
        factura1.calcularImpuesto();
        factura1.calcularTotal();
        factura1.maostrarFactura();
        System.out.println("-".repeat(60));


        Factura factura2 = new Factura("002", "Maria Lopez", 500.00, 16.00/100);
        factura2.calcularImpuesto();
        factura2.calcularTotal();
        factura2.maostrarFactura();
        System.out.println("-".repeat(60));

        Factura factura3 = new Factura("003", "Carlos Sanchez", 2000.00, 16.00/100);
        factura3.calcularImpuesto();
        factura3.calcularTotal();
        factura3.maostrarFactura();
    }
}
