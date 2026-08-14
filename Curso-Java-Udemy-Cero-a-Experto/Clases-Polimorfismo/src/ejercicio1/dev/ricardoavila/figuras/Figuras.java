package ejercicio1.dev.ricardoavila.figuras;

public class Figuras {

    protected void calcularArea() {
        System.out.println("Area no definida");
    }
}

class Circulo extends Figuras {

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    protected void calcularArea() {
        System.out.printf("\nEl área del Círculo es: %.2f%n" , (Math.PI * radio * radio));

    }
}

class Rectangulo extends Figuras {
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected void calcularArea () {
        System.out.printf("El área del Rectángulo es: %.2f%n", (base * altura));
    }
}

class Triangulo extends Figuras{
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected void calcularArea() {
        System.out.printf("El área del Triángulo es: %.2f%n", ((base * altura) / 2));
    }
}

class PruebaFiguras {
    public static void main(String[] args) {

        Figuras[] figuras = {
                new Circulo(10),
                new Rectangulo(10, 20),
                new Triangulo(10, 5)
        };

        for (Figuras f : figuras){
            f.calcularArea();
            System.out.println();
        }
    }
}