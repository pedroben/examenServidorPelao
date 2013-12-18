package net.daw.control;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.daw.helper.Contexto;
import net.daw.operation.Operation;
import net.daw.parameter.ContextParam;

public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
        Contexto oContexto = new Contexto();
        ContextParam oContextParam = new ContextParam(request);
        oContexto=oContextParam.loadSession(oContexto);
        oContexto = oContextParam.load(oContexto); 
        oContexto.setEnumTipoConexion(net.daw.helper.Enum.Connection.DriverManager);
        request.setAttribute("contexto", oContexto);
        try {
            String strNombreOperacion = "net.daw.operation." + oContexto.getOperacion();
            Operation oOperation = (Operation) Class.forName(strNombreOperacion).newInstance();
            try {
                oContexto.setParametro(oOperation.execute(request, response));
            } catch (Exception e) {
                throw new ServletException("Controller: Error: ServletException " + e.getMessage());
            }
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (InstantiationException e) {
            throw new ServletException("Controller: Error: InstantiationException " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new ServletException("Controller: Error: IllegalAccessException " + e.getMessage());
        } catch (ClassNotFoundException e) {
            oContexto.setVista("jsp/mensaje.jsp");
            oContexto.setParametro("Lo sentimos pero la operación no está disponible en estos momentos");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServletException("Controller: Error: ClassNotFoundException " + ex.getMessage());
        }
    }
//
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServletException("Controller: Error: ClassNotFoundException " + ex.getMessage());
        }
    }
}
