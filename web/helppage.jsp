<%-- 
    Document   : helppage
    Created on : Jun 3, 2019, 8:11:48 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <title>Campus Market Help</title>
    </head>
    <body>
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark default-color fixed-top">

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-333"
                    aria-controls="navbarSupportedContent-333" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item ">
                        <a class="nav-link" href="Welcome.jsp">Back to Home Page
                            
                        </a>
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

        <!-- online help -->
        <div style="max-width: 30%; margin: auto;margin-top: 5%">
       
        <div class="card" >
            
            <div class="card-body" id="homehelp">
               <h4 class="card-title" style=""><b>How It Works</b></h4>
                <!-- Text -->
                <p class="card-text">The Campus Online Market is a platform where you can buy and sell 
                    your goods.Before you are able to buy and sell you have to
                    <a href="Register.jsp">register </a>as a member then 
                    <a href="Loginpage">Log in </a>.
                    Once you are logged in you can comfortably buy and sell 
                    your products.However to support the developer 
                    a "finding the customer fee" of 10% commission will be 
                    charged on each item successfully sold. The system simplifies the hustle you have to pass through to get the 
                    customer for that item you want to dispose. Your feedback are highly valued so write to us at any time in the 
                    <a href="ContactUs.jsp">Contact Us</a> section .
                    Once you have your item on the market ,you can relax an check on it to see if you have found a customer.
                    Once your item has found a customer you will be notified via an email and you will be required 
                    to avail the item and let us do the trading for you.
                    <b>So ,Register ,Log in and lets sell and buy together hustle free.</b> </p>
                <br> <br>  
                </div>

        </div>
            <div class="card" id="registerhelp" style="margin-top: 3%">
            
                 <div class="card-body">
               <h4 class="card-title"><b>Trouble Registering ?</b></h4>
               
               <p class="card-text">
                  If you are having trouble Registering here are some things you have to note:
                <ul>
                    <li>Each email used in registration is unique. So if you are using another person email or registreing again 
                    using the same email that might be the course of the difficulties. You can talk to us in
                    <a href="ContactUs.jsp">Contact Us</a> section or try the <a href="confirmEmail.jsp"> forgot password </a> option to reset your password
                   <br>
                    </li>
                    <li>National id should be a unique 8 character long national id number.Using a invalid id or another persons id 
                        will nullify your registration to the system automatically.So use the correct id for security purposes and
                        for easier facilitation of payment.<br>
                    </li>
                    <li>
                       The place of residence is an area where you reside. You can use the estate name 
                       or the hostel name.This is necessary incase delivery services will be availed.
                       <br>
                    </li>
                    
                </ul>
                <b>Check out for these Mistakes and <a href="Register.jsp"> try again</a></b>
                 </p>
               <br> <br> 
                </div>

        </div>
           
        <div class="card" id="uploadhelp" style="margin-top: 3%" >
            
                 <div class="card-body">
               <h4 class="card-title"><b>Trouble Uploading ?</b></h4>
                <!-- Text -->
                <p class="card-text">
                    <b>
                Uploading troubles are in most cases caused by the following situations:
                <ul>
                    <li>
                       Failure to fill in one or more fields during the uploading process. Each field is necessary and vital 
                       so must be filled.Each field is necessary in convincing the customer to buy your good and also for record keeping.
                    </li>
                    <li>
                        Uploading an image more than 10 Mbs. Huge image are un uploadable. Try Compressing the images and try to upload 
                        again
                    </li>
                    
                    
                    
                </ul>
                 <b>Check out for these Mistakes and <a href="UploadHib.jsp"> try again</a></b>
                 
                 
                </b>
                 </p>
                </div>
            <br> <br>  <br> <br>

        </div>
           
          
            <div class="card" id="searchhelp" style="margin-top: 3%">
            
                 <div class="card-body">
               <h4 class="card-title"><b>Trouble Finding the Item You Want ?</b></h4>
                <!-- Text -->
                <p class="card-text">
                    <b>
                  If You are having trouble finding the item you want 
                  you can try the search button. Use category keywords to search for the item you want
                  For example use a key word like smart phones if your are looking for a phone 
                  or bicycles if you are looking for a bicycle.
                  </b>
                </p>
                <br> <br>  <br> <br>
                </div>

        
             </div>
            <div class="card" style="margin-top: 3%" id="buyhelp">
            
                 <div class="card-body">
               <h4 class="card-title"><b>Buying An Item ?</b></h4>
                <!-- Text -->
                <p class="card-text">
                    
                   Once you have purchased an item a mail will be sent to you to inform you
                   of the purchase. The item will be ready for pick up in 24 hrs time.
                   You can now relax and start planning for your item
                   
                </p>
                
                <br> <br>  <br> <br>
                </div>

        </div>
           
            
             </div>
        
        <!-- Card -->
    </body>
</html>
