package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.UsuarioDao;
import mx.com.gm.sga.domain.Usuario;

@Stateless
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote {

    @Inject
    private UsuarioDao usuariodao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuariodao.findAllUsuario();
    }

}
