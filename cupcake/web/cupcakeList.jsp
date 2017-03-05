<%-- 
    Document   : cupcakeList
    Created on : 28-02-2017, 14:22:27
    Author     : vfgya_000
--%>

<%@page import="brain.Cupcake"%>
<%@page import="java.util.ArrayList"%>
<%@page import="brain.Bottom"%>
<%@page import="brain.Topping"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CCstyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <h1>iCupCake</h1>
        </header>
        <main>

            <h2>Bottoms</h2>
            <form action="/cupcake/CCservlet2" method="post">
                <c:forEach items="${bottomList}" var="Bottom">
                    <input type="radio" class="bottom" name="bottom" value="<c:out value="${Bottom.bottomType}" />"> <c:out value="${Bottom.bottomType}" /> <br>
                </c:forEach>
                <h2>Toppings</h2>
                <c:forEach var="Topping" items="${toppingList}">
                    <input type="radio" class="topping" name="topping" value="<c:out value="${Topping.toppingType}" />"> <c:out value="${Topping.toppingType}" /> <br>
                </c:forEach>
                <input type="submit" class="ch" value="Add"/>

                <h3>Cart:</h3>
                <ul>
                    <c:forEach var="cc" items="${ccList}">
                        <li>BOTTOM: <c:out value="${cc.bType}" /><br>  TOPPING: <c:out value="${cc.tType}" /><br>   PRICE:  <c:out value="${cc.bothPrice}" /></li>
                        </c:forEach>
                </ul>
                <input type="submit" name="Checkout" class="ch" value="Checkout"/>
            </form>
        </main>

    </body>
</html>
