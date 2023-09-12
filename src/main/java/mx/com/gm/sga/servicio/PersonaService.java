package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Persona;

@Local
public interface PersonaService {
      public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorID(Persona persona);

    public Persona encontarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
