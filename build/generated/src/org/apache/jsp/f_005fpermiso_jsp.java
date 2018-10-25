package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import modelo.permisoSG;
import modelo.aprendizSG;
import java.util.ArrayList;

public final class f_005fpermiso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>f_Permisos</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <h1>formulario Permiso aprendiz</h1>\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"ServletPermiso\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("                <td><input type=\"number\" name=\"f_numerodocumento\" placeholder=\"documento del aprendiz\"></td>\r\n");
      out.write("                <!--<td><input type=\"text\" name=\"f_tipo\" placeholder=\"tipo de permiso\"></td>-->\r\n");
      out.write("                ");

                
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!--seleccion de permiso--->\r\n");
      out.write("                <select name=\"tipoper\">  \r\n");
      out.write("                    <option>Tipo de permiso</option>\r\n");
      out.write("                    <option name=\"tipoper\" value=\"semana mañana\">semana mañana</option>\r\n");
      out.write("                    <option name=\"tipoper\" value=\"semana tarde\">semana tarde</option>\r\n");
      out.write("                    <option name=\"tipoper\" value=\"fin de semana\">fin de semana</option>\r\n");
      out.write("                    <option name=\"tipoper\" value=\"extra\">extra</option>\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("                <td><input type=\"date\" name=\"f_fechsal\" placeholder=\"Fecha salida\"></td>\r\n");
      out.write("                <td><input type=\"date\" name=\"f_fechingre\" placeholder=\"Fecha ingreso\"><td>\r\n");
      out.write("                <td><input type=\"time\" name=\"f_horasal\" placeholder=\"Hora salida\"></td>\r\n");
      out.write("                <td><input type=\"time\" name=\"f_horaingre\" placeholder=\"Hora ingreso\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_moti\" placeholder=\"Motivo\"></td>\r\n");
      out.write("                <td><input type=\"file\" name=\"f_evidenciaAdjunta\" accept=\"imagen/*\"><br><br></td>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <input type=\"submit\" name=\"btn-guardar\" value=\"Guardar\">\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                    \r\n");
      out.write("               \r\n");
      out.write("                <!--<input type=\"submit\" name=\"btn-permiso\" value=\"btn_permiso\">-->\r\n");
      out.write("               \r\n");
      out.write("                    \r\n");
      out.write("            </form>\r\n");
      out.write("                \r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <!--MODULO PARA LLAMAR METODO DE UNA CLASE-->\r\n");
      out.write("                \r\n");
      out.write("                <!--<form action=\"ServletPrueba\" method=\"post\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div>\r\n");
      out.write("                        <input type=\"submit\" name=\"btn-permiso\" value=\"btn_permiso\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </form>-->\r\n");
      out.write("                \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
