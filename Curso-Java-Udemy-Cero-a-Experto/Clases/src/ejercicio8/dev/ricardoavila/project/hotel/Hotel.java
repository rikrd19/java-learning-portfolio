package ejercicio8.dev.ricardoavila.project.hotel;

public class Hotel {

    private String nombre;
    private int totalHabitaciones;
    private int habitacionesOcupadas;
    private double precioPorNoche;

    public Hotel() {
        nombre = "Sin nombre";
        totalHabitaciones = 0;
        habitacionesOcupadas = 0;
        precioPorNoche = 0.0;
    }

    public Hotel(String nombre, int totalHabitaciones, int habitacionesOcupadas, double precioPorNoche) {
        this.nombre = nombre;
        this.totalHabitaciones = totalHabitaciones;
        this.habitacionesOcupadas = 0;
        this.precioPorNoche = precioPorNoche;
    }

    /*checkIn(int noches) — ocupa una habitación e imprime el cobro total
     (noches * precioPorNoche)*/
    public void checkIn(int noches) {
        if (habitacionesOcupadas >= totalHabitaciones) {  // Verificar si hay habitaciones disponibles
            System.out.println("No hay habitaciones disponibles.");
            return;
        }
        habitacionesOcupadas++;
        double total = noches * precioPorNoche;
        System.out.println("El total por noches es: " + total);
    }

    /*checkOut() — libera una habitación, si no hay ocupadas imprime aviso*/
    public void checkOut() {
        if (habitacionesOcupadas == 0) {  // Verificar si hay habitaciones ocupadas
            System.out.println("No hay habitaciones ocupadas para hacer check-out.");
            return;
        }
        habitacionesOcupadas--;
        System.out.println("Check-out realizado. Habitación disponible.");
    }

    /*disponibilidad() — imprime cuántas habitaciones quedan libres*/
    public void disponibilidad() {
        int habitacionesDisponibles = totalHabitaciones - habitacionesOcupadas;
        System.out.println("Habitaciones disponibles: " + habitacionesDisponibles);
    }

    public void mostrarEstado() {
        System.out.println("Nombre del hotel: " + nombre);
        System.out.println("Total de habitaciones: " + totalHabitaciones);
        System.out.println("Habitaciones ocupadas: " + habitacionesOcupadas);
        System.out.println("Precio por noche: $" + precioPorNoche);
    }
}
