package ejercicio5.dev.ricardoavila.project.main;

import ejercicio5.dev.ricardoavila.project.estacionamiento.Estacionamiento;

public class Main {
    public static void main(String[] args) {

        Estacionamiento estacionam1 = new Estacionamiento("El Albergue", 120, 20, 5.00);
        estacionam1.entrarVehiculo();
        estacionam1.salirVehiculo(5);
        estacionam1.mostrarEstado();
        System.out.println("-".repeat(60));


        Estacionamiento estacionam2 = new Estacionamiento("Los Pinos", 300, 50, 10.00);
        estacionam2.entrarVehiculo();
        estacionam2.salirVehiculo(10);
        estacionam2.mostrarEstado();
        System.out.println("-".repeat(60));

        Estacionamiento estacionam3 = new Estacionamiento("El Guardián", 50, 0, 15.00);
        estacionam3.entrarVehiculo();
        estacionam3.salirVehiculo(2);
        estacionam3.mostrarEstado();
    }
}
