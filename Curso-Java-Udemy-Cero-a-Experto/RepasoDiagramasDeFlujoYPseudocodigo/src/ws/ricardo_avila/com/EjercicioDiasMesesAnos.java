package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioDiasMesesAnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        * 3. Dado un número de días , pedidos por pantalla, ¿A cuántos días, meses, años corresponde?
            Por ejemplo: Dados 366 días, la solución es 1 año y 1 día. (año 365 días;mes 30 días)
         */

        final int ANO_EN_DIAS = 365;
        final int MES_EN_DIAS = 30;
        int diasIngresados = 0;

        while (true) {
            System.out.print("\nIngrese un numero entero de dias: ");
            diasIngresados = Integer.parseInt(scanner.nextLine());

            if (diasIngresados <= 0) {
                System.out.println("¡Dias ingresados no validos !");
            } else {
                break;
            }
        }

        int anos = diasIngresados / ANO_EN_DIAS;
        int diasRestantes = diasIngresados % ANO_EN_DIAS;
        int meses = diasRestantes / MES_EN_DIAS;
        int mesRestantes = diasRestantes % MES_EN_DIAS;
        int dias = mesRestantes;

        System.out.println("El numero ingresado: "+ diasIngresados + " corresponde a: " + anos +" años, "+ meses + " meses y " + dias);
    }
}
