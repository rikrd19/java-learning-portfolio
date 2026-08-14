package ejercicio5.dev.ricardoavila.project.estacionamiento;


public class Estacionamiento {

    private String nombre;
    private int capacidad;
    private int vehiculosActuales;
    private double tarifaPorHora;


    public Estacionamiento() {
        nombre = "Sin nombre";
        capacidad = 0;
        vehiculosActuales = 0;
        tarifaPorHora = 0.00;
    }

    public Estacionamiento(String nombre, int capacidad, int vehiculosActuales, double tarifaPorHora) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.vehiculosActuales = vehiculosActuales;
        this.tarifaPorHora = tarifaPorHora;
    }

    /* entrarVehiculo() — incrementa vehiculosActuales
    si hay espacio, si no imprime aviso*/
    public void entrarVehiculo() {
        if (vehiculosActuales < capacidad) {
            vehiculosActuales++;
            System.out.println("Vehiculos actuales: " + vehiculosActuales);
        } else {
            System.out.println("Estacionamiento Lleno. ");

        }
    }

    /*salirVehiculo(int horas) — decrementa vehiculosActuales si hay vehículos
    e imprime el cobro (horas * tarifaPorHora).
    Si no hay vehículos imprime aviso*/
    public void salirVehiculo(int horas) {
        if (vehiculosActuales > 0) {
            vehiculosActuales--;
            // tarifaPorHora *= horas; //error: aqui se modifica la tarifa por hora
            System.out.println("Tarifa a pagar: " + tarifaPorHora * horas);
            System.out.println("Vehiculos actuales: " + vehiculosActuales);
        } else {
            System.out.println("No hay vehiculos en el estacionamiento. ");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("vehiculos actuales: " + vehiculosActuales);
        System.out.println("Espacios Disponibles: " + (capacidad - vehiculosActuales));
        System.out.printf("Tarifa por hora: %.2f%n", tarifaPorHora);

    }
}
