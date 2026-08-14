package Ejercicio9.dev.ricardoavila.vehiculosobreescritura;

public class VehiculoSobreescritura {

    protected void arrancar() {
        System.out.println("El vehículo arranca");
    }

    protected void describir() {
        System.out.println("Soy un vehículo genérico");
    }
}

class Deportivo extends VehiculoSobreescritura {

    @Override
    protected void describir() {
        System.out.println("Soy auto deportivo de alta velocidad");
    }

    public void turbo() {
        System.out.println("Tengo un turbo potente");
    }
}

class Camion extends VehiculoSobreescritura {

    @Override
    protected void arrancar() {
        System.out.println("El camión arranca lentamente con mucho peso");
    }

    public void cargarMercancia() {
        System.out.println("Se puede cargar hasta 20 toneladas");
    }
}

class PruebaMain {
    public static void main(String[] args) {

        Deportivo deport1 = new Deportivo();
        deport1.describir();
        deport1.turbo();
        System.out.println("-".repeat(60));

        Camion camion1 = new Camion();
        camion1.arrancar();
        camion1.describir();
        camion1.cargarMercancia();

    }
}

