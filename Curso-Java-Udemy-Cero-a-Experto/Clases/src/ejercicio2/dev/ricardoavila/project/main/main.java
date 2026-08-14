package ejercicio2.dev.ricardoavila.project.main;

import ejercicio2.dev.ricardoavila.project.cajaRegistradora.CajaRegistradora;

public class main {
    public static void main(String[] args) {

        CajaRegistradora caja1 = new CajaRegistradora("Entrada Principal");

        CajaRegistradora caja2 = new CajaRegistradora("Planta baja");

        caja1.registrarVenta(150.00);
        caja1.registrarVenta(60.00);
        caja1.registrarVenta(-30.00);
        caja1.registrarVenta(20.00);
        caja1.mostrarResumen();
        System.out.println("----------------------------------");

        caja2.registrarVenta(80.00);
        caja2.registrarVenta(200.00);
        caja2.registrarVenta(0.00);
        caja2.mostrarResumen();


    }
}
