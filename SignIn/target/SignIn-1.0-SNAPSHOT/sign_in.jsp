<%-- 
    Document   : signin
    Created on : Mar 3, 2015, 10:32:29 AM
    Author     : Andrew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
    </head>
    <body>
        <h1>Discussion Thread</h1>
        <form action="Verify" method="POST">
            Username: <input type="text" name="username" /> <br />
            Password: <input type="password" name="password" /> <br />
            
            <input type="submit" value="Sign In" />
        </form>
    </body>
</html>
