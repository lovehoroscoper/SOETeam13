package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Products</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7; IE=EmulateIE9\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/heroic-features.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        ");

            String categ = request.getParameter("categ");

        
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <nav id=\"navbar navbar-inverse navbar-fixed-top\" class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div id=\"container\" class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div id=\"navbar-header\" class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span id=\"sr-only\" class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span id=\"icon-bar\" class=\"icon-bar\"></span>\n");
      out.write("                    <span id=\"icon-bar\" class=\"icon-bar\"></span>\n");
      out.write("                    <span id=\"icon-bar\" class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\">Welcome Product Manager</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul id=\"nav navbar-nav\" class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a id=\"myaccount\" href=\"#\">My account</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a id=\"mysettings\" href=\"#\">My Settings</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a id=\"myorder\" href=\"#\">My order</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul id=\"nav navbar-nav navbar-right\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a id=\"cart\" href=\"#\">Cart</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a id=\"logout\" href=\"#\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Products ================================================== -->\n");
      out.write("    <table border=\"1\" style=\"width:35%\">\n");
      out.write("        <tr>\n");
      out.write("            <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categ}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Item #</td>\n");
      out.write("            <td>00001</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Name</td>\n");
      out.write("            <td>MacPro</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Price</td>\n");
      out.write("            <td>$600</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Quantity Available</td>\n");
      out.write("            <td>10</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Description</td>\n");
      out.write("            <td>New Model Macbook Pro for Students</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <a id=\"buy\" href=\"#\" class=\"btn btn-primary\">Buy </a>\n");
      out.write("\n");
      out.write("</body>\n");
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