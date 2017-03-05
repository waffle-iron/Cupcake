<%-- 
    Document   : index
    Created on : 28-02-2017, 12:35:02
    Author     : vfgya_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h2>login</h2>
            <form action="/cupcake/CCservlet1" method="post">
                <input id="usrname" type="text" name="username" value="" placeholder="type your username">
                <input id="pssword" type="password" name="password" value="" placeholder="type your password" >
                <input id="btn" type="submit" value="Login"/>
            </form>
        </main>
    </body>
</html>
