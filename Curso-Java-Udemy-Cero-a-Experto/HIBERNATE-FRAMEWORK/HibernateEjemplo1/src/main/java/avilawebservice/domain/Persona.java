package avilawebservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "id_persona")
    @Id
    private int idPersona;

    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
