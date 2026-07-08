public interface Traductor {

    // metodos publicos y abstractos por defecto
    void traducir();

    // Metodos con implemetacion por default
    default void iniciarTraductor() {
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduzco a Ingles");
    }
}

class Frances implements Traductor {
    public void traducir() {
        System.out.println("Traduzco a Frances");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traducto en Frances...");
    }
}

class PruebaTraductor {
    static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        System.out.println();

        // Traductor en Frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
