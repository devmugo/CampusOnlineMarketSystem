<%-- 
    Document   : ViewTransactions
    Created on : Apr 11, 2019, 10:35:45 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>

        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transactions </title>
    </head>
    <body>
        <%   response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
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
        <div style="align-content:  center">
            <h1 style="padding-left: 35%"> <u> Pending Transactions </u></h1>
        </div>
        <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th class="th-sm"> <b>Transaction Id </b>
                    </th>
                    <th class="th-sm"> <b> ID (Seller) </b>
                    </th>
                    <th class="th-sm"> <b> ID (Buyer) </b>
                    </th>
                    <th class="th-sm"> <b> Date       </b>
                    </th>
                    <th class="th-sm"> <b> Item Sold   </b>
                    </th>
                    
                    <th class="th-sm"> <b> Inform Seller  </b>
                    </th>
                     <th class="th-sm"> <b> Mark as Completed  </b>
                    </th>
                    



                </tr>
            </thead>
            <tbody>
                <c:forEach var="txn" items="${transactions}">
                    <tr>

                        <td>${txn.transactionId}</td>
                        <td>${txn.buyerid}</td>
                        <td>${txn.sellerid}</td>
                        <td>${txn.date}</td> 
                        <td>${txn.itemsold}</td>
                        <c:choose>
                            <c:when test="${txn.msgsent==yes}">
                                <td>  <a class="btn btn-brown btn-sm btn-rounded btn-primary" href="#"> Mail Sent</a>
                                </td>

                            </c:when>
                            <c:otherwise>
                            <td>  <a class="btn btn-green btn-sm btn-rounded btn-primary" href="MailServlet?index=${txn.transactionId}"> Send Mail</a>
                                </td>

                            </c:otherwise>
                        </c:choose>
                 
                         <td>
                             <form method="post" action="CompletedTransactions">  
                                  <input type="image" src="img/yes.jpg" alt="Submit" width="30" height="30">
                                  <input type="hidden" value="${txn.transactionId}" name="transid">
                             </form>
                                </td>
                                 
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <jsp:include page="./includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
        <script>
            $(document).ready(function () {
                $('#dtBasicExample').DataTable();
            });
        </script>

    </body>
</html>
