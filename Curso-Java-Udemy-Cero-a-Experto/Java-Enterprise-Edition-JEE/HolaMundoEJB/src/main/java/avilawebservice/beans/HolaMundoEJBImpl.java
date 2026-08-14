package avilawebservice.beans;

import jakarta.ejb.Stateless;


@Stateless
public class HolaMundoEJBImpl implements HolaMundoEjbRemote{

    @Override          
    public int sumar(int a, int b) {
        System.out.println("Ejecutando Método suma en el servidor");
        return a + b;
    }
    
}
