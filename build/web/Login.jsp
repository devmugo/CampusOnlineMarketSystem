<%-- 
    Document   : login
    Created on : Mar 18, 2019, 6:59:52 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <link href="css/toast_message.css" rel="stylesheet"/>

    </head>
    <body>
          <% response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null) {

                response.sendRedirect("Login.jsp");
            }


        %>
        <jsp:include page="./includes/toast_message.jsp" />
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark default-color">

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-333"
                    aria-controls="navbarSupportedContent-333" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/CampusOnlineMarketSystem/">Home</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="#">About Us</a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto nav-flex-icons">

                    <li class="nav-item">
                        <a class="nav-link" href="Register.jsp">Register</a>
                    </li>

            </div>
        </nav> 
        <div class="flex-center flex-column" style="padding-top: 2%">
           
            <section>

                <!--F-->
                <div class="card card-image" style=" width: 30rem; ">
                    <div class="text-white py-5 px-5 z-depth-4">

                        <!--Header-->
                        <div class="text-center">
                            <h2 class="mb-5 mt-4 font-weight-bold" style="color: black; font-size: 35px"><strong>Campus Online Market</strong></h2>
                            <h3  class="mb-5 mt-4 font-weight-bold " style="color: black"><strong>Welcome </strong></h3>
                        </div>

                        <!--Body-->
                        <form action="LoginServlet" method="POST" >
                            <div class="md-form">
                                <input type="text" id="username" class="form-control" name="username"   required placeholder="email" required>

                            </div>

                            <div class="md-form">
                                <input type="password" id="password" class="form-control" name="password" placeholder="Password " autocomplete="off" required>

                            </div>


                            <div class="row d-flex align-items-center mb-4">

                                <!--Grid column-->
                                <div class="text-center mb-3 col-md-12">
                                    <button type="submit" class="btn btn-info my-4 btn-block"><b>Login</b></button>
                                </div>

                            </div>
                        </form>
                        <!--Grid row-->

                        <!--Grid column-->
                        <div class="col-md-12">
                            <p class="font-small d-flex justify-content-end" style="color: black"><a href="confirmEmail.jsp" class="ml-1 font-weight-bold ">Forgot Password ?</a></p>
                        </div>
                        <!--Grid column-->

                    </div>
                </div>
                <!--/Form without header-->

            </section>
            <!-- End of section-->
        </div>

        <!--End of login page-->
        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script> 
         <jsp:include page="./includes/footer.jsp"/>
    </body>
</html>

