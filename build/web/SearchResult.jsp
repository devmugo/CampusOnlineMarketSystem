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

        <div style="max-width:100%; padding-left: 30px; margin-top: 80px">
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

                <div class="card mb-3 view overlay zoom " style="flex: 1 0 22%; max-width: 22% ">
                <div  class=""  style=" background-repeat:no-repeat;
                              height:250px;  background-position: center; " >
                           <img style="max-width: 100%;display: block; max-height: 100%" src="data:image/jpg;base64,${upload.b64}">
                            <div class="mask flex-center rgba-blue-light">

                                <a class="btn btn-primary btn-green" href="DetailsServlet?index=${upload.itemindex}"> More Details</a>
                            </div>
                </div>
                    <div class="card-body mb-2" >
                        <div style="height:50%">
                        <p> ${upload.brand} ${upload.category}
                            <br>
                             ksh ${upload.price}  </p> 
                     </div>
                    </div>

                </div>




            </c:forEach>
        </div>
        <div style="padding: 30px">



        </div>
        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
        <jsp:include page="./includes/footer2.jsp"/>

    </body>
</html>