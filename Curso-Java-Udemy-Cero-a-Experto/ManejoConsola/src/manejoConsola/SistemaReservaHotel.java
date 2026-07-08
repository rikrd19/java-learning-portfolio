package manejoConsola;

import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** Sistema de Reserva de Hotel ***");

        System.out.print("Nombre del Cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Dias de estadia: ");
        int diasEstadia = Integer.parseInt(scanner.nextLine());

        System.out.print("Con vista al mar (true/false): ");
        boolean vistaMar = Boolean.parseBoolean(scanner.nextLine());

        final double TARIFA_DIARIA_SIN_VISTA_MAR = 150.50 * diasEstadia;
        final double TARIFA_DIARIA_CON_VISTA_MAR= 190.50 * diasEstadia;



        double costoTotalEstadia = (vistaMar == true) ? TARIFA_DIARIA_CON_VISTA_MAR : TARIFA_DIARIA_SIN_VISTA_MAR;



        System.out.printf("""
                %n------------ Detalles de la Reserva ------------
                Cliente: %s
                Dias de estadia: %d dias
                Costo total: $%.2f
                habitacion con vista al mar: %s
                """, cliente, diasEstadia, costoTotalEstadia, vistaMar ? "Si :)" : "No :(");

    }
}
