package ejercicio4.dev.ricardoavila.project.factura;

public class Factura {

    private String numeroFactura;
    private String cliente;
    private double subtotal;
    private final double IMPUESTO;

    public Factura() {
        numeroFactura = "Sin numero";
        cliente = "Sin cliente";
        subtotal = 0.0;
        IMPUESTO = 16.00 /100;
    }

    public Factura(String numeroFactura, String cliente, double subtotal, double impuesto) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.IMPUESTO = 16.00/100;
    }

    public double calcularImpuesto(){
        return subtotal * IMPUESTO;
    }
    
    public double calcularTotal(){
        return subtotal + calcularImpuesto();
    }
    
    public void maostrarFactura(){
        System.out.println("Numero Factura: "+ numeroFactura);
        System.out.println("Cliente: "+ cliente);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Impuesto: %.2f %%%n" , IMPUESTO);
        System.out.printf("Impuesto calculado: %.2f%n" , calcularImpuesto());
        System.out.printf("Total: %.2f%n" , calcularTotal());
    }
   
}
