package ejercicio6.dev.ricardoavila.project.CuentaBancaria;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;
    private boolean bloqueada;

    public CuentaBancaria() {
        titular = "Sin titular";
        saldo = 0.0;
        numeroCuenta = "Sin número de cuenta";
        bloqueada = false;
    }

    public CuentaBancaria(String titular, double saldo, String numeroCuenta, boolean bloqueada) {
        this.titular = titular;
        this.saldo = 0.00;
        this.numeroCuenta = numeroCuenta;
        this.bloqueada = false;
    }

    public void depositar(double monto) {
        if (monto > 0 && !bloqueada) {
            saldo += monto;
            System.out.println("Saldo actual: " + (saldo));
        } else {
            System.out.println("El monto no es valido o la cuenta está bloqueada.");
        }
    }

    public void retirar(double monto) {
        if (saldo >= monto && !bloqueada) {
            System.out.println("Despues de retirar: " + (saldo - monto));
        } else {
            System.out.println("No hay fondos suficiente o cuenta bloqueada");
        }
    }

    public void bloquearCuenta() {
        bloqueada = true;
        System.out.println("La cuenta ha sido bloqueada." + bloqueada);
    }

    public void mostrarEstado() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Bloqueada: " + bloqueada);
    }
}
