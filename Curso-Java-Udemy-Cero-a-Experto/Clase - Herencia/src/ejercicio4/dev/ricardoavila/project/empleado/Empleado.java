package ejercicio4.dev.ricardoavila.project.empleado;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInfo(){
        System.out.println("Empleado nombre: " + this.nombre+ ", salario:  "+ this.salario);
    }
}

class Gerente extends Empleado{
    public String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void mostrarDepartamento(){
        System.out.println("Departamento:" + departamento);
    }
}

class PruegaEmpleado{
    static void main(String[] args) {

        Gerente gerente1 = new Gerente("Jose Rivas", 5000.00, "Gerencia General");
        gerente1.mostrarInfo();
        gerente1.mostrarDepartamento();
    }
}



