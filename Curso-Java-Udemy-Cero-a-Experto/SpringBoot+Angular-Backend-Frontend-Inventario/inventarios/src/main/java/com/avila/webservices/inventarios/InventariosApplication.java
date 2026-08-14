package com.avila.webservices.inventarios;

import com.avila.webservices.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {

        SpringApplication.run(InventariosApplication.class, args);


        // Prueba de lomnbok
        Producto producto = new Producto();
        producto.setDescripcion("Camisa M");
        producto.setPrecio(19.99);
        producto.setExistencia(30);

        // imprimir el  objeto de tipo producto
        System.out.println(producto);
	}

}
