package Controller;

import DAO.PersonaDAO;
import Entidad.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*@author Isidro*/

public class Persona_Controller implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        ModelAndView mv = new ModelAndView("Vista_Personas");
        
        try {
            PersonaDAO personaDAO = new PersonaDAO();
            List<Persona> lista = personaDAO.listar_personas();
            mv.addObject("lista", lista);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return mv;
    }

}
