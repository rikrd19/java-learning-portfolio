package ejercicio3.dev.ricardoavila.project.dispositivo;

public class Dispositivo {

    protected void encender(){
        System.out.println("Todos los dispositivos encendidos");
    }

    protected void apagar(){
        System.out.println("Todos los dispositivos apagados");
    }
}

class Computadora extends Dispositivo{

    public void ejecutarPrograma(String nombre){
        System.out.println("El nombre del programa es: " + nombre);
    }
}

class PruebaDispositivo{
    public static void main(String[] args) {
        Dispositivo miDispositivo = new Dispositivo();
        miDispositivo.encender();
        miDispositivo.apagar();
        System.out.println();


        Computadora miComputadora = new Computadora();
        miComputadora.encender();
        miComputadora.apagar();
        miComputadora.ejecutarPrograma("Python");
    }
}