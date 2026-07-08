package ejercicio3.dev.ricardoavila.project.main;

import ejercicio3.dev.ricardoavila.project.piscina.Piscina;

public class Main {
    public static void main(String[] args) {

        Piscina pisc1 = new Piscina(1000, 1000, true);

        pisc1.llenar(400);
        pisc1.vaciar(1000);
        pisc1.abrirPiscina();
        pisc1.mostrarEstado();
        System.out.println("-".repeat(50));

        Piscina pisc2 = new Piscina(800, 0, false);

        pisc2.llenar(400);
        pisc2.vaciar(200);
        pisc2.abrirPiscina();
        pisc2.mostrarEstado();



    }
}
