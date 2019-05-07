<%-- 
    Document   : Changepassoword
    Created on : May 3, 2019, 9:59:55 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
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

        <%String gmail = request.getParameter("email");
        %>
        <div style="align-items: center;max-width: 50%;margin-left: 23% ; background: white; margin-top: 5%">
            <div style="max-width: 100%;margin-left: 30px; height: 70px;padding-top: 1%">
                <h5 style="color:green; ">${requestScope.message} </h5> 
                <h5 style="color:Red;"> ${requestScope.error}  </h5> 
                <br>
            </div>
            <h1 style="color:black">Reset Password. </h1>
            <br>

            <form action="ResetPasswordServlet" method="post"  name = "myform" onsubmit = "return(validatec());">
                <strong style="float: left"> <b> Enter New Password </b> </strong>
                <input type="password" id="defaultRegisterFormEmail" class="form-control " name ="password" >
                <br>
                <strong style="float: left"> <b> Re-enter New Password </b> </strong>
                <input type="password" id="defaultRegisterFormEmail" class="form-control " name ="password2" >
                <br>
                <div id="passerror" style="color: red">
                </div>
                <input type="hidden" name ="email" value="<%=gmail%>" >
                <br>
                <button class="btn btn-info my-2 " type="submit">Reset </button>


            </form>

            <p style="float: right;"> Back to <a href="Login.jsp">Log in </a>

        </div>
        <jsp:include page="./includes/scripts.jsp"/>
         <jsp:include page="./includes/footer.jsp"/>
    </body>
</html>
