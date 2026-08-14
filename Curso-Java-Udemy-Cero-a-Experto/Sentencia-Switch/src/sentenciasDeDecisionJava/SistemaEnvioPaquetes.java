package sentenciasDeDecisionJava;

import java.util.Locale;
import java.util.Scanner;

public class SistemaEnvioPaquetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n***** Sistema de Envio de Paquetes *****");

        final double COSTO_TARIFA_NACIONAL = 10.0;
        final double COSTO_TARIFA_INTERNACIONAL = 20.0;

        System.out.print("Ingrese el Destino (nacional/internacional): ");
        String destino = sc.nextLine();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();

        if (destino.equalsIgnoreCase("nacional")) {
            double costoEnvio = peso * COSTO_TARIFA_NACIONAL;
            System.out.printf("El costo de envio del paquete de peso %.2f kg , a destino %s, costo envio $%.2f", peso, destino.substring(0, 1).toUpperCase() + destino.substring(1).toLowerCase(), costoEnvio);

        } else if (destino.equalsIgnoreCase("internacional")) {
            double costoEnvio = peso * COSTO_TARIFA_INTERNACIONAL;
            System.out.printf("El costo de envio del paquete de peso %.2f kg , a destino %s, costo envio $%.2f", peso, destino.substring(0, 1).toUpperCase() + destino.substring(1).toLowerCase(), costoEnvio);
        } else {
            System.out.println("Destino desconocido. Por favor ingrese 'nacional' o 'internacional'.");
        }

        System.out.println("\n------------------------------------------------\n");
        sc.nextLine();

        System.out.print("Ingrese el destino (nacional/internacional): ");
        String destinoEnvio = sc.nextLine();

        System.out.print("Ingrese el peso en kg: ");
        double pesoEnvio = sc.nextDouble();

        Double costoEnvio = switch (destinoEnvio) {
            case "nacional" -> pesoEnvio * COSTO_TARIFA_NACIONAL;
            case "internacional" -> pesoEnvio * COSTO_TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino Invalido. Ingrese nacional/internacional !!");
                yield null;
            }
        };

        // Mostrar el resultado del costo de envío
        if (costoEnvio != null) {
            System.out.printf("El costo de envio del paquete de peso %.2f kg , a destino %s, costo envio $%.2f", pesoEnvio, destinoEnvio.substring(0, 1).toUpperCase() + destinoEnvio.substring(1).toLowerCase(), costoEnvio);
        }

    }
}
