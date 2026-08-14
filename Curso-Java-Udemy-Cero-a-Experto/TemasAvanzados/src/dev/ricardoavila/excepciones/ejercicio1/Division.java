package dev.ricardoavila.excepciones.ejercicio1;

public class Division {
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division entre cero");
        }
        return a / b;
    }
}
