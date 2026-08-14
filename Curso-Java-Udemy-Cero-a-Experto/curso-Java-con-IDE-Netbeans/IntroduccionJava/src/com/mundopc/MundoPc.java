package com.mundopc;

import com.avila.websystem.*;

public class MundoPc {

    public static void main(String[] args) {

        // Monitores
        Monitor monitorHP = new Monitor("HP", 13);
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Monitor monitorDell = new Monitor("Dell", 27);
        Monitor monitorAsus = new Monitor("Asus", 24);

        // Teclados
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Teclado tecladoAsus = new Teclado("USB", "Asus");   

        // Ratones
        Raton ratonHP = new Raton("bluetooth", "HP");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Raton ratonDell = new Raton("USB", "Dell");         
        Raton ratonAsus = new Raton("USB", "Asus");

        // Computadoras
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);     // ← NUEVA
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);     // ← NUEVA 

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraAsus);

        orden1.mostrarOrden();
        
       
    }
    
     

}
