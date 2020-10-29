package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Usuario;
import dao.UserDao;
import java.util.ArrayList;

public final class utilizadores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Gestao de utilizadores</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/utilizadores.css\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
 
      out.write("\r\n");
      out.write("    <div id=\"geral\">\r\n");
      out.write("        <header></header>\r\n");
      out.write("        <section>\r\n");
      out.write("            <div id=\"conteudo\">\r\n");
      out.write("                <div id=\"info\">\r\n");
      out.write("                    <div id=\"form\">\r\n");
      out.write("                        <form method=\"POST\" action=\"Cadastro.jsp\">\r\n");
      out.write("                            <p> <input type=\"text\" name=\"nome\" class=\"campo\" size=\"50\" placeholder=\"Nome completo\" required> </p>\r\n");
      out.write("                            <p> <input type=\"text\" name=\"telefone\" class=\"campo\" size=\"50\" placeholder=\"Telefone\" required> </p>\r\n");
      out.write("                            <p> <input type=\"email\" name=\"email\" class=\"campo\" size=\"50\" placeholder=\"Email\" required> </p>\r\n");
      out.write("                            <p> <input type=\"password\" name=\"senha\" class=\"campo\" size=\"50\" placeholder=\"Senha\" required> </p>\r\n");
      out.write("                            <p> <button type=\"submit\" name=\"registar\" id=\"btnRegistar\"><strong>Registar</strong></button> </p>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br> <br>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Id</th>\r\n");
      out.write("                                <th>Nome</th>\r\n");
      out.write("                                <th>Telefone</th>\r\n");
      out.write("                                <th>Email</th>\r\n");
      out.write("                                <th colspan =\"2\" >Accoes</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                              UserDao dao = new UserDao();
                              ArrayList<Usuario> lista = dao.getAllUsers();
                              for(int num = 0;num < lista.size(); num++){
                                out.print("<tr>");
                                out.print("<td>"+ lista.get(num).getId()+"</td>");
                                out.print("<td>"+ lista.get(num).getNome()+"</td>");
                                out.print("<td>"+ lista.get(num).getTelefone()+"</td>");
                                out.print("<td>"+ lista.get(num).getEmail()+"</td>");
                                out.print("<td><a href='TelaUpdate.jsp?codigo="+lista.get(num).getId()+"&nome="+ lista.get(num).getNome()+"&telefone="+lista.get(num).getTelefone()+"&email="+lista.get(num).getEmail()+"&senha="+lista.get(num).getSenha()+"'>Atualizar</a></td>");
                                out.print("<td><a href='Eliminar.jsp?codigo="+lista.get(num).getId()+"'>Eliminar</a></td>");
                                out.print("</tr>");}
                              
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <footer></footer>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
