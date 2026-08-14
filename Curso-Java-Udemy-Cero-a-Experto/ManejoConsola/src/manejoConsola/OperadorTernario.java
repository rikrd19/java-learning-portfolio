package manejoConsola;

public class OperadorTernario {
    public static void main(String[] args) {

        System.out.println("**** Operador Ternario ****");

        //sintaxis del operador ternario
        // condicion ? (exp1)valorSiVerdadero : (exp2)valorSiFalso

        // Determinar si un numero es paar o no
        int numero = 5;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);

        //Calcular si es mayor de edad
        int edad = 18;
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("Tienes " + edad + ", " + mensaje);

        // valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El numero " + numero + " es " + resultado);

        // calcular el mayor de dos numeros
        int num1 = 10;
        int num2 = 20;

        int numMayor = (num1 > num2) ? num1 : num2;
        System.out.println("El mayor de numero " + num1 + " y " + num2 + " es " + numMayor);

        // Asignar descuento basado en la membresia
        boolean esMiembro = false;
        double descuento = esMiembro ? 0.1 : 0.05;
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");

        // evaluar una condicion anidada
        int nota = 100;
        String calificacion = (nota >= 90) ? "A" :
                              (nota >= 80) ? "B" :
                              (nota >= 70) ? "C" :
                              (nota >= 60) ? "D" : "F";

        System.out.println("La calificacion es " + calificacion);

    }
}
