<%-- 
    Document   : ViewMessages
    Created on : Apr 8, 2019, 10:36:22 AM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <title>View Messages</title>

    </head>
    <body>
        <%  response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
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

        <!--Table-->
        <table id="myTable" class="table table-bordered table-striped table-responsive-md" >

            <!--Table head-->
            <thead class="text-dark">
                <tr>
            <strong>     <th>No </th>  </strong>        
            <strong>       <th>Name </th>  </strong>  
            <strong>        <th>Number </th>    </strong>  
            <strong>        <th>Subject</th>    </strong>  
            <strong>       <th>Message </th>    </strong>  

        </tr>
    </thead>
    <!--Table head-->

    <!--Table body-->
    <tbody>
        <c:forEach var="mess" items="${messages}">
            <tr>
                <td>${mess.index_number}</td>
                <td>${mess.name}</td>
                <td>${mess.number}</td>
                <td>${mess.subject}</td>
                <td>${mess.message}</td>                 
            </tr>
        </c:forEach>
    </tbody>

    <!--Table body-->

</table>
<!--Table-->

<jsp:include page="./includes/scripts.jsp"/>
<script type="text/javascript" src="js/toast_message.js"></script>
<script>
    $(document).ready(function () {
        $('#myTable').DataTable();
    });
</script>  

</body>

</html>
