<%-- 
    Document   : SearchResult
    Created on : Apr 6, 2019, 2:31:09 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <title>Search Results</title>
        <link href="css/toast_message.css" rel="stylesheet"/>

    </head>
    <body>

        <%  response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null) {

                response.sendRedirect("Login.jsp");
            }


        %>

        <nav class="mb-1 navbar navbar-expand-lg navbar-dark default-color">

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-333"
                    aria-controls="navbarSupportedContent-333" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="ShowGoods">Back</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="#">About Us</a>
                    </li>


                </ul>
                <c:choose>
                    <c:when test="${sessionScope.loggedIn==true}">

                        <ul class="navbar-nav nav-flex-icons" >

                            <li class="nav-item">
                                <a class="nav-link" href="#">Buy</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Sell</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Uploads</a>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto nav-flex-icons">

                            <a class="nav-link p-0" href="#">
                                <img src="img/Profile.png" class="rounded-circle z-depth-0"
                                     alt="avatar image" height="35">
                            </a>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><%=user%></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="LogOut">Log Out</a>
                            </li>


                        </ul>
                    </c:when>

                    <c:otherwise>
                        <ul class="navbar-nav ml-auto nav-flex-icons">
                            <li class="nav-item">
                                <a class="nav-link" href="Login.jsp ">Log In</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Register.jsp">Register</a>
                            </li>

                        </c:otherwise>
                    </c:choose>

            </div>
        </nav>
        <div style="max-width:100%;text-align: center;">
            <h1 style="color: black; "> search results </h1>
        </div>
        <div style="height: 30px; "> 

            <div style="max-width: 100%;margin-left: 30px; height: 40px">
                <h5 style="color:green; ">   ${requestScope.success} </h5> 
                <h5 style="color:black"> ${requestScope.error}  </h5> 
                <br>
            </div>


        </div>

        <div class="card-deck" style="display: flex; flex-wrap: wrap; padding-left: 2% " >
            <c:forEach  begin="0" end="5" var="upload" varStatus="vs" items="${searchresults}">
                <!-- Card -->

                <div class="card mb-3"style="flex: 1 0 22%; max-width: 22%; ">
                    <div>
                        <img class="card-img-top" src="data:image/jpg;base64,${upload.b64}" alt="Item" height="200px">
                    </div>
                    <div class="card-body" style="height:65%">

                        <!-- Title -->
                        <h4 class="card-title"><a>${upload.brand}</a></h4>
                        <!-- Text -->
                        <p class="card-text"> <b> ${upload.cond} </b> </p> 

                        <p class="card-text">ksh <b> ${upload.price}  </b></p> 

                        <a class="btn btn-primary"  data-toggle="modal" href="#myModal${vs.index}" id="viewDetailButton${vs.index}" >Buy</a>
                        <!-- Modal -->
                        <div class="modal fade" id="myModal${vs.index}" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
                             aria-hidden="true">

                            <!-- Add .modal-dialog-centered to .modal-dialog to vertically center the modal -->
                            <div class="modal-dialog modal-dialog-centered" role="document">


                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle" style="color: black; font-weight: bold">Confirm Purchase</h5>

                                    </div>
                                    <div class="modal-body" style="color: black">
                                        <h4>You are about to purchase ${upload.brand} ${upload.category}</h4>
                                        <p >Working Condition :<b> ${upload.cond} </b> </p>
                                        <p>Which is  : <b> ${upload.age} </b> </p>
                                        <p>At a price of :<b>  ${upload.price}</b> </p>


                                    </div>
                                    <div class="modal-footer">

                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                                        <a class="btn btn-primary" href="Transactions?index=${upload.itemindex}"> Continue</a>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>




            </c:forEach>
        </div>
        <div style="padding: 30px">



        </div>
        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>

    </body>
</html>