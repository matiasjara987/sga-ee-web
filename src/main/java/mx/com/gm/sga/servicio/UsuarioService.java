package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Usuario;

@Local
public interface UsuarioService {
    public List<Usuario> listarUsuarios();
}
