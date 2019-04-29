package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/global_stylesheets.jsp", out, false);
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Goods</title>\n");
      out.write("        <link href=\"css/toast_message.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/toast_message.jsp", out, false);
      out.write("\n");
      out.write("        ");

            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null) {

                response.sendRedirect("Login.jsp");
            }


        
      out.write("\n");
      out.write("        <nav class=\"fixed-nav-bar\" style=\" width:100%\">\n");
      out.write("            <div id=\"menu\" class=\"menu\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"menu-items\" >\n");
      out.write("                    <li style=\"margin-left:50px\"><a href=\"/CampusOnlineMarketSystem/\">Home</a></li>\n");
      out.write("                    <li><a href=\"Contact_Us.jsp\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"UploadHib.jsp\" style=\"margin-left:400px\">Sell</a></li>\n");
      out.write("                    <li  ><a href=\"ViewOwnUploads\">Uploads</a></li>\n");
      out.write("                    <li class=\"nav-item avatar\" style=\"margin-left:320px\">\n");
      out.write("                        <a class=\"nav-link p-0\" href=\"#\">\n");
      out.write("                            <img src=\"img/Profile.png\" class=\"rounded-circle z-depth-0\"\n");
      out.write("                                 alt=\"avatar image\" height=\"35\">\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li ><a href=\"#\"> ");
      out.print(user);
      out.write(" </a></li>\n");
      out.write("                    <li  ><a href=\"LogOut\">Log out</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <br> <br>  <br>  \n");
      out.write("        <div class=\"search_button\" style=\" height: 90px; \">\n");
      out.write("            <!-- Search form -->\n");
      out.write("            <form action=\"SearchServlet\" method=\"POST\" class=\"form-inline md-form mr-auto mb-4\" style=\"margin-left: 500px\">\n");
      out.write("                <div class=\"md-form active-pink active-pink-2 mb-3 mt-0\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn aqua-gradient btn-rounded btn-sm my-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"max-width: 40%;margin-left: 350px; height: 40px\">\n");
      out.write("            <h5 style=\"color:green; \">   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h5> \n");
      out.write("            <h5 style=\"color:black\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h5> \n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        ");

            int start = (int) (1 + (Math.random() * 2));
            int end = start + 5;
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/scripts.jsp", out, false);
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"js/toast_message.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("upload");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                <div class=\"row text-center\" >\n");
          out.write("                    <div class=\"col-md-4 mb-4\">\n");
          out.write("\n");
          out.write("                        <div class=\"card h-100\">\n");
          out.write("                            <div>\n");
          out.write("                                <img class=\"card-img-top\" src=\"data:image/jpg;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.b64}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\" height=\"200px\">\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"card-body\" >\n");
          out.write("                                <div>\n");
          out.write("\n");
          out.write("                                    <h4 class=\"card-title\"><a>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                    <strong>     <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.cond}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p> </strong> \n");
          out.write("                                    <strong>     <p class=\"card-text\">Ksh ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>  </strong>\n");
          out.write("                                    <strong>         <p class=\"card-text\"></p> </strong>  \n");
          out.write("                                    <p class=\"card-text\"></p>\n");
          out.write("                                </div>\n");
          out.write("                                <a class=\"btn btn-primary\"  data-toggle=\"modal\" href=\"#myModal");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" id=\"viewDetailButton");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >Buy</a>\n");
          out.write("                                <!-- Modal -->\n");
          out.write("                                <div class=\"modal fade\" id=\"myModal");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\"\n");
          out.write("                                     aria-hidden=\"true\">\n");
          out.write("\n");
          out.write("                                    <!-- Add .modal-dialog-centered to .modal-dialog to vertically center the modal -->\n");
          out.write("                                    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
          out.write("\n");
          out.write("\n");
          out.write("                                        <div class=\"modal-content\">\n");
          out.write("                                            <div class=\"modal-header\">\n");
          out.write("                                                <h5 class=\"modal-title\" id=\"exampleModalLongTitle\" style=\"color: black; font-weight: bold\">Confirm Purchase</h5>\n");
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"modal-body\" style=\"color: black\">\n");
          out.write("                                                <h4>You are about to purchase ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                <p >Working Condition :<b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.cond}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </b> </p>\n");
          out.write("                                                <p>Which is  : <b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </b> </p>\n");
          out.write("                                                <p>At a price of :<b>  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b> </p>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"modal-footer\">\n");
          out.write("                                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancel</button>\n");
          out.write("                                                <a class=\"btn btn-primary\" href=\"Transactions?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.itemindex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Continue</a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("\n");
          out.write("            ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
