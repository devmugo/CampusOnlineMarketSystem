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
        <title>Completed Transactions</title>
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
                                <a href="#" class="nav-link waves-effect" target="_blank">
                                 
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link waves-effect" target="_blank">
                                   
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
                    

                    <a href="ViewGoodsAdmin" class="list-group-item list-group-item-action waves-effect">
                        Uploads</a>
                    <a href="GetDoneTransactions" class="list-group-item active waves-effect">
                       Done Transactions
                    </a>
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
                    <h1 style="color: black"> <u> Completed Transactions </u></h1>
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
                                <td>${trns.brand} ${trns.category}  </td>
                                <td>${trns.price}</td>
                                <td>${trns.commission}</td>
                                <td>${trns.amountpaid}</td>


                            </tr>  


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





