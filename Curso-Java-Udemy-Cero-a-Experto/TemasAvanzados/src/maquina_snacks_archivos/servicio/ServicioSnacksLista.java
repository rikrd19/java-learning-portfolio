package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServiciosSnacks {

    private static final List<Snack> snacks;

    // Bloque static inicializador para llenar la lista de snacks

    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Chips", 5));
        snacks.add(new Snack("Chocolate", 10));
        snacks.add(new Snack("Galletas", 7));
        snacks.add(new Snack("Caramelos", 3));
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public void mostrarSnacks() {
        String inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("------ Snacks en el inventario ------");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnack() {
        return snacks;

    }
}
