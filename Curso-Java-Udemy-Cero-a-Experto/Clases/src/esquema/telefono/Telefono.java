package esquema.telefono;

public class Telefono {

    private String marca;
    private String modelo;
    private int bateria;
    private boolean encendido;

    // Constructor vacio
    public Telefono() {
        marca = "Desconocido";
        modelo = "Desconocido";
        bateria = 100;
        encendido = false;
    }

    // Constructor con 4 parametros
    public Telefono(String marca, String modelo, int bateria, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.encendido = encendido;
    }

    public void encender() {
        if (encendido) {
            System.out.println("El teléfono "+ this.marca + " ya está encendido");
        } else {
            encendido = true;
            System.out.println("El telefono "+ this.marca +" encendido");
        }
    }

    public void usarBateria(int consumo){
        if (bateria >= consumo) {
            bateria -= consumo;
            System.out.println("Has consumido: "+ consumo + "% de bateria");
        }else{
            encendido = false;
            bateria = 0;
            System.out.println("La bateria esta en 0% el telefono se ha apagado");
        }
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Bateria: "+ this.bateria + "%");
        System.out.println("Encendido: "+ (this.encendido ? "Sí" : "No"));
    }

}
