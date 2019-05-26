<%-- 
    Document   : ViewDoneTransactions
    Created on : Apr 27, 2019, 5:27:33 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page="./includes/global_stylesheets.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Done Transactions</title>
    </head>
    <body>
           <%response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null && user != "admin") {

                response.sendRedirect("Login.jsp");
            }


        %>
        <jsp:include page="./includes/Adminnav.jsp"/>
           <div style="align-content:  center;margin-top: 50px">
            <h1 style="padding-left: 35%;color: black"> <u> Completed Transactions </u></h1>
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
                    <th class="th-sm"> <b> Date Item Picked       </b>
                    </th>
                    <th class="th-sm"> <b> Item Sold   </b>
                    </th>
                    <th class="th-sm"> <b> Price  </b>
                    </th>
                    <th class="th-sm"> <b> Commission  </b>
                    </th>
                    <th class="th-sm"> <b> Amount Payable  </b>
                    </th>
                 </tr>
            </thead>
            <tbody>
                <c:forEach var="trns" items="${transacts}">
                    <tr>
                        <td>${trns.transid}</td>
                        <td>${trns.sellerid}</td>
                        <td>${trns.buyerid}</td>
                        <td>${trns.datedone}</td> 
                        <td>${trns.itemsold}</td>
                        <td>${trns.price}</td>
                        <td>${trns.commission}</td>
                        <td>${trns.amountpaid}</td>
                        
                        
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
