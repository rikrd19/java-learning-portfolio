package avilawebservice.beans;


public class Rectangulo {
    
    private int base;
    private int altura;

    // getter and setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // Metodo para calcular el area de un recrtangulo
    public int getArea(){
        return this.base * this.altura;
    }
    
}
