package ejercicio6.dev.ricardoavila.project.main;

import ejercicio6.dev.ricardoavila.project.CuentaBancaria.CuentaBancaria;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria ctaBanc1 = new CuentaBancaria("Roberto Roca", 0.00, "000-124", false);
        ctaBanc1.depositar(1000.00);
        ctaBanc1.retirar(200.00);
        ctaBanc1.bloquearCuenta();
        ctaBanc1.mostrarEstado();
        System.out.println("-".repeat(60));

        CuentaBancaria ctaBanc2 = new CuentaBancaria("Juana Sosa", 0.00, "000-125", false);
        ctaBanc2.depositar(2000.00);
        ctaBanc2.retirar(200.00);
        ctaBanc2.bloquearCuenta();
        ctaBanc2.mostrarEstado();
        System.out.println("-".repeat(60));

        CuentaBancaria ctaBanc3 = new CuentaBancaria("Ana MArin", 0.00, "000-127", false);
        ctaBanc3.depositar(3000.00);
        ctaBanc3.retirar(200.00);
        ctaBanc3.bloquearCuenta();
        ctaBanc3.mostrarEstado();

    }
}
