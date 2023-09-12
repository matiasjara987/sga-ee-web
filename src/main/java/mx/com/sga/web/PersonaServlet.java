package mx.com.sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;

@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet{
    @Inject
    PersonaService personaservice;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Persona> personas = personaservice.listarPersonas();
        System.out.println(personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/ListarPersonas.jsp").forward(request, response);
    }
}
