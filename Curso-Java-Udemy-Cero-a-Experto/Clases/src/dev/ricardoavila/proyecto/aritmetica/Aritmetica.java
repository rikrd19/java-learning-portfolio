package dev.ricardoavila.proyecto.aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor vacio/Sin argumentos para inicializar los atributos
    public Aritmetica() {
    }

    // Constructor con argumentos para inicializar los atributos
    public Aritmetica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar() {
        int resultado = this.operando1 + this.operando2;
        System.out.println("Suma: " + resultado);
    }

    public void restar() {
        int resultado = this.operando1 - this.operando2;
        System.out.println("Resta: " + resultado);
    }
    public int getOperando1() {
        return this.operando1;
    }
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }
    public int getOperando2() {
        return this.operando2;
    }
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
