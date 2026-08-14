package ejercicio5.dev.ricardoavila.project.figura;

public class Figura {

    protected void describir() {
        System.out.println("Soy una figura geométrica");
    }
}

class Circulo extends Figura {
    public void calcularArea(double radio) {
        // areaCirculo = π * radio^2
System.out.printf("El area es %.2f%n", (Math.PI * Math.pow(radio, 2)));
    }
}

class Rectangulo extends Figura {
    public void calcularArea(double radio, double altura) {
        // areaRectangulo = base * altura
        System.out.printf("El area es %.2f%n", (radio * altura));
    }
}

class PruebaFigura{
    static void main(String[] args) {

        Circulo miCirculo = new Circulo();
        miCirculo.describir();
        miCirculo.calcularArea(10.00);

        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.describir();
        miRectangulo.calcularArea(10.00, 2.00);
    }
}