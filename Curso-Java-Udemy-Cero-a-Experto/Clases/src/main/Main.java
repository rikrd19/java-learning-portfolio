package main;

import esquema.telefono.Telefono;

public class Main {
    public static void main(String[] args) {

        Telefono telef = new Telefono("Apple", "Iphone 17 Pro", 100, false);

        Telefono telef2 = new Telefono("Xiomi", "Redmi NOre 12", 50, false);

        telef.encender();
        telef.usarBateria(30);
        telef.mostrarEstado();
        System.out.println("-----------------------------");

        telef2.encender();
        telef2.usarBateria(30);
        telef2.mostrarEstado();

    }
}
