<%-- 
    Document   : ViewContacts
    Created on : Apr 12, 2019, 1:44:27 PM
    Author     : AMO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Contacts</title>

    </head>
    <body>
        <% response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
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
                        <a class="nav-link" href="Adminpage.jsp">Home </a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto nav-flex-icons">

                    <li class="nav-item">
                        <a class="nav-link" href="LogOut">Log Out</a>
                    </li>

            </div>
        </nav>
        <div>
            <h1 style="padding-left: 39%"> <u>Registered Users </u>    </h1>
        </div>

        <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
            <thead>
                <tr>

                    <th class="th-sm"> Name
                    </th>
                    <th class="th-sm"> Phone Number
                    </th>
                    <th class="th-sm"> ID 
                    </th>
                    <th class="th-sm"> Residence
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>

                        <td>${user.firstName} ${user.lastName} </td>
                        <td>${user.phone}</td>
                        <td>${user.nationalId}</td>
                        <td>${user.residence}</td> 

                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
    <jsp:include page="./includes/scripts.jsp"/>
    <script type="text/javascript" src="js/toast_message.js"></script>
    <script>
        $(document).ready(function () {
            $('#dtBasicExample').DataTable();
        });
    </script>
</html>
