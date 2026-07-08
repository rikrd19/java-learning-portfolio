package com.avilawebservices.datos;


import com.avilawebservices.domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;



public interface IPersonaDAO {
    
    public List<PersonaDTO> select() throws SQLException;
    
    public int insert(PersonaDTO personaDto) throws SQLException;
    
    public int update(PersonaDTO personaDto) throws SQLException;
    
    public int delete(PersonaDTO personaDto) throws SQLException;
    
}
