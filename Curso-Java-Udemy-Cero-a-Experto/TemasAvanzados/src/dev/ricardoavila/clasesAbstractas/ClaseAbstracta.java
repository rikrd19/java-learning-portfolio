package dev.ricardoavila.clasesAbstractas;

public class ClaseAbstracta {
    static void main(String[] args) {

        // FiguraGeometrica figGeometrica = new FiguraGeometrica();
        // Error: No se puede instanciar una clase abstracta

        FiguraGeometrica figGeometrica = new Rectangulo();
        figGeometrica.dibujar();

        figGeometrica = new Circulo();
        figGeometrica.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica {  //  NO se pueden instanciar
    public abstract void dibujar(); // Método abstracto, no tiene implementación

}

class Rectangulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectángulo");
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un circulo");
    }
}
