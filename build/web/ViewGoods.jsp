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
    <body >
        <jsp:include page="./includes/toast_message.jsp" />
        <% response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null) {

                response.sendRedirect("Home");
            }


        %>


       

        <nav class="mb-1 navbar navbar-expand-lg navbar-dark white fixed-top" style="height:70px;">

            
            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <a class="navbar-brand" href="#" style="margin-left: -250px">
                        <img src="img/logo.png" height="50" width="200" class="d-inline-block align-top"
                             alt="mdb logo"> 
                    </a>

                </ul>


                <ul class="navbar-nav nav-flex-icons" style="">


                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="UploadHib.jsp" style="background: black; color: white;font-weight: bold">Sell</a>
                    </li>
                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ViewOwnUploads" style="background: black; color: white;font-weight: bold">Uploads</a>
                    </li>
                </ul>

                <ul class="navbar-nav ml-auto nav-flex-icons">
                    <li class="nav-item ">
                        <a class="nav-link p-0" href="#">
                            <img src="img/Profile.png" class="rounded-circle z-depth-0"
                                 alt="avatar image" height="35">
                        </a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="#" style="color: black;font-weight: bold"><%=user%></a>
                    </li>

                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="#" >FAQ</a>
                    </li>


                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="LogOut" >LOG OUT</a>
                    </li>


                </ul>



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
                <h5 style="color:lightgreen; background-color: darkgreen">   ${requestScope.success} </h5> 
                <h5 style="color:red;background-color:darkred"> ${requestScope.error}  </h5>  
                <br>
            </div>

            <div class="card-deck " style="display: flex; flex-wrap: wrap; padding-left: 2%
                 " >

                <c:forEach  end="7" var="upload" varStatus="vs" items="${goods}">
                    <!-- Card -->
                    <div class="card mb-3 view overlay zoom " style="flex: 1 0 22%; ">

                        <div  class=""  style=" background-repeat:no-repeat;
                              height:250px;  background-position: center; " >
                            <img style="max-width: 100%;display: block; height: 100%" src="data:image/jpg;base64,${upload.b64}">
                            <div class="mask flex-center rgba-blue-light">

                                <a class="btn btn-primary btn-green" href="DetailsServlet?index=${upload.itemindex}"> More Details</a>
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
            <div style="background-color: black">
                <h1 style="padding-left: 9%;color: white">Recent Uploads </h1>

            </div>


            <div class="card-deck" style="display: flex; flex-wrap: wrap; padding-left: 2% " >

                <c:forEach begin="0" end="7" var="upload" varStatus="vs" items="${sublist}">
                    <!-- Card -->
                    <div class="card mb-3 view overlay zoom"style="flex: 1 0 22%;height:auto  ">

                        <div   style=" background-repeat:no-repeat;
                               height:250px;  background-position: center; " >
                            <img style="max-width: 100%;display: block; height: 100%" src="data:image/jpg;base64,${upload.b64}">

                            <div class="mask flex-center rgba-blue-light">

                                <a class="btn btn-primary btn-green" href="DetailsServlet?index=${upload.itemindex}"> More Details</a>
                            </div>
                        </div>

                        <div class="card-body  mb-2" >
                            <div style="height:50%">

                                <p>${upload.brand}  ${upload.category}</p>

                                <p >Ksh ${upload.price}</p>  

                            </div>



                        </div>

                    </div>




                </c:forEach>
            </div>
            <br>




            <jsp:include page="./includes/scripts.jsp"/>
            <jsp:include page="./includes/footer2.jsp"/>
            <script type="text/javascript" src="js/toast_message.js"></script>
    </body>
</html>
