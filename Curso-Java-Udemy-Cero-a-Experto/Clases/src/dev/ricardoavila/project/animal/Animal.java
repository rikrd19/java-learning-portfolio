package dev.ricardoavila.project.animal;

public class Animal {

    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }
    
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

}

class Perro extends Animal{

    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas al dia"); // Sobrescribo el método dormir() de la clase Padre Animal

        System.out.println("Metodo Clase Padre");
        super.dormir(); // Llamo al método dormir() de la clase Padre Animal
    }

    @Override
    protected void comer(){
        System.out.println("Como croquetas"); // Sobrescribo el método comer() de la clase Padre Animal
    }

}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");
        System.out.println("Clase Padre, soy un Animal");

        Animal animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); // no está definido en la clase Padre Animal

        System.out.println("\nClase Hija, soy un Perro");
        Perro perro1 = new Perro();

        perro1.comer(); // heredado de Animal
        perro1.dormir(); // heredado de Animal
        perro1.hacerSonido(); // método específico de Perro
    }

}

