<%-- 
    Document   : index
    Created on : Mar 13, 2019, 1:16:48 PM
    Author     : AMO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome  </title>

    </head>
    <body >
        <!--Navbar -->
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark default-color fixed-top">

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-333"
                    aria-controls="navbarSupportedContent-333" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#about">About Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact">Contact Us</a>
                    </li>

                </ul>
                <c:choose>
                    <c:when test="${sessionScope.loggedIn==true}">
                        <% response.setHeader("Cache-Control", "no-cache,must-revalidate,no-store");
                            response.setHeader("Pragma", "no-cache");
                            response.setHeader("Expires", "0");

                            HttpSession sessionsa = request.getSession(false);
                            String user = (String) sessionsa.getAttribute("user");
                        %>
                        <ul class="navbar-nav nav-flex-icons" style="">

                            <li class="nav-item">
                                <a class="nav-link" href="ShowGoods">Buy</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="UploadHib.jsp">Sell</a>
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
                    </c:when>

                    <c:otherwise>
                        <ul class="navbar-nav ml-auto nav-flex-icons">
                            <li class="nav-item">
                                <a class="nav-link" href="Loginpage.jsp">Log In</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Register.jsp">Register</a>
                            </li>

                        </c:otherwise>
                    </c:choose>

            </div>
        </nav>
        <!--/.Navbar -->
        <div style="background-image: url('img/back.jpg'); 
             background-repeat:no-repeat; background-size: cover; width:100%; height: 700px">
            <div class="description" style="padding-top: 13%">
                <h1 style="font-size:60px;">Campus Online Market</h1>
                <br>

                <p class="summary" style="font-size:30px;">Everything Sells at your Comfort .</p>
                <p class="summary" style="font-size:30px;"> " One Stop shopping Website for the Comrades.. "</p>

            </div>
        </div>
        <div>
                     
            
            
        </div>
        <div>
            <!-- Card group -->
           <div class="card-deck" style="padding: 1.5em 1.5em 1.5em 1.5em;">

                <!-- Card -->
                <div id="about" class="card mb-4" style="padding: 1.5em 1.5em 1.5em 1.5em;">
                   <!-- Card -->
                    <div class="card card-image" style="background-image:url('img/back.jpg');">

                        <!-- Content -->
                        <div class="text-white text-center d-flex align-items-center rgba-black-strong py-5 px-4">
                            <div>
                                
                                <h3 class="card-title pt-2"><strong>About Us</strong></h3>
                                <h3 ><strong><u>How we Work </u></strong></h3>
                                <p>The Campus Online Market Operates like a simple market only that you are selling your goods online.
                                    If you have an item on sale you just post it to the website then RELAX and wait for your good to get a buyer.
                                    Once your item gets a customer you will be notified via e-mail and you will be required to avail it to our offices 
                                    after which you will sign a form to show that you have availed the goods.You are required to collect your payments
                                    a day after availing your goods.<br>
                                    <strong>Note: Each commodity is eligible to a 10% service fee</strong>
                                    <br>
                                    <h3 ><strong><u>Our Offices </u></strong></h3>
                                    Our offices are located in Njokerio near the mosque Opposite Queens hostel <br>
                                    We are Open from mon - sat from 8 am to 5 pm.<br>
                                    You can call on <strong>0700896543</strong> <br>
                                    or <br>
                                    Visit us at any time with in the working hours <br>
                                    or <br>
                                    Write to us and let us know your problem ---> <br>
                                   
                                   </p>
                                
                            </div>
                        </div>

                    </div>
                   
                </div>
             
            </div>
            <div class="card-deck" style="padding: 1.5em 1.5em 1.5em 1.5em; ">
                
                 <div id="contact" class="card mb-4" style=" padding: 1.5em 1.5em 1.5em 1.5em;">

                    <div style="padding:  0 1.5em 0 1.5em;">
                        <!-- Default form contact -->
                        <form id="contact_us" name="contact_us" action="Contact_us" method="POST">
                            <h5 class="card-header  white-text text-center py-4" style="background-color: #00a087;font-size: 30px">
                                <strong>Contact us</strong>
                            </h5>
                            <br>
                            <strong style="float: left"> <b> Enter Your Name </b> </strong>
                            <input type="text" id="defaultContactFormName" class="form-control mb-4" name="name" placeholder="Name">

                            <strong style="float: left"> <b> Enter Your Phone Number</b> </strong>
                            <input type="text" name="number" id="defaultContactFormEmail" class="form-control mb-4" placeholder="Phone Number">

                            <strong style="float: left"> <b> Subject of the message </b> </strong>
                            <select class="browser-default custom-select mb-4" name="subject">

                                <option value="default_item" >Default Items</option>
                                <option value="details">Transaction details</option>
                                <option value="contact">Seller Contacts</option>
                                <option value="features">Feature request</option>
                                <option value="forgot_password">Forgot Password</option>
                                <option value="Other">Other(Specify in the message)</option>
                            </select>

                            <strong style="float: left"> <b> Message </b> </strong>
                            <div class="form-group">
                                <textarea class="form-control rounded-0" name="message"id="exampleFormControlTextarea2" rows="2" placeholder="Message"></textarea>
                            </div>

                            <br>
                            <button class="btn btn-info" style=" width: 200px;"type="submit">Send</button>
                            <br>  <br>  

                        </form>
                    </div>

                </div>

                
                
                
            </div>

        </div>
          <jsp:include page="./includes/footer.jsp"/>

    </body>
    
</html>