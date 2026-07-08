package ejercicio3.dev.ricardoavila.project.piscina;

public class Piscina {

    private int capacidadMaxima;
    private int litrosActuales;
    private boolean abierta;

    public Piscina() {
        capacidadMaxima = 0;
        litrosActuales = 0;
        abierta = false;
    }

    public Piscina(int capacidadMaxima, int litrosActuales, boolean abierta) {
        this.capacidadMaxima = capacidadMaxima;
        this.litrosActuales = litrosActuales;
        this.abierta = abierta;
    }

    public void llenar(int litros) {
        litrosActuales += litros;

        if (litrosActuales > capacidadMaxima) {
            litrosActuales = capacidadMaxima;
        }
        System.out.println("Litros actuales: " + litrosActuales);

    }

    public void vaciar(int litros) {
        litrosActuales -= litros;

        if (litrosActuales <= 0) {
            litrosActuales = 0;
            abierta = false;
            System.out.println("Piscina vacia. Cerrada automaticamente.");
            return;
        }
        System.out.println("Litros Actuales: " + litrosActuales);


    }

    public void abrirPiscina() {
        if (litrosActuales == 0) {
            System.out.println("No se puede abrir. La piscina esta vacia.");
            return;
        }
        abierta = true;
        System.out.println("La piscina esta abierta.");

    }

    public void mostrarEstado() {
        System.out.println("Capacidad Maxima: " + this.capacidadMaxima);
        System.out.println("Litros Actuales: " + this.litrosActuales);
        System.out.println("Abierta: " + this.abierta);


    }
}
