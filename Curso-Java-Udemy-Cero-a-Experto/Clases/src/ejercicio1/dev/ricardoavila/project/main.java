package ejercicio1.dev.ricardoavila.project;

import ejercicio1.dev.ricardoavila.project.estudiante.Estudiante;

public class main {
    public static void main(String[] args) {

        Estudiante estud1 = new Estudiante();

        Estudiante estud2 = new Estudiante("Juan Solis", "Contabilidad", 7.5, 8.0, 6.0);

        Estudiante estud3 = new Estudiante("Maritza Julca", "Estadistica", 5.0, 4.5, 6.0);


        estud1.calcularPromedio();
        estud1.aprobo();
        estud1.mostrarEstudiante();
        System.out.println("-".repeat(40));

        estud2.calcularPromedio();
        estud2.aprobo();
        estud2.mostrarEstudiante();
        System.out.println("-".repeat(40));

        estud3.calcularPromedio();
        estud3.aprobo();
        estud3.mostrarEstudiante();


    }
}
