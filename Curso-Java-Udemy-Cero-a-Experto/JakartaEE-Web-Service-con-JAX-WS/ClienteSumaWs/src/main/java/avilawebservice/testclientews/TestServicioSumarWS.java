package avilawebservice.testclientews;

import clientews.servicio.ServicioSumarWS;
import clientews.servicio.ServicioSumarImplService;


public class TestServicioSumarWS {
    
    public static void main(String[] args) {
        
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando Servicio sumar WS");
        int x = 8;
        int y = 7;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("Resultado: "+ resultado);
        System.out.println("Fin de servicio sumar WS");
        
    }
}
