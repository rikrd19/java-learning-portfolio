package ejercicio10.dev.ricardoavila.cuenta;

public class CuentaBancaria {

    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    protected void mostrarInfo() {
        System.out.println("Titular: " + this.titular + "\nSaldo: " + this.saldo);
    }
}

class CuentaPremium extends CuentaBancaria {

    private String beneficios;

    public CuentaPremium(String titular, double saldo, String beneficios) {
        super(titular, saldo);
        this.beneficios = beneficios;
    }

    @Override
    protected void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Beneficios: " + this.beneficios);
    }

    public void aplicarDescuento(double porcentaje) {
        saldo -= saldo * (porcentaje / 100);
        System.out.println("El Descuento aplicado es: " + saldo);
    }
}

class PruebaMain{

    public static void main(String[] args) {

        CuentaBancaria normal = new CuentaBancaria("Ana Velasquez", 1000);
        normal.mostrarInfo();
        System.out.println("-".repeat(60));

        CuentaPremium premium = new CuentaPremium("Jose Helguera", 5000, "VIP");
        premium.mostrarInfo();
        premium.aplicarDescuento(10);


    }
}