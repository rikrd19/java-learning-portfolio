package manejoConsola;

import java.util.Scanner;

public class EjercicioRangoVariable {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        int datoEntero = sca.nextInt();

        // valores a considerar entre 1 y 10
        boolean estaDentroRango = datoEntero >= 1 && datoEntero <= 10;

        System.out.println("Variable dentro de rango (1-10)?: " + estaDentroRango);

        // revisar la logica inversa , si el dato esta fuera del rango
        boolean estafueraRango = !(datoEntero >= 1 && datoEntero <= 10);

        System.out.println("Variable esta fuera del rango(1-10)?: "+ estafueraRango);
        
        
        // Calculadoras de tarifa de envio
        // zona: 1 = local , 2 = nacional, 3 = internacional, peso: en kg, clientes: VIP: true/false

        System.out.print("Que tipo de Zona eres (1 = Local, 2 = Nacional, 3 = Internacional): ");
        int tipoZona = sca.nextInt();

        System.out.print("Cual es el peso de envio?: ");
        double peso = sca.nextDouble();

        System.out.print("Eres cliente VIP?(true/false): ");
        boolean esClienteVIP = sca.nextBoolean();

        // paso 1: calcular precio por kg (ternario)
        double precioPorKg = (tipoZona == 1) ? 5 :
                             (tipoZona == 2) ? 10 :
                             (tipoZona == 3) ? 20 : 0;

        // paso 2: Envio gratis? (zona 1 y peso < 5kg)
        boolean envioGratis = (tipoZona == 1 && peso < 5);

        // paso 3: Calcular subtotal
        double subtotal = envioGratis ? 0 : precioPorKg * peso;

        // paso 4: Aplicar descuento VIP si aplica (ternario)
        double totalPagar = (esClienteVIP && !envioGratis) ? subtotal * 0.80 : subtotal; // 20% de descuento para VIP si no es envio gratis

        // paso 5: Mostrar resultado
        System.out.printf("""
                %nTipo de Zona %d
                -----------------
                \tPeso: %.2fKg
                \tCliente VIP: %b%n""", tipoZona, peso, esClienteVIP);
        System.out.printf("""
                \tPrecio por Kg: $%.0f
                \tSubtotal: $%.2f
                \tTotal: $%.2f%n""", precioPorKg, subtotal, totalPagar);



        //Ejercicio 2: Clasificador de Riesgo Crediticio(triple Ternario)

        System.out.println("\n**** Clasificador de Riesgo Crediticio ****");

        System.out.print("Cual es su ingreso mensual?: ");
        double ingresoMensual = sca.nextDouble();

        System.out.print("Cual es su deuda actual?: ");
        double deudaActual = sca.nextDouble();

        System.out.print("Cual es tu historial crediticio (A=Excelente, B=Bueno, C=Regular, D=Malo): ");
        char historial = sca.next().charAt(0); // Leer un solo caracter para el historial crediticio
        historial = Character.toUpperCase(historial);

        double ratioEndeudamiento = deudaActual / ingresoMensual;

       String riesgo = (ingresoMensual > 5000 && ratioEndeudamiento < 0.3 &&
               (historial =='A' || historial == 'B') ? "Riesgo BAJO" :
                           (ingresoMensual > 3000 && ratioEndeudamiento < 0.5 &&
                                   historial != 'D') ? "Riesgo MEDIO" :
                           (ingresoMensual > 2000 && ratioEndeudamiento < 0.7) ? "Riesgo Alto" : "RECHAZADO");

        System.out.printf("""
                \nIngreso Mensual: $%.2f
                Deuda Actual: $%.2f
                Ratio de Endeudamiento: %.2f
                Historial Crediticio: %s
                Condiciones de Riesgo: %s%n""", ingresoMensual, deudaActual, ratioEndeudamiento, historial, riesgo);


        // Ejercicio 3: Verificar Mayor de Edad(operador ternario)
        System.out.println("\n**** Verificar Mayor de Edad ****");

        System.out.println("Ingresa tu edad: ");
        int edad= sca.nextInt();

        String mayorEdad = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println("Tu edad es "+ edad + ", "+ mayorEdad);



        // Ejercicio 4: Numero par impar  (operador ternario)

        System.out.println("\n**** Verificar si un numero es par o impar ****");

        System.out.println("Ingresa un numero entero: ");
        int numero = sca.nextInt();

        String resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";

    }
}
