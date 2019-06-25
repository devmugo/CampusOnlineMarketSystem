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


        <nav class="mb-1 navbar navbar-expand-lg navbar-dark white fixed-top" style="height:70px;">


            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <a class="navbar-brand" href="Home" style="margin-left: -250px">
                        <img src="img/logo.png" height="50" width="200" class="d-inline-block align-top"
                             alt="mdb logo"> 
                    </a>

                </ul>


                <ul class="navbar-nav nav-flex-icons" style="">


                </ul>

                <ul class="navbar-nav ml-auto nav-flex-icons">


                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle  " data-toggle="modal" data-target="#elegantModalForm"  >LOG IN</a>
                    </li>

                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="Help.jsp" >FAQ</a>
                    </li>


                </ul>



            </div>
        </nav>



        <div style="max-width: 42%; margin:0 auto;" >

            <!-- Default form register -->
            <form class="text-center border border-light p-5"  name = "myForm" onsubmit = "return(validate());" style ="background-color: white; margin-top:5%;max-width:100%" action="UserServlet" method="post">
                <div style="max-width: 100%; height: 40px">
                    <h5 style="color:lightgreen; background-color: darkgreen">   ${requestScope.success} </h5> 
                    <h5 style="color:red;background-color:darkred"> ${requestScope.error}  </h5> 
                    <br>
                </div>
                <p class="h4 mb-4" style="font-size: 30px;font-weight: bold;">Register </p>


                <div class="form-row mb-4">
                    <div class="col">
                        <!-- First name -->
                        <input type="text" id="defaultRegisterFormFirstName" class="form-control" autocomplete="off" name="fname" 
                               placeholder="First name"  pattern="[A-Za-z]{}"  title="Enter a Valid name" >
                    </div>
                    <div class="col">
                        <!-- Last name -->
                        <input type="text" id="defaultRegisterFormLastName" class="form-control" autocomplete="off" name="lname" 
                               placeholder="Last name"  pattern="[A-Za-z]{}"  title="Enter a Valid Last name">
                    </div>
                </div>
                <input type="tel" id="defaultRegisterPhonePassword" class="form-control" name="id" autocomplete="off" placeholder="National id" 
                       aria-describedby="defaultRegisterFormPhoneHelpBlock" required pattern="[0-9]{8}"  title="Enter a Valid Phone Number">
                <div id="iderror" style="color: red; float:left">
                </div>
                <small id="defaultRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">

                </small>

                <!-- E-mail -->
                <input type="email" id="defaultRegisterFormEmail" class="form-control mb-4" 
                       autocomplete="off" name ="email"
                       placeholder="E-mail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Enter Valid Email">
                <div class="form-row mb-4">
                    <div class="col">
                        <input type="password" id="defaultRegisterFormPassword" class="form-control" name="pass" placeholder="Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" 
                               pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"> 
                    </div>

                    <div class="col">
                        <input type="password" id="defaultRegisterFormPassword" name="pass2" class="form-control" placeholder="Repeat Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" 
                               pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">
                    </div>

                </div>
                <div id="passerror" style="color: red">
                </div>
                <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">

                </small>


                <!-- Phone number -->
                <input type="tel" id="defaultRegisterPhonePassword" autocomplete="off" name="phone" class="form-control" placeholder="Phone number" 
                       aria-describedby="defaultRegisterFormPhoneHelpBlock" required pattern="[0-9]{10}"  title="Enter a Valid Number">
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
        <  <!-- Modal -->
        <div class="modal fade" id="elegantModalForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <!--Content-->
                <div class="modal-content form-elegant">
                    <!--Header-->
                    <div class="modal-header text-center">
                        <h3 class="modal-title w-100 dark-grey-text font-weight-bold my-3" id="myModalLabel"><strong>Log In</strong></h3>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body mx-4">
                        <form method="post" action="LoginServlet">
                            <!--Body-->
                            <div class="md-form mb-5">
                                <input type="text" id="Form-email1" class="form-control validate" name="username">
                                <label for="Form-email1">Your email</label>
                            </div>

                            <div class="md-form pb-3">
                                <input type="password" id="Form-pass1" class="form-control validate" name="password">
                                <label for="Form-pass1">Your password</label>

                            </div>

                            <div class="text-center mb-3">
                                <button type="submit" class="btn blue-gradient btn-block btn-rounded z-depth-1a">Log In</button>
                            </div>
                        </form>

                    </div>
                    <!--/.Content-->
                </div>
            </div>
        </div>


        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
        <jsp:include page="./includes/footer2.jsp"/>
    </body>
</html>
