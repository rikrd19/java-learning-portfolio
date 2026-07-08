package com.ricardoavila.project.projecto;

public class CuentaBancaria {
    // Atributos
    String titular;
    String numeroCuenta;
    double saldo;

    // Métodos
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito exitoso. Saldo Actual: " + saldo);
    }

    public void retirar(double monto) {
        if (monto < saldo) {
            saldo -= monto;
            System.out.println("Retiro Exitoso. Saldo actual "+ saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar. Saldo Actual: " + saldo);
            return;
        }
    }

    public void mostrarCuenta() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo Actual: " + saldo);
    }

    public static void main(String[] args) {
        System.out.println("***** Clase CuentaBancaria *****");

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.titular = "Jose Maria";
        cuenta1.numeroCuenta = "12121212";
        cuenta1.saldo = 1000.0;
        cuenta1.depositar(500);
        cuenta1.retirar(300);

        cuenta1.mostrarCuenta();


    }
}
