<%-- 
    Document   : showdetails
    Created on : May 6, 2019, 9:08:41 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <link href="css/toast_message.css" rel="stylesheet"/>
        <title>View Details</title>
    </head>
    <body>
       <jsp:include page="./includes/loggedinnav.jsp"/>
        <c:forEach  var="upload" varStatus="vs" items="${upload}">
            <div class="card-deck" style="margin: 25px; margin-top: 100px" >

                <!-- Card -->
                <div class="card mb-4" style ="">

                    <img style="width:auto"src="data:image/jpg;base64,${upload.b64}" height="460px" >


                </div>
                <!-- Card -->

                <!-- Card -->
                <div class="card mb-4" >
                    <div style="height: 30px">
                        <h2> ${upload.brand} ${upload.category} </h2>
                    </div>
                    <table class="table table-striped" >

                        <tbody>
                            <tr>

                                <td>Date Uploaded</td>
                                <td> ${upload.date}</td>

                            </tr>
                            <tr>

                                <td>Price </td>
                                <td>ksh ${upload.price}</td>

                            </tr>
                            <tr>

                                <td>Working Condition </td>
                                <td>${upload.cond}</td>

                            </tr>
                            <tr>

                                <td>Age  </td>
                                <td>${upload.age}</td>

                            </tr>
                            <tr>

                                <td> </td>
                                <td></td>

                            </tr>

                    </table>

                    <div>
                        <h3><u>Description : </u></h3>
                        <p>${upload.description}</p>

                    </div>

                  <a class="btn btn-primary"  data-toggle="modal" href="#myModal" id="viewDetailButton" >Buy</a>
                </div>

                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
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
        </c:forEach>



         <jsp:include page="./includes/scripts.jsp"/>
          <script type="text/javascript" src="js/toast_message.js"></script>
        <jsp:include page="./includes/footer.jsp"/>
    </body>
</html>
