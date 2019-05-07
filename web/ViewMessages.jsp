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

        <jsp:include page="./includes/Adminnav.jsp"/>
        <div>
            <h1 style="padding-left: 39%;color: black"> <u>Messages </u>    </h1>
        </div>
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
  <jsp:include page="./includes/footer.jsp"/>

</body>

</html>
