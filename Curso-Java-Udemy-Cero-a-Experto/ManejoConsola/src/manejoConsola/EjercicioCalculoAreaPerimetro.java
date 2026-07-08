package manejoConsola;

import java.util.Scanner;

public class EjercicioCalculoAreaPerimetro {
    public static void main(String[] args) {

        System.out.println("\n*** Calculo de Area y Perimetro de un Rectangulo ***");

        Scanner scanner = new Scanner(System.in);

        /* formulas  area = base*altura;  perimetro = 2 * (base+altura)  */

        System.out.print("Ingresa la base del rectangulo: ");
        double baseRectangulo = scanner.nextDouble();

        System.out.print("Ingresa la altura del Rectangulo: ");
        double alturaRectangulo = scanner.nextDouble();

        double areaRectangulo = baseRectangulo * alturaRectangulo;
        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        System.out.printf("""
                %nCalculo de Area y Perimetro de un Rectangulo
                ----------------------------------------------
                \tArea del Rectangulo: %.2f
                \tperimetro del Rectangulo: %.2f
                """, areaRectangulo, perimetroRectangulo);

    }
}
