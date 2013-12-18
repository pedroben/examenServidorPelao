<%@page import="net.daw.helper.Contexto"%>
<% Contexto oContexto = (Contexto) request.getAttribute("contexto");%>
<%
    String menu = "<div class=\"well sidebar-nav\"><ul class=\"nav nav-list\">";

    menu += "<li class=\"nav-header\">Sesión</li>";
    if (oContexto.getClase().equals("usuario") && oContexto.getMetodo().equals("ocioso")) {
        menu += "<li class=\"active\">";
    } else {
        menu += "<li>";
    }
    menu += "<a href=\"Controller\"><i class=\"icon-home\"></i> home</a></li>";

    if (!oContexto.getHaySesion()) {
        if (oContexto.getClase().equals("usuario") && oContexto.getMetodo().equals("login")) {
            menu += "<li class=\"active\">";
        } else {
            menu += "<li>";
        }
        menu += "<a href=\"Controller?class=usuario&method=login\">login</a></li>";
    } else {
        if (oContexto.getClase().equals("usuario") && (oContexto.getMetodo().equals("list") || oContexto.getMetodo().equals("update") || oContexto.getMetodo().equals("remove") || oContexto.getMetodo().equals("view"))) {
            menu += "<li class=\"active\">";
        } else {
            menu += "<li>";
        }
        menu += "<a href=\"Controller?class=usuario&method=list\"><i class=\"icon-user\"></i> usuario</a></li>";
        if (oContexto.getClase().equals("usuario") && oContexto.getMetodo().equals("logout")) {
            menu += "<li class=\"active\">";
        } else {
            menu += "<li>";
        }
        menu += "<a href=\"Controller?class=usuario&method=logout\"><i class=\"icon-off\"></i> logout</a></li>";
        //----------------------------------------------------------------------
        menu += "<li class=\"nav-header\">actividades</li>";

        if (oContexto.getClase().equals("actividad") && oContexto.getMetodo().equals("list")) {
            menu += "<li class=\"active\">";
        } else {
            menu += "<li>";
        }
        menu += "<a href=\"Controller?class=actividad&method=list\"><i class=\"icon-wrench\"></i> actividad</a></li>";   

    }
    menu += "</ul></div>";


%>
<%=menu%>
