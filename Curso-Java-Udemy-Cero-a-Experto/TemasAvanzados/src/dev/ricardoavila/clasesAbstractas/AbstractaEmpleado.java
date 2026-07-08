package dev.ricardoavila.clasesAbstractas;

public class AbstractaEmpleado {
    static void main(String[] args) {

        Empleado[] empleados = {
                new EmpleadoFijo("Jorge Luna", 3000.00),
                new EmpleadoFreeLance("Tito Nieves", 120, 12.00),
        };

        for (Empleado emp : empleados) {
            emp.calcularSalario();
        }
    }
}

abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularSalario();
}

class EmpleadoFijo extends Empleado {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Nombre: " + this.nombre + ", Salario fijo: $" + this.salarioMensual);
    }
}

class EmpleadoFreeLance extends Empleado {
    private int horas;
    private double pagoPorHora;

    public EmpleadoFreeLance(String nombre, int horas, double pagoPorHora) {
        super(nombre);
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void calcularSalario() {
        double salario = horas * pagoPorHora;
        System.out.println("Nombre: " + this.nombre + ", Salario Freelance: $" + salario);

    }
}