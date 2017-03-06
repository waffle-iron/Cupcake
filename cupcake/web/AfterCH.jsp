<%-- 
    Document   : AfterCH
    Created on : Mar 5, 2017, 4:19:41 PM
    Author     : vfgya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <p class="hello">WELCOME <c:out value="${user.uname}"></c:out> </p>
        </header>
        <main>
            <h4>Thank you for buying!</h4>
            <a href="/cupcake/CCservlet2">Buy more cupcakes</a>
        </main>
    </body>
</html>
