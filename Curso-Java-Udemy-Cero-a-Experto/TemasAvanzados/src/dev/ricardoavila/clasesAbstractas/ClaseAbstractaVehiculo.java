package dev.ricardoavila.clasesAbstractas;

public class ClaseAbstractaVehiculo {
    static void main(String[] args) {

        Vehiculo vehiculo = new Bicicleta();
        vehiculo.mover();

        vehiculo = new Automovil();
        vehiculo.mover();

        vehiculo = new Avion();
        vehiculo.mover();


    }
}

abstract class Vehiculo{
    public abstract void mover();
}

class Bicicleta extends Vehiculo{
    @Override
    public void mover() {
        System.out.println("La bicleta se mueve pedaleando");
    }
}

class Automovil extends Vehiculo{
    @Override
    public void mover(){
        System.out.println("El automóvil se mueve con motor");
    }
}

class Avion extends Vehiculo{
    @Override
    public void mover(){
        System.out.println("El avion se mueve con motores en las alas");
    }
}