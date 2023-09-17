package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Usuario;


public interface UsuarioDao {
    public List<Usuario> findAllUsuario();
} 
