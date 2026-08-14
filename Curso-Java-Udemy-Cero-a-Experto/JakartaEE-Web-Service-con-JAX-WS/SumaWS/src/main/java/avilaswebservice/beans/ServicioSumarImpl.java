package avilaswebservice.beans;

import jakarta.ejb.Stateless;
import jakarta.jws.WebService;

@Stateless
@WebService(
        serviceName = "ServicioSumarImplService",
        portName = "ServicioSumarImplPort",
        endpointInterface = "avilaswebservice.beans.ServicioSumarWs"
)
public class ServicioSumarImpl implements ServicioSumarWs {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
}
