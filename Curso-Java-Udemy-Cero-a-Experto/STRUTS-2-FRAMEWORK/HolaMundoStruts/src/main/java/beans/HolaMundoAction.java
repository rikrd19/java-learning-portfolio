package beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HolaMundoAction {

    Logger log = LogManager.getLogger(HolaMundoAction.class);

    private String saludosAtr;

    public String execute() {
        log.info("Ejecutando metodo execute desde struts2");
        this.saludosAtr = "Adiós desde Struts2";
        return "exito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }

}
