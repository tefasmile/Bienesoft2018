package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import modelo.alimentacionSG;
import java.util.ArrayList;

public final class t_005falimentacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Alimentacion</h1>\n");
      out.write("        <table align=\"center\" border=\"1\" width=\"800\">\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Tabla habitacion</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th class=\"center\">Aid</th>\n");
      out.write("                <th class=\"center\">Tipo alimento</th>\n");
      out.write("                <th class=\"center\">Descripcion</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ArrayList<alimentacionSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaAlimentacion();
                alimentacionSG igs=new alimentacionSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                
            
            
      out.write("\n");
      out.write("            \n");
      out.write("        <form action=\"ServletAlimentacion\">\n");
      out.write("        <tr>\n");
      out.write("            <td><input  name=\"t_aid\"   value=\"");
      out.print(igs.getId());
      out.write("\"     type=\"number\"></td>\n");
      out.write("            <td><input  name=\"t_tipo\"  value=\"");
      out.print(igs.getTipo());
      out.write("\"></td>\n");
      out.write("            <td><input  name=\"t_descp\" value=\"");
      out.print(igs.getDescrip());
      out.write("\" type=\"text\"></td>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            <td><input type=\"submit\" name=\"btn-modificar\" value=\"Modificar\"></td>\n");
      out.write("            <td><input type=\"submit\" name=\"btn-eliminar\" value=\"Eliminar\"></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            }
        
      out.write("    \n");
      out.write("        </table>\n");
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
