<%-- 
    Document   : index
    Created on : Mar 13, 2019, 1:16:48 PM
    Author     : AMO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome  </title>

    </head>
    <body style="padding: 1.5em 0em 1.5em 0em;">
        <!--Navbar -->
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark white fixed-top" style="height:70px;">


            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <a class="navbar-brand" href="#" style="margin-left: -250px">
                        <img src="img/logo.png" height="50" width="200" class="d-inline-block align-top"
                             alt="mdb logo"> 
                    </a>

                </ul>
                <c:choose>
                    <c:when test="${sessionScope.loggedIn==true}">
                        <% response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
                            response.setHeader("Pragma", "no-cache");
                            response.setHeader("Expires", "0");
                            HttpSession sessionsa = request.getSession(false);
                            String user = (String) sessionsa.getAttribute("user");
                        %>
                        <ul class="navbar-nav nav-flex-icons" style="">


                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ShowGoods" >Buy</a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="UploadHib.jsp" >Sell</a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ViewOwnUploads" >Uploads</a>
                            </li>
                        </ul>

                        <ul class="navbar-nav ml-auto nav-flex-icons">

                            <a class="nav-link p-0" href="#">
                                <img src="img/Profile.png" class="rounded-circle z-depth-0"
                                     alt="avatar image" height="35">
                            </a>
                            <li class="nav-item">
                                <a class="nav-link" href="#" style="color: black"><%=user%></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="LogOut" style="color: black">Log Out</a>
                            </li>


                        </ul>
                    </c:when>

                    <c:otherwise>
                         <ul class="navbar-nav ml-auto nav-flex-icons" style="margin-right: 250px">
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="" data-toggle="modal" data-target="#modalContactForm" >CONTACT US</a>
                            </li>

                            
                            
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="Help.jsp" >FAQ</a>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto nav-flex-icons">
                
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " data-toggle="modal" data-target="#elegantModalForm"  >LOG IN</a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="Register.jsp" >REGISTER</a>
                            </li>
                            
                        </ul>

                    </c:otherwise>
                </c:choose>

            </div>
        </nav>

        <!--/.Navbar -->
        <div style="background-image: url('img/campus-market-big.jpg'); 
             background-repeat:no-repeat; background-size: cover; width:100%; height: 500px;margin-top: -40px">
            <div class="description" style="padding-top: 13%">
                <h1 style="font-size:60px; color: black">Campus Online Market</h1>
                <br>

                <strong>   <p class="summary" style="font-size:30px;color: black">Everything Sells at your Comfort .</p> </strong> 
                <strong>       <p class="summary" style="font-size:30px;color: black"> " One Stop shopping Website for the Comrades.. "</p> </strong> 

            </div>
        </div>
        <div>
            <h2> Fresh Recommendations</h2>
        </div>
        <div class="card-deck " style="display: flex; flex-wrap: wrap; padding: 1.5em 0em 1.5em 0em;
             " >
            <c:out value="${mesage }"></c:out>

            <c:forEach  end="7" var="upload" varStatus="vs" items="${sublist}">
                <!-- Card -->
                <div class="card mb-3 view overlay zoom " style="flex: 1 0 22%; height:auto">

                    <div  class=""  style=" background-repeat:no-repeat;
                          height:250px;  background-position: center; " >
                        <img style="max-width: 100%;display: block; height: 100%" src="data:image/jpg;base64,${upload.b64}">
                        <div class="mask flex-center rgba-blue-light">

                            <a class="btn btn-primary btn-green" href="" data-toggle="modal" data-target="#centralModalSm" > More Details</a>
                        </div>
                        <div>
                            <p style="background-color: green;font-weight: bold;max-width: 50px">New</p>
                        </div>


                    </div>

                    <div class="card-body  mb-2" >
                        <div style="height:50%">

                            <p>${upload.brand}  ${upload.category}</p>

                            <p > Ksh ${upload.price}</p>  

                        </div>



                    </div>

                </div>




            </c:forEach>
        </div>

        <!-- Modal -->
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
                        <p class="font-small blue-text d-flex justify-content-end" style="font-size: 20px">Forgot <a href="confirmEmail.jsp" class="blue-text ml-1">
                                Password?</a></p>

                        <!--Footer-->
                        <div class="modal-footer mx-5 pt-3 mb-1">
                            <p class="font-small grey-text d-flex justify-content-end">Not a member? <a href="Register.jsp" class="blue-text ml-1">
                                    Register</a></p>
                        </div>
                    </div>
                    <!--/.Content-->
                </div>
            </div>
        </div>
        <!-- Modal -->

        <div class="modal fade" id="modalContactForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header text-center">
                        <h4 class="modal-title w-100 font-weight-bold">Write to us</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="Contact_us" method="post">
                        <div class="modal-body mx-3">
                            <div class="md-form mb-5">
                                <i class="fas fa-user prefix grey-text"></i>
                                <input type="text" id="form34" class="form-control validate" name="name">
                                <label data-error="wrong" data-success="right" for="form34">Your name</label>
                            </div>

                            <div class="md-form mb-5">
                                <i class="fas fa-envelope prefix grey-text"></i>
                                <input type="email" id="form29" class="form-control validate" name="email">
                                <label data-error="wrong" data-success="right" for="form29">Your email</label>
                            </div>

                            <div class="md-form mb-5">
                                <i class="fas fa-tag prefix grey-text"></i>
                                <input type="text" id="form32" class="form-control validate" name="subject">
                                <label data-error="wrong" data-success="right" for="form32">Subject</label>
                            </div>

                            <div class="md-form">
                                <i class="fas fa-pencil prefix grey-text"></i>
                                <textarea type="text" id="form8" class="md-textarea form-control" rows="3" name="message"></textarea>
                                <label data-error="wrong" data-success="right" for="form8">Your message</label>
                            </div>

                        </div>
                        <div class="modal-footer d-flex justify-content-center">
                            <button class="btn btn-unique" type="submit">Send <i class="fas fa-paper-plane-o ml-1"></i></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- Central Modal Small -->
        <div class="modal fade" id="centralModalSm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">

            <!-- Change class .modal-sm to change the size of the modal -->
            <div class="modal-dialog modal-sm modal-danger" role="document">


                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title w-100" id="myModalLabel" style="color:black">First you need to log in</h4>

                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn red btn-sm" data-dismiss="modal">Close</button>

                    </div>
                </div>
            </div>
        </div>
        <!-- Central Modal Small -->

        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
        <jsp:include page="./includes/footer2.jsp"/>


    </body>

</html>