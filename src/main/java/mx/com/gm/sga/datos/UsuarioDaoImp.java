package mx.com.gm.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.gm.sga.domain.Usuario;

@Stateless
public class UsuarioDaoImp implements UsuarioDao {
    
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;
    
    @Override
    public List<Usuario> findAllUsuario() {
        return em.createNamedQuery("Usuario.findAll").getResultList(); 
    }
    
}
