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
       <jsp:include page="./includes/Adminnav.jsp"/>
        <div style="align-content:  center">
            <h1 style="padding-left: 35%;color: black;margin-top: 50px"> <u> Pending Transactions </u></h1>
        </div>
        <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th class="th-sm"> <b>Transaction Id </b>
                    </th>
                    <th class="th-sm"> <b> ID (Buyer) </b>
                    </th>
                    <th class="th-sm"> <b> ID (Seller) </b>
                    </th>
                    <th class="th-sm"> <b> Date       </b>
                    </th>
                    <th class="th-sm"> <b> Item Sold   </b>
                    </th>
                    </th>
                    <th class="th-sm"> <b> price  </b>
                    </th>
                   
                    <th class="th-sm"> <b> Inform Seller  </b>
                    </th>
                    <th class="th-sm"> <b> Item Availed </b>
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
                        <td>${txn.itemsold} </td>
                        <td>${txn.price} </td>
                        
                        <c:choose>
                            <c:when test="${txn.msgsent=='yes'}">
                                
                                <td>  <a class="btn btn-green btn-sm btn-rounded btn-primary" href="#"> Mail Sent</a>
                                </td>

                            </c:when>
                            <c:otherwise>
                                <td>  <a class="btn btn-blue-grey btn-sm btn-rounded btn-primary" href="MailServlet?index=${txn.transactionId}"> Send Mail</a>
                                </td>
                                
                            

                            </c:otherwise>
                        </c:choose>
                                 <c:choose>
                            <c:when test="${txn.itemdelivered=='yes'}">
                                
                                <td>  <a class="btn btn-green  btn-sm btn-rounded btn-primary" href="#"> Yes</a>
                                </td>

                            </c:when>
                            <c:otherwise>
                                <td>  <a class="btn btn-red btn-sm btn-rounded btn-primary" href="InformBuyerServlet?index=${txn.transactionId}"> No</a>
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
          <jsp:include page="./includes/footer.jsp"/>

    </body>
</html>
