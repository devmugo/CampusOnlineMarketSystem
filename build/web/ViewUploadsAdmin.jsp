<%-- 
    Document   : ViewTransactions
    Created on : Apr 11, 2019, 10:35:45 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
       
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Uploads</title>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
  <jsp:include page="./includes/global_stylesheets.jsp"/>
  <style>

    .map-container{
overflow:hidden;
padding-bottom:56.25%;
position:relative;
height:0;
}
.map-container iframe{
left:0;
top:0;
height:100%;
width:100%;
position:absolute;
}
  </style>
</head>

<body class="grey lighten-3">
       <%   response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            HttpSession sessionsa = request.getSession(false);
            String user = (String) sessionsa.getAttribute("user");
            if (user == null && user != "admin") {

                response.sendRedirect("Home");
            }


        %>

  <!--Main Navigation-->
  <header>

    <!-- Navbar -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar">
      <div class="container-fluid">

        

        <!-- Collapse -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Links -->
        <div class="collapse navbar-collapse" id="navbarSupportedContent">

          <!-- Left -->
          <ul class="navbar-nav mr-auto">
           
            <li class="nav-item">
              <a class="nav-link waves-effect" href="#" target="_blank">
                </a>
            </li>
            <li class="nav-item">
              <a class="nav-link waves-effect" href="#"
                target="_blank">
                </a>
            </li>
            <li class="nav-item">
              <a class="nav-link waves-effect" href="#" target="_blank">
                </a>
            </li>
          </ul>

          <!-- Right -->
          <ul class="navbar-nav nav-flex-icons">
            <li class="nav-item">
              <a href="" class="nav-link waves-effect" target="_blank">
               
              </a>
            </li>
            <li class="nav-item">
              <a href=" " class="nav-link waves-effect" target="_blank">
               
              </a>
            </li>
            <li class="nav-item">
              <a href="LogOut" class="nav-link border border-light rounded waves-effect"
               style="color:black;font-weight: bold"
                <i class="fab fa-github mr-2"></i> LOG OUT
              </a>
            </li>
          </ul>

        </div>

      </div>
    </nav>
    <!-- Navbar -->

    <!-- Sidebar -->
    <div class="sidebar-fixed position-fixed">

      <a class="logo-wrapper waves-effect">
        <img src="img/logo.png" class="img-fluid" alt="">
      </a>

       <div class="list-group list-group-flush">
        <a href="Reports" class="list-group-item list-group-item-action waves-effect">
         DashBoard</a>
        <a href="ViewContactS" class="list-group-item list-group-item-action waves-effect">
        Users</a>
          <a href="ViewTransactions" class="list-group-item list-group-item-action waves-effect">
          View Transactions</a>
          
          <a href="ViewGoodsAdmin" class="list-group-item active waves-effect">
          Uploads
        </a>
       
        
        <a href="GetDoneTransactions" class="list-group-item list-group-item-action waves-effect">
          Done Transactions</a>
          <a href="ViewMessages" class="list-group-item list-group-item-action waves-effect">
          Messages</a>
           
      </div>

    </div>
    <!-- Sidebar -->

  </header>
  <!--Main Navigation-->

  <!--Main layout-->
  <main style="margin-top: 5%" >
    <div class="">
     
       <div >
            <h1 style="color: black ;margin-top: 50px"> <u>Items uploaded To the Website </u></h1>
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

    </div> 
  </main>
  <!--Main layout-->
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
 

     

 
