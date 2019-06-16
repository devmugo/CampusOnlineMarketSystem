<%-- 
    Document   : Help
    Created on : Jun 13, 2019, 4:09:03 PM
    Author     : AMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="./includes/global_stylesheets.jsp"/>
        <title>FAQ</title>
    </head>
    <body>
        <style>
            /* Icon 1 */

            .animated-icon1, .animated-icon2, .animated-icon3 {
                width: 30px;
                height: 20px;
                position: relative;
                margin: 0px;
                -webkit-transform: rotate(0deg);
                -moz-transform: rotate(0deg);
                -o-transform: rotate(0deg);
                transform: rotate(0deg);
                -webkit-transition: .5s ease-in-out;
                -moz-transition: .5s ease-in-out;
                -o-transition: .5s ease-in-out;
                transition: .5s ease-in-out;
                cursor: pointer;
            }

            .animated-icon1 span, .animated-icon2 span, .animated-icon3 span {
                display: block;
                position: absolute;
                height: 3px;
                width: 100%;
                border-radius: 9px;
                opacity: 1;
                left: 0;
                -webkit-transform: rotate(0deg);
                -moz-transform: rotate(0deg);
                -o-transform: rotate(0deg);
                transform: rotate(0deg);
                -webkit-transition: .25s ease-in-out;
                -moz-transition: .25s ease-in-out;
                -o-transition: .25s ease-in-out;
                transition: .25s ease-in-out;
            }

            .animated-icon1 span {
                background: #e65100;
            }

            .animated-icon2 span {
                background: #e3f2fd;
            }

            .animated-icon3 span {
                background: #f3e5f5;
            }

            .animated-icon1 span:nth-child(1) {
                top: 0px;
            }

            .animated-icon1 span:nth-child(2) {
                top: 10px;
            }

            .animated-icon1 span:nth-child(3) {
                top: 20px;
            }

            .animated-icon1.open span:nth-child(1) {
                top: 11px;
                -webkit-transform: rotate(135deg);
                -moz-transform: rotate(135deg);
                -o-transform: rotate(135deg);
                transform: rotate(135deg);
            }

            .animated-icon1.open span:nth-child(2) {
                opacity: 0;
                left: -60px;
            }

            .animated-icon1.open span:nth-child(3) {
                top: 11px;
                -webkit-transform: rotate(-135deg);
                -moz-transform: rotate(-135deg);
                -o-transform: rotate(-135deg);
                transform: rotate(-135deg);
            }

            /* Icon 3*/

            .animated-icon2 span:nth-child(1) {
                top: 0px;
            }

            .animated-icon2 span:nth-child(2), .animated-icon2 span:nth-child(3) {
                top: 10px;
            }

            .animated-icon2 span:nth-child(4) {
                top: 20px;
            }

            .animated-icon2.open span:nth-child(1) {
                top: 11px;
                width: 0%;
                left: 50%;
            }

            .animated-icon2.open span:nth-child(2) {
                -webkit-transform: rotate(45deg);
                -moz-transform: rotate(45deg);
                -o-transform: rotate(45deg);
                transform: rotate(45deg);
            }

            .animated-icon2.open span:nth-child(3) {
                -webkit-transform: rotate(-45deg);
                -moz-transform: rotate(-45deg);
                -o-transform: rotate(-45deg);
                transform: rotate(-45deg);
            }

            .animated-icon2.open span:nth-child(4) {
                top: 11px;
                width: 0%;
                left: 50%;
            }

            /* Icon 4 */

            .animated-icon3 span:nth-child(1) {
                top: 0px;
                -webkit-transform-origin: left center;
                -moz-transform-origin: left center;
                -o-transform-origin: left center;
                transform-origin: left center;
            }

            .animated-icon3 span:nth-child(2) {
                top: 10px;
                -webkit-transform-origin: left center;
                -moz-transform-origin: left center;
                -o-transform-origin: left center;
                transform-origin: left center;
            }

            .animated-icon3 span:nth-child(3) {
                top: 20px;
                -webkit-transform-origin: left center;
                -moz-transform-origin: left center;
                -o-transform-origin: left center;
                transform-origin: left center;
            }

            .animated-icon3.open span:nth-child(1) {
                -webkit-transform: rotate(45deg);
                -moz-transform: rotate(45deg);
                -o-transform: rotate(45deg);
                transform: rotate(45deg);
                top: 0px;
                left: 8px;
            }

            .animated-icon3.open span:nth-child(2) {
                width: 0%;
                opacity: 0;
            }

            .animated-icon3.open span:nth-child(3) {
                -webkit-transform: rotate(-45deg);
                -moz-transform: rotate(-45deg);
                -o-transform: rotate(-45deg);
                transform: rotate(-45deg);
                top: 21px;
                left: 8px;
            }
            .accordion.accordion-3 {
                border-radius: 3px; }
            .accordion.accordion-3 p {
                font-size: 1rem; }
            .accordion.accordion-3 .fa.fa-angle-down {
                margin-top: -10px; }

            .accordion .animated-icon1 span {
                background: #F44336;
            }



        </style>
        <nav class="mb-1 navbar navbar-expand-lg navbar-dark white fixed-top" style="height:70px;">


            <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
                <ul class="navbar-nav mr-auto">
                    <a class="navbar-brand" href="#" style="margin-left: -250px">
                        <img src="img/logo.png" height="50" width="200" class="d-inline-block align-top"
                             alt="mdb logo"> 
                    </a>

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
                                <a class="nav-link" href="#" style="background: black; color: white;font-weight: bold"></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"style="background: black; color: white;font-weight: bold"></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#" style="background: black; color: white;font-weight: bold"></a>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto nav-flex-icons">

                            <a class="nav-link p-0" href="#">
                                <img src="img/Profile.png" class="rounded-circle z-depth-0"
                                     alt="avatar image" height="35">
                            </a>
                            <li class="nav-item">
                                <a class="nav-link" href="#" style="color: black"><%=user%></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="LogOut" style="color: black">Log Out</a>
                            </li>


                        </ul>
                    </c:when>

                    <c:otherwise>
                        <ul class="navbar-nav ml-auto nav-flex-icons">
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="" data-toggle="modal" data-target="#modalContactForm" >CONTACT US</a>
                            </li>

                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="#" >FAQ</a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " data-toggle="modal" data-target="#elegantModalForm"  >LOG IN</a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-outline-default waves-effect btn-sm align-middle " href="Register.jsp" >REGISTER</a>
                            </li>
                        </ul>

                    </c:otherwise>
                </c:choose>

            </div>
        </nav>

        <!--Accordion wrapper-->
        <div class="accordion md-accordion accordion-3 z-depth-1-half" id="accordionEx194" role="tablist"
             aria-multiselectable="true">

            <ul class="list-unstyled d-flex justify-content-center pt-5 red-text">
                <li><i class="fas fa-anchor mr-3 fa-2x" aria-hidden="true"></i></li>
                <li><i class="far fa-life-ring mr-3 fa-2x" aria-hidden="true"></i></li>
                <li><i class="far fa-star fa-2x" aria-hidden="true"></i></li>
            </ul>

            <h2 class="text-center text-uppercase red-text py-4 px-3">Hello my friends, I am the nicest accordion!</h2>

            <hr class="mb-0">

            <!-- Accordion card -->
            <div class="card">

                <!-- Card header -->
                <div class="card-header" role="tab" id="heading4">
                    <a data-toggle="collapse" data-parent="#accordionEx194" href="#collapse4" aria-expanded="true"
                       aria-controls="collapse4">
                        <h3 class="mb-0 red-text">
                            How awesome accordion I am? <div class="animated-icon1 float-right mt-1"><span></span><span></span><span></span></div>
                        </h3>
                    </a>
                </div>

                <!-- Card body -->
                <div id="collapse4" class="collapse show" role="tabpanel" aria-labelledby="heading4" data-parent="#accordionEx194">
                    <div class="card-body pt-0">
                        <p>Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3
                            wolf moon officia aute,
                            non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch
                            3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda
                            shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt
                            sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer
                            farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them
                            accusamus labore sustainable VHS.</p>
                    </div>
                </div>
            </div>
            <!-- Accordion card -->

            <!-- Accordion card -->
            <div class="card">

                <!-- Card header -->
                <div class="card-header" role="tab" id="heading5">
                    <a class="collapsed" data-toggle="collapse" data-parent="#accordionEx194" href="#collapse5" aria-expanded="false"
                       aria-controls="collapse5">
                        <h3 class="mb-0 red-text">
                            You're the greatest accordion! <div class="animated-icon1 float-right mt-1"><span></span><span></span><span></span></div>
                        </h3>
                    </a>
                </div>

                <!-- Card body -->
                <div id="collapse5" class="collapse" role="tabpanel" aria-labelledby="heading5" data-parent="#accordionEx194">
                    <div class="card-body pt-0">
                        <p>Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3
                            wolf moon officia aute,
                            non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch
                            3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda
                            shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt
                            sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer
                            farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them
                            accusamus labore sustainable VHS.</p>
                    </div>
                </div>
            </div>
            <!-- Accordion card -->

            <!-- Accordion card -->
            <div class="card">

                <!-- Card header -->
                <div class="card-header" role="tab" id="heading6">
                    <a class="collapsed" data-toggle="collapse" data-parent="#accordionEx194" href="#collapse6" aria-expanded="false"
                       aria-controls="collapse6">
                        <h3 class="mb-0 red-text">
                            Thank you my dear! <div class="animated-icon1 float-right mt-1"><span></span><span></span><span></span></div>
                        </h3>
                    </a>
                </div>

                <!-- Card body -->
                <div id="collapse6" class="collapse" role="tabpanel" aria-labelledby="heading6" data-parent="#accordionEx194">
                    <div class="card-body pt-0">
                        <p>Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3
                            wolf moon officia aute,
                            non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch
                            3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda
                            shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt
                            sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer
                            farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them
                            accusamus labore sustainable VHS.</p>
                    </div>
                </div>
            </div>
            <!-- Accordion card -->
        </div>
        <script>
            $(document).ready(function () {

                $('.first-button').on('click', function () {

                    $('.animated-icon1').toggleClass('open');
                });
                $('.second-button').on('click', function () {

                    $('.animated-icon2').toggleClass('open');
                });
                $('.third-button').on('click', function () {

                    $('.animated-icon3').toggleClass('open');
                });
            });

        </script>

        <jsp:include page="./includes/scripts.jsp"/>

    </body>       
</html>
