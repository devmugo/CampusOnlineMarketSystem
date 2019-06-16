package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/global_stylesheets.jsp", out, false);
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fixed-sn light-blue-skin\">\n");
      out.write("\n");
      out.write("  <!--Double navigation-->\n");
      out.write("  <header>\n");
      out.write("    <!-- Sidebar navigation -->\n");
      out.write("    <div id=\"slide-out\" class=\"side-nav sn-bg-4 fixed\">\n");
      out.write("      <ul class=\"custom-scrollbar\">\n");
      out.write("        <!-- Logo -->\n");
      out.write("        <li>\n");
      out.write("          <div class=\"logo-wrapper waves-light\">\n");
      out.write("            <a href=\"#\"><img src=\"https://mdbootstrap.com/img/logo/mdb-transparent.png\" class=\"img-fluid flex-center\"></a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <!--/. Logo -->\n");
      out.write("        <!--Social-->\n");
      out.write("        <li>\n");
      out.write("          <ul class=\"social\">\n");
      out.write("            <li><a href=\"#\" class=\"icons-sm fb-ic\"><i class=\"fab fa-facebook-f\"> </i></a></li>\n");
      out.write("            <li><a href=\"#\" class=\"icons-sm pin-ic\"><i class=\"fab fa-pinterest\"> </i></a></li>\n");
      out.write("            <li><a href=\"#\" class=\"icons-sm gplus-ic\"><i class=\"fab fa-google-plus-g\"> </i></a></li>\n");
      out.write("            <li><a href=\"#\" class=\"icons-sm tw-ic\"><i class=\"fab fa-twitter\"> </i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <!--/Social-->\n");
      out.write("        <!--Search Form-->\n");
      out.write("        <li>\n");
      out.write("          <form class=\"search-form\" role=\"search\">\n");
      out.write("            <div class=\"form-group md-form mt-0 pt-1 waves-light\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </li>\n");
      out.write("        <!--/.Search Form-->\n");
      out.write("        <!-- Side navigation links -->\n");
      out.write("        <li>\n");
      out.write("          <ul class=\"collapsible collapsible-accordion\">\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fas fa-chevron-right\"></i> Submit\n");
      out.write("                blog<i class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("              <div class=\"collapsible-body\">\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Submit listing</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Registration form</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fas fa-hand-pointer-o\"></i>\n");
      out.write("                Instruction<i class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("              <div class=\"collapsible-body\">\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">For bloggers</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">For authors</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fas fa-eye\"></i> About<i class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("              <div class=\"collapsible-body\">\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Introduction</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Monthly meetings</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fas fa-envelope-o\"></i> Contact me<i\n");
      out.write("                  class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("              <div class=\"collapsible-body\">\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <!--/. Side navigation links -->\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"sidenav-bg mask-strong\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!--/. Sidebar navigation -->\n");
      out.write("    <!-- Navbar -->\n");
      out.write("    <nav class=\"navbar fixed-top navbar-toggleable-md navbar-expand-lg scrolling-navbar double-nav\">\n");
      out.write("      <!-- SideNav slide-out button -->\n");
      out.write("      <div class=\"float-left\">\n");
      out.write("        <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse\"><i class=\"fas fa-bars\"></i></a>\n");
      out.write("      </div>\n");
      out.write("      <!-- Breadcrumb-->\n");
      out.write("      <div class=\"breadcrumb-dn mr-auto\">\n");
      out.write("        <p>Material Design for Bootstrap</p>\n");
      out.write("      </div>\n");
      out.write("      <ul class=\"nav navbar-nav nav-flex-icons ml-auto\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\"><i class=\"fas fa-envelope\"></i> <span class=\"clearfix d-none d-sm-inline-block\">Contact</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\"><i class=\"far fa-comments\"></i> <span class=\"clearfix d-none d-sm-inline-block\">Support</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\"><i class=\"fas fa-user\"></i> <span class=\"clearfix d-none d-sm-inline-block\">Account</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\"\n");
      out.write("            aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            Dropdown\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- /.Navbar -->\n");
      out.write("  </header>\n");
      out.write("  <!--/.Double navigation-->\n");
      out.write("\n");
      out.write("  <!--Main Layout-->\n");
      out.write("  <main>\n");
      out.write("    <div class=\"container-fluid mt-5\">\n");
      out.write("      <h2>Advanced Double Navigation with fixed SideNav & fixed Navbar:</h2>\n");
      out.write("      <br>\n");
      out.write("      <h5>1. Fixed side menu, hidden on small devices.</h5>\n");
      out.write("      <h5>2. Fixed Navbar. It will always stay visible on the top, even when you scroll down.</h5>\n");
      out.write("      <div style=\"height: 2000px\"></div>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("  <!--Main Layout-->\n");
      out.write("\n");
      out.write("</body>\n");
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
