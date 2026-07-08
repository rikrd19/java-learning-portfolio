package ejercicio2.dev.ricardoavila.project.cajaRegistradora;

public class CajaRegistradora {
    private String Ubicacion;
    private double totalVentas;
    private int cantidadVentas;

    public CajaRegistradora() {
        Ubicacion = "Sin Asignar";
        totalVentas = 0;
        cantidadVentas = 0;
    }

    public CajaRegistradora(String ubicacion) {
        this.Ubicacion = ubicacion;
        totalVentas = 0;
        cantidadVentas = 0;
    }

    public void registrarVenta(double monto) {
        if (monto <= 0) {
            System.out.println("El " + monto + " es menor a cero, no se puede registrar la venta");
            return; // Salir del método si el monto es inválido
        }
        totalVentas += monto;
        cantidadVentas++;

    }

    public double promedioVenta() {
        if (cantidadVentas == 0) {
            return 0; // Evitar división por cero
        }
        return totalVentas / cantidadVentas;

    }

    public void mostrarResumen() {
        System.out.println("Ubicacion: " + this.Ubicacion);
        System.out.println("Total de ventas: " + this.totalVentas);
        System.out.println("Cantidad de ventas: " + this.cantidadVentas);
        System.out.println("Promedio de venta: " + promedioVenta());
    }


}
