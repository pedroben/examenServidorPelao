package net.daw.operation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.UsuarioBean;
import net.daw.dao.UsuarioDao;
import net.daw.helper.Contexto;
import net.daw.parameter.UsuarioParam;

/**
 *
 * @author rafael aznar
 */
public class UsuarioView1 implements Operation {

    @Override
    public Object execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Contexto oContexto = (Contexto) request.getAttribute("contexto");
        oContexto.setVista("jsp/usuario/form.jsp");        
        UsuarioBean oUsuarioBean;
        UsuarioDao oUsuarioDao;
        oUsuarioBean = new UsuarioBean();
        UsuarioParam oUsuarioParam = new UsuarioParam(request);
        oUsuarioBean = oUsuarioParam.loadId(oUsuarioBean);
        oUsuarioDao = new UsuarioDao(oContexto.getEnumTipoConexion());
        try {
            oUsuarioBean = oUsuarioDao.get(oUsuarioBean);
        } catch (Exception e) {
            throw new ServletException("UsuarioController: View Error: Phase 1: " + e.getMessage());
        }
        oUsuarioBean = oUsuarioParam.load(oUsuarioBean);
        return oUsuarioBean;
    }
}
