package ejercicio2.dev.ricardoavila.project.Persona;

public class Persona {

    protected void caminar() {
        System.out.println("Camino siempre");
    }

    protected void hablar() {
        System.out.println("Yo hablo español");
    }
}


class Estudiante extends Persona {

    public void estudiar() {
        System.out.println("Voy a clases de lunes a viernes");
    }
}

class PruebaPersona {
    public static void main(String[] args) {

        Estudiante miEstudiante = new Estudiante();
        miEstudiante.caminar();
        miEstudiante.hablar();
        miEstudiante.estudiar();

    }
}