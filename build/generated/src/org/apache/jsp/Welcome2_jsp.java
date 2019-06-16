package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/global_stylesheets.jsp", out, false);
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome  </title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <!--Navbar -->\n");
      out.write("        <nav class=\"mb-1 navbar navbar-expand-lg navbar-dark default-color fixed-top\">\n");
      out.write("\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-333\"\n");
      out.write("                    aria-controls=\"navbarSupportedContent-333\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-333\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Home\n");
      out.write("                            <span class=\"sr-only\">(current)</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#about\">About Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#contact\">Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.loggedIn==true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                        ");
 response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
                            response.setHeader("Pragma", "no-cache");
                            response.setHeader("Expires", "0");

                            HttpSession sessionsa = request.getSession(false);
                            String user = (String) sessionsa.getAttribute("user");
                        
              out.write("\n");
              out.write("                        <ul class=\"navbar-nav nav-flex-icons\" style=\"\">\n");
              out.write("\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"ShowGoods\">Buy</a>\n");
              out.write("                            </li>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"UploadHib.jsp\">Sell</a>\n");
              out.write("                            </li>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"ViewOwnUploads\">Uploads</a>\n");
              out.write("                            </li>\n");
              out.write("                        </ul>\n");
              out.write("                        <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
              out.write("\n");
              out.write("                            <a class=\"nav-link p-0\" href=\"#\">\n");
              out.write("                                <img src=\"img/Profile.png\" class=\"rounded-circle z-depth-0\"\n");
              out.write("                                     alt=\"avatar image\" height=\"35\">\n");
              out.write("                            </a>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"#\">");
              out.print(user);
              out.write("</a>\n");
              out.write("                            </li>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"LogOut\">Log Out</a>\n");
              out.write("                            </li>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"helppage.jsp#homehelp\">Help</a>\n");
              out.write("                            </li>\n");
              out.write("\n");
              out.write("\n");
              out.write("                        </ul>\n");
              out.write("                    ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\n");
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--/.Navbar -->\n");
      out.write("        <div style=\"background-image: url('img/back.jpg'); \n");
      out.write("             background-repeat:no-repeat; background-size: cover; width:100%; height: 700px\">\n");
      out.write("            <div class=\"description\" style=\"padding-top: 13%\">\n");
      out.write("                <h1 style=\"font-size:60px;\">Campus Online Market</h1>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <p class=\"summary\" style=\"font-size:30px;\">Everything Sells at your Comfort .</p>\n");
      out.write("                <p class=\"summary\" style=\"font-size:30px;\"> \" One Stop shopping Website for the Comrades.. \"</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("                     \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <!-- Card group -->\n");
      out.write("           <div class=\"card-deck\" style=\"padding: 1.5em 1.5em 1.5em 1.5em;\">\n");
      out.write("\n");
      out.write("                <!-- Card -->\n");
      out.write("                <div id=\"about\" class=\"card mb-4\" style=\"padding: 1.5em 1.5em 1.5em 1.5em;\">\n");
      out.write("                   <!-- Card -->\n");
      out.write("                    <div class=\"card card-image\" style=\"background-image:url('img/back.jpg');\">\n");
      out.write("\n");
      out.write("                        <!-- Content -->\n");
      out.write("                        <div class=\"text-white text-center d-flex align-items-center rgba-black-strong py-5 px-4\">\n");
      out.write("                            <div>\n");
      out.write("                                \n");
      out.write("                                <h3 class=\"card-title pt-2\"><strong>About Us</strong></h3>\n");
      out.write("                                <h3 ><strong><u>How we Work </u></strong></h3>\n");
      out.write("                                <p>The Campus Online Market Operates like a simple market only that you are selling your goods online.\n");
      out.write("                                    If you have an item on sale you just post it to the website then RELAX and wait for your good to get a buyer.\n");
      out.write("                                    Once your item gets a customer you will be notified via e-mail and you will be required to avail it to our offices \n");
      out.write("                                    after which you will sign a form to show that you have availed the goods.You are required to collect your payments\n");
      out.write("                                    a day after availing your goods.<br>\n");
      out.write("                                    <strong>Note: Each commodity is eligible to a 10% service fee</strong>\n");
      out.write("                                    <br>\n");
      out.write("                                    <h3 ><strong><u>Our Offices </u></strong></h3>\n");
      out.write("                                    Our offices are located in Njokerio near the mosque Opposite Queens hostel <br>\n");
      out.write("                                    We are Open from mon - sat from 8 am to 5 pm.<br>\n");
      out.write("                                    You can call on <strong>0700896543</strong> <br>\n");
      out.write("                                    or <br>\n");
      out.write("                                    Visit us at any time with in the working hours <br>\n");
      out.write("                                    or <br>\n");
      out.write("                                    Write to us and let us know your problem ---> <br>\n");
      out.write("                                   \n");
      out.write("                                   </p>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-deck\" style=\"padding: 1.5em 1.5em 1.5em 1.5em; \">\n");
      out.write("                \n");
      out.write("                 <div id=\"contact\" class=\"card mb-4\" style=\" padding: 1.5em 1.5em 1.5em 1.5em;\">\n");
      out.write("\n");
      out.write("                    <div style=\"padding:  0 1.5em 0 1.5em;\">\n");
      out.write("                        <!-- Default form contact -->\n");
      out.write("                        <form id=\"contact_us\" name=\"contact_us\" action=\"Contact_us\" method=\"POST\">\n");
      out.write("                            <h5 class=\"card-header  white-text text-center py-4\" style=\"background-color: #00a087;font-size: 30px\">\n");
      out.write("                                <strong>Contact us</strong>\n");
      out.write("                            </h5>\n");
      out.write("                            <br>\n");
      out.write("                            <strong style=\"float: left\"> <b> Enter Your Name </b> </strong>\n");
      out.write("                            <input type=\"text\" id=\"defaultContactFormName\" class=\"form-control mb-4\" name=\"name\" placeholder=\"Name\">\n");
      out.write("\n");
      out.write("                            <strong style=\"float: left\"> <b> Enter Your Phone Number</b> </strong>\n");
      out.write("                            <input type=\"text\" name=\"number\" id=\"defaultContactFormEmail\" class=\"form-control mb-4\" placeholder=\"Phone Number\">\n");
      out.write("\n");
      out.write("                            <strong style=\"float: left\"> <b> Subject of the message </b> </strong>\n");
      out.write("                            <select class=\"browser-default custom-select mb-4\" name=\"subject\">\n");
      out.write("\n");
      out.write("                                <option value=\"default_item\" >Default Items</option>\n");
      out.write("                                <option value=\"details\">Transaction details</option>\n");
      out.write("                                <option value=\"contact\">Seller Contacts</option>\n");
      out.write("                                <option value=\"features\">Feature request</option>\n");
      out.write("                                <option value=\"forgot_password\">Forgot Password</option>\n");
      out.write("                                <option value=\"Other\">Other(Specify in the message)</option>\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("                            <strong style=\"float: left\"> <b> Message </b> </strong>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea class=\"form-control rounded-0\" name=\"message\"id=\"exampleFormControlTextarea2\" rows=\"2\" placeholder=\"Message\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <button class=\"btn btn-info\" style=\" width: 200px;\"type=\"submit\">Send</button>\n");
      out.write("                            <br>  <br>  \n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/footer2.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"Loginpage.jsp\">Log In</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"Register.jsp\">Register</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"helppage.jsp#homehelp\">Help</a>\n");
        out.write("                            </li>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
