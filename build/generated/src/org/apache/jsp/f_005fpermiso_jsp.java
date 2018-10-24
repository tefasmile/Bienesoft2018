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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>f_Permisos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>formulario Permiso aprendiz</h1>\n");
      out.write("            \n");
      out.write("            <form action=\"ServletPermiso\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                <td><input type=\"number\" name=\"f_numerodocumento\" placeholder=\"documento del aprendiz\"></td>\n");
      out.write("                <!--<td><input type=\"text\" name=\"f_tipo\" placeholder=\"tipo de permiso\"></td>-->\n");
      out.write("                ");

                consultas con = new consultas();
                HttpSession dato = request.getSession();
                
                int documento = (int) dato.getAttribute("f_numerodocumento");
                
                
      out.write("\n");
      out.write("\n");
      out.write("                <!--seleccion de permiso--->\n");
      out.write("                <select name=\"tipoper\">  \n");
      out.write("                    <option>Tipo de permiso</option>\n");
      out.write("                    <option name=\"tipoper\" value=\"semana\">semana</option>\n");
      out.write("                    <option name=\"tipoper\" value=\"fin de semana\">fin de semana</option>\n");
      out.write("                    <option name=\"tipoper\" value=\"emergencia\">emergencia</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <td><input type=\"date\" name=\"f_fechsal\" placeholder=\"Fecha salida\"></td>\n");
      out.write("                <td><input type=\"date\" name=\"f_fechingre\" placeholder=\"Fecha ingreso\"><td>\n");
      out.write("                <td><input type=\"time\" name=\"f_horasal\" placeholder=\"Hora salida\"></td>\n");
      out.write("                <td><input type=\"time\" name=\"f_horaingre\" placeholder=\"Hora ingreso\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"f_moti\" placeholder=\"Motivo\"></td>\n");
      out.write("                <td><input type=\"file\" name=\"f_evidenciaAdjunta\" accept=\"imagen/*\"><br><br></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input type=\"submit\" name=\"btn-guardar\" value=\"Guardar\">\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                <!--<input type=\"submit\" name=\"btn-permiso\" value=\"btn_permiso\">-->\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--MODULO PARA LLAMAR METODO DE UNA CLASE-->\n");
      out.write("                \n");
      out.write("                <!--<form action=\"ServletPrueba\" method=\"post\">\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" name=\"btn-permiso\" value=\"btn_permiso\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </form>-->\n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
