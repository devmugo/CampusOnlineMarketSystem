package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/jquery-ui.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script> \n");
      out.write("        <title>Welcome  </title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <!--Navbar -->\n");
      out.write("        <nav class=\"mb-1 navbar navbar-expand-lg navbar-dark white fixed-top\">\n");
      out.write("\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-333\"\n");
      out.write("                    aria-controls=\"navbarSupportedContent-333\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-333\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("\n");
      out.write("                        <a class=\"nav-link\" href=\"#about\" style=\"border: 5px solid black ;\n");
      out.write("                           color: black; font-size: 26px;\">CAMPUS MARKET  </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav nav-flex-icons\" style=\"\">\n");
      out.write("                    <!-- Search form -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("                            <form class=\"form-inline mr-auto\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                <button class=\"btn btn-mdb-color btn-rounded btn-sm my-0 ml-sm-2\" type=\"submit\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
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
              out.write("\n");
              out.write("                        <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
              out.write("\n");
              out.write("                            <a class=\"nav-link p-0\" href=\"#\">\n");
              out.write("                                <img src=\"img/Profile.png\" class=\"rounded-circle z-depth-0\"\n");
              out.write("                                     alt=\"avatar image\" height=\"35\">\n");
              out.write("                            </a>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"btn btn-sm align-middle btn-outline-secondary\" href=\"#\">");
              out.print(user);
              out.write("</a>\n");
              out.write("\n");
              out.write("                            </li>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"btn btn-sm align-middle btn-outline-secondary\" href=\"#\">Log out</a>\n");
              out.write("                            </li>\n");
              out.write("                            <li class=\"nav-item\">\n");
              out.write("                                <a class=\"nav-link\" href=\"helppage.jsp#homehelp\" \n");
              out.write("                                   style=\"color: black;border: 5px solid black ;\">Help</a>\n");
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
      out.write("        <!--Carousel Wrapper-->\n");
      out.write("        <div id=\"carousel-example-2\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("            <!--Indicators-->\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carousel-example-2\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-2\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-2\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <!--/.Indicators-->\n");
      out.write("            <!--Slides-->\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <div class=\"view\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"https://mdbootstrap.com/img/Photos/Slides/img%20(68).jpg\"\n");
      out.write("                             alt=\"First slide\">\n");
      out.write("                        <div class=\"mask rgba-black-light\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 class=\"h3-responsive\">Light mask</h3>\n");
      out.write("                        <p>First text</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <!--Mask color-->\n");
      out.write("                    <div class=\"view\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"https://mdbootstrap.com/img/Photos/Slides/img%20(6).jpg\"\n");
      out.write("                             alt=\"Second slide\">\n");
      out.write("                        <div class=\"mask rgba-black-strong\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 class=\"h3-responsive\">Strong mask</h3>\n");
      out.write("                        <p>Secondary text</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <!--Mask color-->\n");
      out.write("                    <div class=\"view\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"https://mdbootstrap.com/img/Photos/Slides/img%20(9).jpg\"\n");
      out.write("                             alt=\"Third slide\">\n");
      out.write("                        <div class=\"mask rgba-black-slight\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 class=\"h3-responsive\">Slight mask</h3>\n");
      out.write("                        <p>Third text</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/.Slides-->\n");
      out.write("            <!--Controls-->\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carousel-example-2\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carousel-example-2\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("            <!--/.Controls-->\n");
      out.write("        </div>\n");
      out.write("        <!--/.Carousel Wrapper-->\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 70px; \" >\n");
      out.write("            <img src=\"img/logo2.jpg\" alt=\"Responsive image\" width=\"100%\" height=\"400px\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height:50px;background-color: black\">\n");
      out.write("            <br>\n");
      out.write("            <strong style=\"color: white;margin: auto;font-size: 40px\"> Recommendations </strong>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"card-deck \" style=\"display: flex; flex-wrap: wrap; padding-left: 2% \" >\n");
      out.write("\n");
      out.write("            <div class=\"card mb-3 view overlay zoom \" style=\"flex: 1 0 22%; \">\n");
      out.write("\n");
      out.write("                <div  class=\"\"  style=\" background-repeat:no-repeat;\n");
      out.write("                      height:250px;  background-position: center; \" >\n");
      out.write("                    <img style=\"max-width: 100%;display: block; height: 100%\" src=\"img/item4.jpg\">\n");
      out.write("                    <div class=\"mask flex-center rgba-blue-light\">\n");
      out.write("\n");
      out.write("                        <a class=\"btn btn-primary btn-green\" href=\"DetailsServlet?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.itemindex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> More Details</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body  mb-2\" >\n");
      out.write("                    <div style=\"height:50%\">\n");
      out.write("\n");
      out.write("                        <b><p> Casual Men's Shoes</p> </b>\n");
      out.write("\n");
      out.write("                        <p > <b>Ksh 1500 </b></p> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card mb-3 view overlay zoom \" style=\"flex: 1 0 22%; \">\n");
      out.write("\n");
      out.write("                <div  class=\"\"  style=\" background-repeat:no-repeat;\n");
      out.write("                      height:250px;  background-position: center; \" >\n");
      out.write("                    <img style=\"max-width: 100%;display: block; height: 100%\" src=\"img/item3.jpg\">\n");
      out.write("                    <div class=\"mask flex-center rgba-blue-light\">\n");
      out.write("\n");
      out.write("                        <a class=\"btn btn-primary btn-green\" href=\"DetailsServlet?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.itemindex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> More Details</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body  mb-2\" >\n");
      out.write("                    <div style=\"height:50%\">\n");
      out.write("\n");
      out.write("                        <b><p> F Q L  SubWoofer</p> </b>\n");
      out.write("\n");
      out.write("                        <p > <b>Ksh 3500 </b></p>  \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card mb-3 view overlay zoom \" style=\"flex: 1 0 22%; \">\n");
      out.write("\n");
      out.write("                <div  class=\"\"  style=\" background-repeat:no-repeat;\n");
      out.write("                      height:250px;  background-position: center; \" >\n");
      out.write("                    <img style=\"max-width: 100%;display: block; height: 100%\" src=\"img/item2.jpg\">\n");
      out.write("                    <div class=\"mask flex-center rgba-blue-light\">\n");
      out.write("\n");
      out.write("                        <a class=\"btn btn-primary btn-green\" href=\"DetailsServlet?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.itemindex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> More Details</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body  mb-2\" >\n");
      out.write("                    <div style=\"height:50%\">\n");
      out.write("\n");
      out.write("                        <b><p> Hp power Laptop</p> </b>\n");
      out.write("\n");
      out.write("                        <p > <b>Ksh 25000 </b></p> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card mb-3 view overlay zoom \" style=\"flex: 1 0 22%; \">\n");
      out.write("\n");
      out.write("                <div  class=\"\"  style=\" background-repeat:no-repeat;\n");
      out.write("                      height:250px;  background-position: center; \" >\n");
      out.write("                    <img style=\"max-width: 100%;display: block; height: 100%\" src=\"img/item1.jpg\">\n");
      out.write("                    <div class=\"mask flex-center rgba-blue-light\">\n");
      out.write("\n");
      out.write("                        <a class=\"btn btn-primary btn-green\" href=\"DetailsServlet?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${upload.itemindex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> More Details</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body  mb-2\" >\n");
      out.write("                    <div style=\"height:50%\">\n");
      out.write("\n");
      out.write("                        <b><p> Asus Laptop</p> </b>\n");
      out.write("\n");
      out.write("                        <p > <b>Ksh 30000 </b></p>  \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/footer2.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/sidena.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script> \n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
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
        out.write("                                <a class=\"btn btn-sm align-middle btn-outline-blue\" href=\"Loginpage.jsp\">Log In</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"btn btn-sm align-middle btn-outline-blue\" href=\"Register.jsp\">Register</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"btn btn-sm align-middle btn-outline-blue\" href=\"#\">Help</a>\n");
        out.write("\n");
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
