package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


@Results({
    @Result(name = "success", location = "/WEB-INF/content/bienvenido.jsp"), 
    @Result(name = "input",  location = "login", type = "redirectAction")
})
public class ValidarUsuarioAction extends ActionSupport {

    private static final Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;
    
    @Action("validarUsuario")
    public String execute(){
        if ("admin".equals(this.usuario)) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metodos definidos en el archivo 'LoginAction.properties'
    public String getFormUsuario() {
        return getText("form.usuario");
    }

    public String getFormPassword() {
        return getText("form.password");
    }

    public String getFormBoton() {
        return getText("form.boton");
    }

    public String getFormTitulo() {
        return getText("form.titulo");
    }

    public String getFormValores() {
        return getText("form.valores");
    }

}
