package mx.com.gm.sga.servicio;


import java.util.ArrayList;
import java.util.List;
import mx.com.gm.sga.domain.Persona;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.PersonaDao;
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Inject    
    private PersonaDao personadao;
    @Override
    public List<Persona> listarPersonas() {
       return personadao.findallPersonas();
    }

    @Override
    public Persona encontrarPersonaPorID(Persona persona) {
        return personadao.findPersonabyid(persona);
    }

    @Override
    public Persona encontarPersonaPorEmail(Persona persona) {
        return personadao.findPersonabyEmail(persona);

    }

    @Override
    public void registrarPersona(Persona persona) {
        personadao.insertPersona(persona);
    }


    @Override
    public void modificarPersona(Persona persona) {
        personadao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personadao.deletePersona(persona);
    }
    
}
