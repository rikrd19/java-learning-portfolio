package ejercicio1.dev.ricardoavila.project.vehiculo;

public class Vehiculo {

    protected void arrancar(){
        System.out.println("El vehículo ha arrancado.");
    }

    protected void detener(){
        System.out.println("El vehículo se ha detenido.");
    }

}

class Moto extends Vehiculo{

    public void hacerCaballito(){
        System.out.println("La moto está haciendo un caballito.");
    }
}

class PruebaVehiculo {
    public static void main(String[] args) {

        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.arrancar();
        miVehiculo.detener();
        System.out.println();

        Moto miMoto = new Moto();
        miMoto.arrancar();
        miMoto.detener();
        miMoto.hacerCaballito();

    }
}