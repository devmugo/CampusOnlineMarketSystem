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
                        <a class="nav-link" href="/CampusOnlineMarketSystem/">Home</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="#">About Us</a>
                    </li>


                </ul>



                <ul class="navbar-nav nav-flex-icons" >


                    <li class="nav-item">
                        <a class="nav-link" href="ShowGoods">Buy</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ViewOwnUploads">Uploads</a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto nav-flex-icons">

                    <a class="nav-link p-0" href="#">
                        <img src="img/Profile.png" class="rounded-circle z-depth-0"
                             alt="avatar image" height="35">
                    </a>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><%=user%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="LogOut">Log Out</a>
                    </li>


                </ul>






            </div>
        </nav>


        <div style="margin: auto; width: 45%; padding: 10px; background-color: white ">

            <form method="post" action="PhotoUploadHib" enctype="multipart/form-data" class="text-center border border-light p-5">
                <p class="h4 mb-4" style="font-size:30px;  font-weight: 900;">Post an item for Sale</p>
                <div>
                    <h5 style="color:green;">   ${requestScope.success} </h5> 
                    <h5 style="color:red"> ${requestScope.error}  </h5> 
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

                <strong style="float: left"> <b> Quote a price for the Item </b> </strong> <br>
                <input type="number" name="price" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="Ksh" required >
                <button class="btn btn-info btn-block my-4" type="submit">Upload </button>

            </form>

        </div>


        <jsp:include page="includes/scripts.jsp"/>
        <script type="text/javascript" src="js/toast_message.js"></script>
    </body>
</html>
