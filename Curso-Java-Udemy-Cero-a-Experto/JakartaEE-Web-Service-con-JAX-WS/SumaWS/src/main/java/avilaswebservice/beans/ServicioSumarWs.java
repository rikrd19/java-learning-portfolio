package avilaswebservice.beans;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "ServicioSumarWS")
public interface ServicioSumarWs {

    @WebMethod
    int sumar(int a, int b);
}
