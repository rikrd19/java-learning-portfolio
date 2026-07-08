package dev.ricardoavila.excepciones.ejercicio7;

public class PruebaSaldoBancario {

    public static void main(String[] args) {
        double saldoNuevo = 0.00;

        try {
            saldoNuevo = SaldoBancario.retirar(1000.00, 800.00);
            System.out.println("Saldo nuevo: " + saldoNuevo);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            saldoNuevo = SaldoBancario.retirar(500.00, 1800.00);
            System.out.println("Saldo nuevo: " + saldoNuevo);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
