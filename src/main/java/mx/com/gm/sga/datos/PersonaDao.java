package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Persona;

public interface PersonaDao {
    public List<Persona> findallPersonas();
    
    public Persona findPersonabyid(Persona persona);
    
    public Persona findPersonabyEmail(Persona persona);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
    
    
}
