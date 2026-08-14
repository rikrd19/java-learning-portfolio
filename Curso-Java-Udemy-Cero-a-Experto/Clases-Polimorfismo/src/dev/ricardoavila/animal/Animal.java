package dev.ricardoavila.animal;

public class Animal {

    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    protected void hacerSonido() {
        System.out.println("El perro wauf wauf");
    }
}

class Gato extends Animal {

    protected void hacerSonido() {
        System.out.println("El gato miau miau");
    }
}

class PruebaAnimal {

    // Método polimorfico que acepta cualquier tipo de Animal
    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }


    public static void main(String[] args) {

        // Objeto de la clase Padre(Animal)
        Animal animal = new Animal();
        imprimirSonido(animal);
        System.out.println("-----------------------------");

        // Objeto de la clase Hija(Perro)
        Perro perro = new Perro();
        imprimirSonido(perro);
        System.out.println("-----------------------------");


        // Objeto de la clase Hija(Gato)
        Gato gato = new Gato();
        imprimirSonido(gato);

        System.out.println("------- Array Polimórfico -------------------");

        Animal[] animales = {new Perro(), new Gato(), new Perro()};

        for (Animal a : animales) {
            a.hacerSonido(); //cada uno ejecuta su propia versión
        }
    }
}

