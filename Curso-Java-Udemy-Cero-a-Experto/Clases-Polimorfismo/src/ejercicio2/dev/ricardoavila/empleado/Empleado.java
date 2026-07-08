package ejercicio2.dev.ricardoavila.empleado;

public class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    protected void calcularSalario() {
        System.out.println("Salario no definido");
    }
}

class EmpleadoFijo extends Empleado {
    protected double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    protected void calcularSalario() {
        System.out.println("Salario fijo: " + salarioMensual);
    }
}

class EmpleadoFreelance extends Empleado {
    protected int horasTrabajadas;
    protected double pagoPorHora;

    public EmpleadoFreelance(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    protected void calcularSalario() {
        System.out.println("HOras Trabajadas freelance: " + (horasTrabajadas * pagoPorHora));
    }
}

class EmpleadoComision extends Empleado {

    protected double ventasTotales;
    protected double porcentaje;

    public EmpleadoComision(String nombre, double ventasTotales, double porcentaje) {
        super(nombre);
        this.ventasTotales = ventasTotales;
        this.porcentaje = porcentaje;
    }

    @Override
    protected void calcularSalario() {
        System.out.println("Ventas totales: " + (ventasTotales * porcentaje) / 100);
    }
}

class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado[] empleados1 = {
                new EmpleadoFijo("Juan", 3000),
                new EmpleadoFreelance("Carla", 5, 20.0),
                new EmpleadoComision("Reinaldo", 5000.0, 10)
        };

        for (Empleado e : empleados1) {
            e.calcularSalario();
            System.out.println("-----------------------------");
        }
        }

}
