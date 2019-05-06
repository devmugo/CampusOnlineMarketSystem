<%-- 
    Document   : confirmEmail
    Created on : May 3, 2019, 6:03:40 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Email</title>
        <jsp:include page="./includes/global_stylesheets.jsp"/>
    </head>
    <body>
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark default-color">

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-333"
                    aria-controls="navbarSupportedContent-333" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent-333" style="margin-left:45%">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/CampusOnlineMarketSystem/">Campus Online Market </a>
                    </li>
                </ul>
            </div>
        </nav> 

        <div style="align-items: center;max-width: 50%;margin-left: 25% ; background: white; margin-top: 5%">

            <div style="max-width: 100%;margin-left: 30px; height: 50px">
                <h5 style="color:green; ">   ${requestScope.message} </h5> 
                <h5 style="color:Red;"> ${requestScope.error}  </h5> 
                <br>
            </div>
            <h1 style="color:black">Enter your email address for confirmation </h1>

            <form action="SendLinkServlet" method="post">

                <input type="email" id="defaultRegisterFormEmail" class="form-control " name ="email" placeholder="E-mail">

                <button class="btn btn-info my-2 " type="submit">Send </button>

            </form>  
            <p> A link will be sent to your email address and redirect you to change your email address.</p>
            <p> Back to <a href="Login.jsp"> Log In </a>  </p> 
        </div>

    </body>


</html>
