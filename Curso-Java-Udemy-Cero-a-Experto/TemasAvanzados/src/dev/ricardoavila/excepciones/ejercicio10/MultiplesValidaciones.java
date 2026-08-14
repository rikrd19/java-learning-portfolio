package dev.ricardoavila.excepciones.ejercicio10;

public class MultiplesValidaciones {

    public static void procesarUsuario(String nombre, int edad, double salario){
        if (nombre == null) {
            throw new NullPointerException("Nombre no puede ser null");
        }

        if(edad < 18){
            throw new IllegalArgumentException("Debes ser mayor de 18, edad recibida: "+ edad);
        }

        if(salario <= 0){
            throw new ArithmeticException("Salario no puede ser menor a 0, salario es: "+ salario);
        }

        System.out.println("Usuario Válido: "+nombre+ ", Edad: "+ edad + ", Salario: $"+ salario);
    }
}
