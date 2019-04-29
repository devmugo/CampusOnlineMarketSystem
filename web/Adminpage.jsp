<%-- 
    Document   : Adminpage
    Created on : Mar 23, 2019, 3:02:30 PM
    Author     : AMO
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./includes/global_stylesheets.jsp"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Control Panel</title>
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null && user != "admin") {

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
                        <a class="nav-link" href="#"> </a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto nav-flex-icons">

                    <li class="nav-item">
                        <a class="nav-link" href="LogOut">Log Out</a>
                    </li>

            </div>
        </nav>
        <div class="sidenav" style="width:20%;margin-top: 56px">

            <a href="#" >Welcome  </a>
            <br>
            <a href="ViewContactS">Users  Details </a>
            <br>
            <a href="ViewTransactions">Pending Transactions </a>
            <br>
            <a href="ViewMessages">Users' Messages</a>
            <br>
            <a href="ViewGoodsAdmin">View Uploaded Goods </a>
            <br>

            <a href="GetDoneTransactions">Completed Transactions </a>
            <br>

        </div>

        <!-- Page content -->
        <div class="main" style="margin-left:  20%">
            <div>
            <h1 style="color:blue">Welcome Admin <%=user%> </h1>
            </div>
            <div>
                <h1 style="color:black"> <u>Most Popular Items. Based On the number of purchases </u> </h1>
            </div>
            
            <div>
            <canvas id="myChart" style="max-width: 60%; padding-top: 5%;padding-left: 5%"></canvas>
        </div>
        </div>
             <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>

    </body>
</html>
