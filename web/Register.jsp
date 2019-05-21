<%-- 
    Document   : Register
    Created on : Mar 13, 2019, 7:48:49 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <title>Register </title>
        <script type="text/javascript" src="js/charts.js"></script>
    </head>
    <body>
        <jsp:include page="./includes/toast_message.jsp" />
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark default-color fixed-top">

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
                        <a class="nav-link" href="/CampusOnlineMarketSystem/#about">About Us</a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto nav-flex-icons">

                    <li class="nav-item">
                        <a class="nav-link" href="Loginpage.jsp">Log In</a>
                    </li>

            </div>
        </nav>

        <div style="max-width: 50%; margin:0 auto;" >

            <!-- Default form register -->
            <form class="text-center border border-light p-5"  name = "myForm" onsubmit = "return(validate());" style ="background-color: white; margin-top:5%;max-width:100%" action="UserServlet" method="post">
                <div style="max-width: 100%; height: 40px">
                    <h5 style="color:green; ">   ${requestScope.success} </h5> 
                    <h5 style="color:red"> ${requestScope.error}  </h5> 
                    <br>
                </div>
                <p class="h4 mb-4" style="font-size: 30px;font-weight: bold;">Register </p>


                <div class="form-row mb-4">
                    <div class="col">
                        <!-- First name -->
                        <input type="text" id="defaultRegisterFormFirstName" class="form-control" autocomplete="off" name="fname" placeholder="First name" required>
                    </div>
                    <div class="col">
                        <!-- Last name -->
                        <input type="text" id="defaultRegisterFormLastName" class="form-control" autocomplete="off" name="lname" placeholder="Last name" required>
                    </div>
                </div>
                <input type="tel" id="defaultRegisterPhonePassword" class="form-control" name="id" autocomplete="off" placeholder="National id" aria-describedby="defaultRegisterFormPhoneHelpBlock" required>
                <div id="iderror" style="color: red; float:left">
               </div>
                <small id="defaultRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">

                </small>
               
                <!-- E-mail -->
                <input type="email" id="defaultRegisterFormEmail" class="form-control mb-4" autocomplete="off" name ="email" placeholder="E-mail" required>
                <div class="form-row mb-4">
                    <div class="col">
                        <input type="password" id="defaultRegisterFormPassword" class="form-control" name="pass" placeholder="Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                    </div>

                    <div class="col">
                        <input type="password" id="defaultRegisterFormPassword" name="pass2" class="form-control" placeholder="Repeat Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                    </div>
                    
                </div>
                 <div id="passerror" style="color: red">
               </div>
                <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">

                </small>


                <!-- Phone number -->
                <input type="tel" id="defaultRegisterPhonePassword" autocomplete="off" name="phone" class="form-control" placeholder="Phone number" aria-describedby="defaultRegisterFormPhoneHelpBlock" required>
               <div id="phoneerror" style="color: red">
               </div>
                <small id="defaultRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">

                </small>


                <input type="text" id="defaultRegisterPhonePassword"autocomplete="off" name="residence" class="form-control" placeholder="place of residence" aria-describedby="defaultRegisterFormPhoneHelpBlock" required>
                <small id="defaultRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">

                </small>


                <!-- Sign up button -->
                <button class="btn btn-info my-4 btn-block" type="submit">Register </button>

            </form>
            <!-- Default form register -->
        </div>

        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
         <jsp:include page="./includes/footer.jsp"/>
    </body>
</html>
