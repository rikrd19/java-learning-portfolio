package beans.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SaludarAction {

    Logger log = LogManager.getLogger(SaludarAction.class);

    private String saludosAtr;

    public String execute() {
        log.info("Ejecutando metodo execute desde struts2");
        this.saludosAtr = "Hola con Struts2 con convenciones";
        return "exito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }

}
