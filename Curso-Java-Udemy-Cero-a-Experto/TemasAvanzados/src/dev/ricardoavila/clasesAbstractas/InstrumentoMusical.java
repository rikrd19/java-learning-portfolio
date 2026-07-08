package dev.ricardoavila.clasesAbstractas;

import java.awt.event.WindowStateListener;

public class InstrumentoMusical {
    static void main(String[] args) {

        Instrumento[] instrumentos = {
                new Guitarra(),
                new Piano(),
                new Bateria(),
        };

        for (Instrumento instrum : instrumentos) {
            instrum.descripcion();
            instrum.tocar();
            System.out.println();

        }
    }

}

abstract class Instrumento{

    public abstract void tocar();

    public void descripcion(){
        System.out.println("Soy un instrumento musical");
    }
}

class Guitarra extends Instrumento{
    @Override
    public void tocar(){
        System.out.println("La guitarra suena con cuerdas");
    }
}

class Piano extends Instrumento{
    @Override
    public void tocar(){
        System.out.println("La Piano se suena presionando las teclas");
    }
}

class Bateria extends Instrumento{
    @Override
    public void tocar(){
        System.out.println("La Bateria suena con golpes al tambor");
    }
}