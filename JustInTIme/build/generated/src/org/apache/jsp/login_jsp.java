package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Form</title>   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"login\">\n");
      out.write("            <div class=\"login-screen\">\n");
      out.write("                <div class=\"app-title\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-form\">\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <input type=\"email\" class=\"login-field\" value=\"\" placeholder=\"email\" id=\"login-name\">\n");
      out.write("                        <label class=\"login-field-icon fui-user\" for=\"login-name\"></label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <input type=\"password\" class=\"login-field\" value=\"\" placeholder=\"password\" id=\"login-pass\">\n");
      out.write("                        <label class=\"login-field-icon fui-lock\" for=\"login-pass\"></label>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"btn btn-primary btn-large btn-block\" href=\"#\">login</a>\n");
      out.write("                    <a class=\"login-link\" href=\"resetpasswd.html\">Forget your password?</a>\n");
      out.write("                    <a class=\"registration-link\" href = \"signup.html\"> Sign up here</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
