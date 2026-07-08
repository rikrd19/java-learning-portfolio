package ejercicio3.dev.ricardoavila.transporte;

public class Transporte {
    protected String marca;

    public Transporte(String marca) {
        this.marca = marca;
    }

    protected void viajar() {
        System.out.println("Viajando en transporte genérico");
    }
}

class Avion extends Transporte {
    protected int altitudMaxima;

    public Avion(String marca, int altitudMaxima) {
        super(marca);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    protected void viajar() {
        System.out.println("Avión marca: " + marca + "\nAltitud máxima: " + altitudMaxima + " mts");
    }

}

class Barco extends Transporte {

    protected int velocidadNudos;

    public Barco(String marca, int velocidadNudos) {
        super(marca);
        this.velocidadNudos = velocidadNudos;
    }

    @Override
    protected void viajar() {
        System.out.println("Barco marca: " + marca + "\nVelocidad nudos: " + velocidadNudos + " nudos");
    }
}

class Tren extends Transporte {

    protected int numeroVagones;

    public Tren(String marca, int numeroVagones) {
        super(marca);
        this.numeroVagones = numeroVagones;
    }

    @Override
    protected void viajar() {
        System.out.println("Tren marca: " + marca + "\nNúmero de vagones: " + numeroVagones);
    }
}

class PruebaTransporte {
    public static void main(String[] args) {

        Transporte[] transportes = {
                new Avion("Boeing 747", 15000),
                new Barco("El Dorado", 50),
                new Tren("Rodalies", 8),
        };
        for (Transporte t : transportes) {
            t.viajar();
        }
    }
}