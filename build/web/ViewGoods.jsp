<%-- 
    Document   : ViewGoods
    Created on : Mar 23, 2019, 2:28:33 PM
    Author     : AMO
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Goods</title>
        <link href="css/toast_message.css" rel="stylesheet"/>
    </head>
    <body>
        <jsp:include page="./includes/toast_message.jsp" />
        <% response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null) {

                response.sendRedirect("Login.jsp");
            }


        %>
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
                        <a class="nav-link" href="#">About Us</a>
                    </li>


                </ul>
                <c:choose>
                    <c:when test="${sessionScope.loggedIn==true}">

                        <ul class="navbar-nav nav-flex-icons" >


                            <li class="nav-item">
                                <a class="nav-link" href="UploadHib.jsp">Sell</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="ViewOwnUploads">Uploads</a>
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
        <br>  <br>  <br>
        <div class="search_button" style=" height: 90px; ">
            <!-- Search form -->
            <form action="SearchServlet" method="POST" class="form-inline md-form mr-auto mb-4" style="margin-left: 500px">
                <div class="md-form active-pink active-pink-2 mb-3 mt-0">
                    <input class="form-control" type="text" name="search" placeholder="Search" aria-label="Search">
                </div>
                <button class="btn aqua-gradient btn-rounded btn-sm my-0" type="submit">Search</button>
            </form>
            <div style="max-width: 100%;margin-left: 30px; height: 50px">
                <h5 style="color:green; ">   ${requestScope.success} </h5> 
                <h5 style="color:black"> ${requestScope.error}  </h5> 
                <br>
            </div>

            <div class="card-deck" style="display: flex; flex-wrap: wrap; padding-left: 2% " >

                <c:forEach begin="0" end="7" var="upload" varStatus="vs" items="${goods}">
                    <!-- Card -->
                    <div class="card mb-3 " style="flex: 1 0 22%; ">

                        <div  class="view overlay zoom"  style="background-image: url('data:image/jpg;base64,${upload.b64}'); background-repeat:no-repeat;
                              height:350px;  background-position: center; " >

                            <div class="mask flex-center rgba-blue-light">

                                <a class="btn btn-primary btn-green" href="DetailsServlet?index=${upload.itemindex}"> More Details</a>
                            </div>


                        </div>

                        <div class="card-body  mb-2" >
                            <div style="height:65%">

                                <h4 class="card-title"><a>${upload.brand}</a></h4>
                                <strong>     <p class="card-text">${upload.cond}</p> </strong> 
                                <strong>     <p class="card-text">Ksh ${upload.price}</p>  </strong>
                                <strong>         <p class="card-text"></p> </strong>  
                                <p class="card-text"></p>
                            </div>
                            <div>
                                <a class="btn btn-primary"  data-toggle="modal" href="#myModal${vs.index}" id="viewDetailButton${vs.index}" >Buy</a>
                            </div>
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
            <div style="align-items: center">
                <h1 style="padding-left: 39%;color: black">Recent Uploads </h1>

            </div>


            <div class="card-deck" style="display: flex; flex-wrap: wrap; padding-left: 2% " >

                <c:forEach begin="0" end="7" var="upload" varStatus="vs" items="${sublist}">
                    <!-- Card -->
                    <div class="card mb-3"style="flex: 1 0 22%;  ">

                        <div  class="view overlay zoom"  style="background-image: url('data:image/jpg;base64,${upload.b64}'); background-repeat:no-repeat;
                              height:350px;  background-position: center; " >

                            <div class="mask flex-center rgba-blue-light">

                                <a class="btn btn-primary btn-green" href="DetailsServlet?index=${upload.itemindex}"> More Details</a>
                            </div>
                        </div>

                        <div class="card-body  mb-2" >
                            <div style="height:65%">

                                <h4 class="card-title"><a>${upload.brand}</a></h4>
                                <strong>     <p class="card-text">${upload.cond}</p> </strong> 
                                <strong>     <p class="card-text">Ksh ${upload.price}</p>  </strong>
                                <strong>         <p class="card-text"></p> </strong>  
                                <p class="card-text"></p>
                            </div>
                            <div>
                                <a class="btn btn-primary"  data-toggle="modal" href="#myModa${vs.index}" id="viewDetailButtons${vs.index}" >Buy</a>
                            </div>
                            <!-- Modal -->
                            <div class="modal fade" id="myModa${vs.index}" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
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
            <br>




            <jsp:include page="./includes/scripts.jsp"/>
            <jsp:include page="./includes/footer.jsp"/>
            <script type="text/javascript" src="js/toast_message.js"></script>
    </body>
</html>
