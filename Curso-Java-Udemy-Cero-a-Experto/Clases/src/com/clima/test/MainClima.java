package com.clima.test;

import com.clima.logic.Termometro;

public class MainClima {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Conversion Climatica ***");

        Termometro termomet = new Termometro();

        termomet.setCelsius(25.00);

        System.out.printf("La temperatura origianal: %.2fC%n", termomet.getCelsius());
        System.out.println("La temperatura en Fahrenheit: " + termomet.getFahrenheit());

    }

}
