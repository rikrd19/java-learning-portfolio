package dev.ricardoavila.ventas;

public class PruebaVentas {

    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        Producto producto1 = new Producto("Blusa", 30.00);

        Producto producto2 = new Producto("Zapatos", 60.00);

        // Creacion del Primer Orden
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        // Creacion del Segundo Orden
        Orden orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 20.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }
}
