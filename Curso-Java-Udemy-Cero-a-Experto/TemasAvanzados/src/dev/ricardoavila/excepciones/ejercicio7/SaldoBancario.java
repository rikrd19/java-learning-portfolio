package dev.ricardoavila.excepciones.ejercicio7;

public class SaldoBancario {

    public static double retirar(double saldo, double monto) {
        if (monto > saldo) {
            throw new ArithmeticException("Monto supera el saldo disponible: " + saldo);
        }
        return saldo - monto;
    }
}
