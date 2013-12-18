package net.daw.operation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.UsuarioBean;
import net.daw.dao.UsuarioDao;


import net.daw.helper.Contexto;
import net.daw.parameter.UsuarioParam;


public class UsuarioNew2 implements Operation {

    @Override
    public Object execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Contexto oContexto = (Contexto) request.getAttribute("contexto");
        oContexto.setVista("jsp/mensaje.jsp");
        UsuarioBean oUsuarioBean = new UsuarioBean();
        UsuarioDao oUsuarioDao = new UsuarioDao(oContexto.getEnumTipoConexion());
        UsuarioParam oUsuarioParam = new UsuarioParam(request);
        oUsuarioBean = oUsuarioParam.loadId(oUsuarioBean);
        try {
            oUsuarioBean = oUsuarioParam.load(oUsuarioBean);
        } catch (NumberFormatException e) {
            return "Tipo de dato incorrecto en uno de los campos del formulario";
        }
        try {
            oUsuarioDao.set(oUsuarioBean);
        } catch (Exception e) {
        String strMensaje = "No se puede crear el usuario";
        return strMensaje;
            //throw new ServletException("UsuarioController: New Error: Phase 2: " + e.getMessage());
        }
        String strMensaje = "Se ha añadido la información del cliente con id=" + Integer.toString(oUsuarioBean.getId()) + "<br />";
        strMensaje += "<a href=\"Controller?class=usuario&method=view&id=" + oUsuarioBean.getId() + "\">Ver usuario creado en el formulario</a><br />";
        return strMensaje;
    }
}
