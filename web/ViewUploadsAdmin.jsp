<%-- 
    Document   : ViewUploadsAdmin
    Created on : Apr 17, 2019, 7:58:23 PM
    Author     : AMO
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=1">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
       
        <title>Uploaded Items</title>
    </head>
    <body>
         <jsp:include page="./includes/toast_message.jsp" />
          <%    response.setHeader("Cache-Control","no-cache,must-revalidate,no-store");
                response.setHeader("Pragma","no-cache");
                response.setHeader("Expires","0");
                HttpSession sessionsa = request.getSession(false);
                String user = (String) sessionsa.getAttribute("user");
                if(user == null && user != "admin"){
                
                response.sendRedirect("Login.jsp");}
                
                
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
            <h1 style="padding-left:35%"> <u>Items uploaded To the Website </u></h1>
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
                   
                    <th class="th-sm"><b>Uploader Id </b> 
                    </th>
                   
                    <th class="th-sm"> <b> Delete </b> 
                    </th>


                </tr>
            </thead>
    <tbody>
                <c:forEach var="allups" items="${alluploads}" varStatus="count">
                    <tr> <td>${count.index+1}</td>
                        <td>${allups.date}</td>
                        <td>${allups.brand} ${allups.category} </td>
                        <td>${allups.nationalid}</td>
                        
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
                            <p class="text-center h4" style="color:black">Are you sure to delete <b>${allups.brand} ${allups.category} </b></p> <br>
                            <p class="text-center h4"style="color:black">Deleting  means  the item will no longer be available for sale </p> 
                            

                        </div>
                        <div class="modal-footer d-flex justify-content-center deleteButtonsWrapper">
                            
                            <a class="btn btn-primary btn-danger" href="adminDelete?index=${allups.itemindex}"> Yes</a>
                            <button type="button" class="btn btn-primary btnNoClass" id="btnNo" data-dismiss="modal">No</button>
                        </div>
                    </div>
                </div>
            </div>
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