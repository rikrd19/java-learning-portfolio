package com.ricardoavila.project.projecto;

public class Vehiculo {
    // Atributos
    String marca;
    String modelo;
    int velocidadActual;
    int velocidadMaxima;

    // Métodos
    public void acelerar(int incremento){
        velocidadActual += incremento;
        if (velocidadMaxima > velocidadActual) {
            velocidadActual = velocidadMaxima;
            System.out.println("Acelerando. Velocidadad Actual: " + velocidadActual);
        }
    }

    public void frenar(int decremento){
            velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("Frenando. Velocidad actual: " + velocidadActual);
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad actual: "+ velocidadActual);
    }

    public static void main(String[] args) {
        System.out.println("***** Clase Vehículo *****");

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Mitsubishi";
        vehiculo1.modelo = "Panel";
        vehiculo1.velocidadActual = 50;
        vehiculo1.velocidadMaxima = 250;
        vehiculo1.acelerar(110);
        vehiculo1.acelerar(120);
        vehiculo1.frenar(100);

        vehiculo1.mostrarEstado();
    }
}
