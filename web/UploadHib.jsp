<%-- 
    Document   : UploadHib
    Created on : Apr 8, 2019, 8:38:55 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="/includes/global_stylesheets.jsp"/>
        <link href="css/toast_message.css" rel="stylesheet"/>
        <title>Upload</title>
    </head>

    <body>


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
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ShowGoods" >Buy</a>
            </li>
           
            <li class="nav-item">
                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="ViewOwnUploads">Uploads</a>
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




        <div style="margin: auto; width: 42%;padding: 1.5em 1.5em 1.5em 1.5em; background-color: white ">

            <form method="post" action="PhotoUploadHib" enctype="multipart/form-data" class="text-center border border-light p-5">
                <p class="h4 mb-4" style="font-size:30px;  font-weight: 900;">Post an item for Sale</p>
                <div>
                    <h5 style="color:lightgreen; background-color: darkgreen">   ${requestScope.success} </h5> 
                    <h5 style="color:red;background-color:darkred"> ${requestScope.error}  </h5> 
                    <br>
                </div>
                <strong style="float: left"> <b> Enter Item Category </b> </strong>
                <input type="text" name="category" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Category:eg phone,gas cylinder,woofer etc"  required >
                <strong style="float: left"> <b> Enter Item Brand(Include the model*) </b> </strong>
                <input type="text" name="brand" id="defaultLoginFormEmail" class="form-control mb-4"  placeholder="Brand eg Samsung Galaxy J1 " required>
                <strong style="float: left"> <b> Upload an Image of the item </b> </strong> <br>  
                <div class="col-sm-7">
                    <input name="photo" type="file" id="file1"  accept="png/jpeg"  required />
                </div>
                <br>
                <strong style="float: left"> <b> How Old Is The Item </b> </strong> <br>
                <select name="itemage" class="browser-default custom-select mb-4" required >
                    <option value="" ></option>
                    <option value="new" >Brand New</option>
                    <option value="Two Months old">0-3 months</option>
                    <option value="Five Months old">4-7 months</option>
                    <option value="A year old" >8-12 months</option>
                    <option value="More than a year Old">Over a year</option>


                </select>


                <strong style="float: left"> <b> What is the working Condition of the item </b> </strong> <br>
                <select name="condition" class="browser-default custom-select mb-4" required >
                    <option ></option>
                    <option value="Functional" >Working</option>
                    <option value="Not Functional ">Not working</option>

                </select>
                <br>
                <strong style="float: left"> <b> Brief Description </b> </strong> <br>
                <div class="form-group">
                    <textarea class="form-control rounded-0" name="description"id="exampleFormControlTextarea2" rows="2" placeholder="Brief description"></textarea>
                </div>

                <strong style="float: left"> <b> Quote a price for the Item </b> </strong> <br>
                <input type="number" name="price" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Ksh" required >
                <button class="btn btn-info btn-block my-4" type="submit">Upload </button>

            </form>

        </div>


        <jsp:include page="includes/scripts.jsp"/>
         <jsp:include page="./includes/footer2.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
    </body>
</html>
