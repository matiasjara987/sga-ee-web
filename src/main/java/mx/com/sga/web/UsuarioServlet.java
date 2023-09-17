package mx.com.sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.sga.domain.Usuario;
import mx.com.gm.sga.servicio.UsuarioService;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet{
  
    @Inject 
    UsuarioService usuarioservice;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> usuarios = usuarioservice.listarUsuarios();
        System.out.println("usuario: "+ usuarios);
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("/ListarUsuarios.jsp").forward(request, response);
    }
}
