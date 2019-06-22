

<%  response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
    HttpSession sessionsa = request.getSession(false);
    String user = (String) sessionsa.getAttribute("user");
    if (user == null) {

        response.sendRedirect("Loginpage.jsp");
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
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ShowGoods" style="background: black; color: white;font-weight: bold">Buy</a>
            </li>
            <li class="nav-item">
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="UploadHib.jsp" style="background: black; color: white;font-weight: bold">Sell</a>
            </li>
            <li class="nav-item">
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ViewOwnUploads" style="background: black; color: white;font-weight: bold">Uploads</a>
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
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="Help.jsp" style="background: black; color: white;font-weight: bold">FAQ</a>
            </li>
            
           
            <li class="nav-item">
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="LogOut" style="background: black; color: white;font-weight: bold">LOG OUT</a>
            </li>


        </ul>



    </div>
</nav>

