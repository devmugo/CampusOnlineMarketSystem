package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewMessages_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("       \n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Messages</title>\n");
      out.write("  <!-- Font Awesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/global_stylesheets.jsp", out, false);
      out.write("\n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("    .map-container{\n");
      out.write("overflow:hidden;\n");
      out.write("padding-bottom:56.25%;\n");
      out.write("position:relative;\n");
      out.write("height:0;\n");
      out.write("}\n");
      out.write(".map-container iframe{\n");
      out.write("left:0;\n");
      out.write("top:0;\n");
      out.write("height:100%;\n");
      out.write("width:100%;\n");
      out.write("position:absolute;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"grey lighten-3\">\n");
      out.write("       ");
   response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null && user != "admin") {

                response.sendRedirect("Home");
            }


        
      out.write("\n");
      out.write("\n");
      out.write("  <!--Main Navigation-->\n");
      out.write("  <header>\n");
      out.write("\n");
      out.write("    <!-- Navbar -->\n");
      out.write("    <nav class=\"navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Collapse -->\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("          aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <!-- Links -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("          <!-- Left -->\n");
      out.write("          <ul class=\"navbar-nav mr-auto\">\n");
      out.write("           \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link waves-effect\" href=\"\" target=\"_blank\">\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link waves-effect\" href=\"\"\n");
      out.write("                target=\"_blank\">\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link waves-effect\" href=\"\" target=\"_blank\">\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <!-- Right -->\n");
      out.write("          <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"\" class=\"nav-link waves-effect\" target=\"_blank\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"\" class=\"nav-link waves-effect\" target=\"_blank\">\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"LogOut\" class=\"nav-link border border-light rounded waves-effect\"\n");
      out.write("               style=\"color:black;font-weight: bold\"\n");
      out.write("                <i class=\"fab fa-github mr-2\"></i> LOG OUT\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- Navbar -->\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <div class=\"sidebar-fixed position-fixed\">\n");
      out.write("\n");
      out.write("      <a class=\"logo-wrapper waves-effect\">\n");
      out.write("        <img src=\"img/logo.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <div class=\"list-group list-group-flush\">\n");
      out.write("        <a href=\"Reports\" class=\"list-group-item list-group-item-action waves-effect\">\n");
      out.write("          <i class=\"fas fa-table mr-3\"></i>DashBoard</a>\n");
      out.write("        <a href=\"ViewContactS\" class=\"list-group-item list-group-item-action waves-effect\">\n");
      out.write("          <i class=\"fas fa-user mr-3\"></i>Users</a>\n");
      out.write("            <a href=\"ViewMessages\" class=\"list-group-item list-group-item-action waves-effect\">\n");
      out.write("          <i class=\"fas fa-money-bill-alt mr-3\"></i>Messages</a>\n");
      out.write("       \n");
      out.write("        <a href=\"ViewGoodsAdmin\" class=\"list-group-item list-group-item-action waves-effect\">\n");
      out.write("          <i class=\"fas fa-map mr-3\"></i>Uploads</a>\n");
      out.write("        <a href=\"CompletedTransactions\" class=\"list-group-item list-group-item-action waves-effect\">\n");
      out.write("          <i class=\"fas fa-money-bill-alt mr-3\"></i>Done Transactions</a>\n");
      out.write("        \n");
      out.write("          <a href=\"Transactions\" class=\"list-group-item active waves-effect\">\n");
      out.write("          <i class=\"fas fa-chart-pie mr-3\"></i> Messages\n");
      out.write("        </a>\n");
      out.write("           \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("\n");
      out.write("  </header>\n");
      out.write("  <!--Main Navigation-->\n");
      out.write("\n");
      out.write("  <!--Main layout-->\n");
      out.write("  <main style=\"margin-top: 5%\" >\n");
      out.write("    <div class=\"\">\n");
      out.write("     \n");
      out.write("       <div>\n");
      out.write("            <h1 style=\"padding-left: 39%;color: black\"> <u>Messages </u>    </h1>\n");
      out.write("        </div>\n");
      out.write("        <!--Table-->\n");
      out.write("        <table id=\"myTable\" class=\"table table-bordered table-striped table-responsive-md\" >\n");
      out.write("\n");
      out.write("            <!--Table head-->\n");
      out.write("            <thead class=\"text-dark\">\n");
      out.write("                <tr>\n");
      out.write("            <strong>     <th>No </th>  </strong>        \n");
      out.write("            <strong>       <th>Name </th>  </strong>  \n");
      out.write("            <strong>        <th>Number </th>    </strong>  \n");
      out.write("            <strong>        <th>Subject</th>    </strong>  \n");
      out.write("            <strong>       <th>Message </th>    </strong>  \n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <!--Table head-->\n");
      out.write("\n");
      out.write("    <!--Table body-->\n");
      out.write("    <tbody>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("\n");
      out.write("    <!--Table body-->\n");
      out.write("\n");
      out.write("</table>  \n");
      out.write("\n");
      out.write("    </div> \n");
      out.write("  </main>\n");
      out.write("  <!--Main layout-->\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/scripts.jsp", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/toast_message.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#dtBasicExample').DataTable();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/footer.jsp", out, false);
      out.write("\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write(" \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("mess");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess.index_number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess.subject}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                 \n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
