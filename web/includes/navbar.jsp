<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="green darken-3 topnav ">
            <a href="/DailyMilkCollectionSystem/">Home</a>
            <c:if test="${sessionScope.loggedIn==false || sessionScope.loggedIn==null}">
                <a href="/DailyMilkCollectionSystem/#aboutUs">About Us</a>
                <a href="Contactus.jsp">Contact Us</a>
            </c:if>
            <c:if test="${sessionScope.loggedIn==true}">
                <a href="account">Account</a>
            </c:if>
            <c:if test="${sessionScope.accountInfo.role.equals('COLLECTOR')}">
                <a href="supply">Record Supply</a>
                <a href="supply-report">Supply Reports</a>
            </c:if>
            <c:if test="${sessionScope.accountInfo.role.equals('ADMIN')}">
                <a href="create-tender">Tender</a>
                <a href="supply-report">Supply Reports</a>
            </c:if>
            <c:if test="${sessionScope.loggedIn==true}">
                <a href="supply-records">Supply Records</a>
            </c:if>
            <c:if test="${sessionScope.accountInfo.role.equals('ADMIN')}">
                <a href="add-supplier">Add Supplier</a>
            </c:if>
            <c:if test="${sessionScope.loggedIn==false || sessionScope.loggedIn==null}">   
                <div class="login-container">
                    <a href="login">Login</a>
                </div>
            </c:if>
            <c:if test="${sessionScope.loggedIn==true}">
                <div class="login-container">
                    <a href="logout">Logout</a>
                </div>
            </c:if>
</div>