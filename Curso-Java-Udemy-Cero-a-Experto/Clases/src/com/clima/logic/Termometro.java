package com.clima.logic;

public class Termometro {
    private double celsius;

    public double getCelsius(){
        return celsius;
    }

    public void setCelsius(double celsius){
        this.celsius = celsius;
    }

    // Metodo calculado: No existe el atributo fahrenheit, se calcula al vuelo
    public double getFahrenheit(){
     return (celsius * 9.0/5.0) + 32;
    }
}
