package ejercicio1.dev.ricardoavila.project.estudiante;

public class Estudiante {
    private String nombre;
    private String carrera;
    private double nota1;
    private double nota2;
    private double nota3;


    public Estudiante() {
        nombre = "Sin definir";
        carrera = "Sin definir";
        nota1 = 0.00;
        nota2 = 0.00;
        nota3 = 0.00;
    }

    public Estudiante(String nombre, String carrera, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6.0;

        //funciona pero es redundante
       /* double promedio = calcularPromedio();
        if (promedio >= 6.0) {
            return true;
        } else {
            return false;
        }*/
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota 3: " + this.nota3);
        System.out.println("Promedio: "+ calcularPromedio());
        System.out.println("Aprobo: "+ (aprobo() ? "Si" : "No"));
    }
}
