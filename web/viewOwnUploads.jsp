<%-- 
    Document   : ViewUploadsClient
    Created on : Apr 16, 2019, 3:30:27 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-3.3.1.min.js"></script>

        <title>Uploaded Items</title>
    </head>
    <body>
        <jsp:include page="./includes/toast_message.jsp" />


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
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle" href="ShowGoods" >Buy</a>
                    </li>
                    <li class="nav-item">
                        <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="UploadHib.jsp" style="background: black; color: white;font-weight: bold">Sell</a>
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


        <div style="height:100px">
            <br>

            <div style="max-width: 40%;margin-left: 350px; height: 40px">
                <h5 style="color:green; ">   ${requestScope.success} </h5> 
                <h5 style="color:red"> ${requestScope.error}  </h5> 
                <br>
            </div>
            <div>
                <h4> <%=user%>  These are the items you have posted for sale and are not yet bought </h4>  
            </div>

        </div>


        <table id="dtBasicExample" class="table table-striped table-bordered" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th class="th-sm"> <b>Index </b> 

                    </th>
                    <th class="th-sm"><b>Date & Time Uploaded </b> 

                    </th>
                    <th class="th-sm"><b>Product </b> 

                    </th>
                    <th class="th-sm"><b>Working Condition </b> 
                    </th>
                    </th>
                    <th class="th-sm"> <b> Delete </b> 
                    </th>


                </tr>
            </thead>

            <tbody>
                <c:forEach var="up" items="${ownuploads}" varStatus="count">
                    <tr> <td>${count.index+1}</td>
                        <td>${up.date}</td>
                        <td>${up.brand} ${up.category} </td>
                        <td>${up.cond}</td>
                        <td>
                            <div class="text-center">
                                <button class="btn btn-danger btn-sm btn-rounded buttonDelete" data-toggle="modal"  data-target="#modalDelete${count.index}"
                                        >Delete </button>
                            </div>

                        </td>

                    </tr>
                <div class="modal fade" id="modalDelete${count.index}" tabindex="-1" role="dialog" aria-labelledby="modalDelete"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header text-center">
                                <h4 class="modal-title w-100 font-weight-bold ml-5 "style="color:black">Delete</h4>
                                <button type="button" class="close text-danger" data-dismiss="modal" aria-label="Close">

                                </button>
                            </div>
                            <div class="modal-body mx-3">
                                <p class="text-center h4" style="color:black">Are you sure to delete <b>${up.brand} ${up.category} </b></p> <br>
                                <p class="text-center h4"style="color:black">Deleting  means  the item will no longer be available for sale </p> 


                            </div>
                            <div class="modal-footer d-flex justify-content-center deleteButtonsWrapper">

                                <a class="btn btn-primary btn-danger" href="personalDelete?index=${up.itemindex}"> Yes</a>
                                <button type="button" class="btn btn-primary btnNoClass" id="btnNo" data-dismiss="modal">No</button>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </tbody>


    </table>
    <script>
        $('#dtBasicExample').mdbEditor({
            mdbEditor: true
        });
        $('.dataTables_length').addClass('bs-select');



    </script>
    <jsp:include page="./includes/scripts.jsp"/>
    <jsp:include page="./includes/footer.jsp"/>
    <script type="text/javascript" src="js/toast_message.js"></script>

</body>
</html>
