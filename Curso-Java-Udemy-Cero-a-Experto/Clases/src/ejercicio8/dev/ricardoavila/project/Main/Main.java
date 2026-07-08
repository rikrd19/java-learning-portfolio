package ejercicio8.dev.ricardoavila.project.Main;

import ejercicio8.dev.ricardoavila.project.hotel.Hotel;

public class Main {
    public static void main(String[] args) {


        Hotel hotel1 = new Hotel("Hotel Sol", 100, 0, 150.0);
        hotel1.checkIn(2);
        hotel1.checkOut();
        hotel1.disponibilidad();
        hotel1.mostrarEstado();
        System.out.println("-".repeat(60));


        Hotel hotel2 = new Hotel("Hotel Luna", 50, 0, 100.0);
        hotel2.checkIn(5);
        hotel2.checkOut();
        hotel2.disponibilidad();
        hotel2.mostrarEstado();
    }
}
