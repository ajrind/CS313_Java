<%-- 
    Document   : welcome
    Created on : Mar 3, 2015, 10:42:06 AM
    Author     : Andrew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body>
        <form action="Logout" method="POST">
            <input type="submit" value="Log Out">
        </form>
        <h1>View Posts</h1>
        <h3> <a href="new_post.jsp"> New Post </a> </h3>
       
        <c:forEach items="${webPosts}" var="wp">
            <strong>${wp.title}</strong>
            &nbsp;&nbsp;&nbsp;${wp.content}<br />
            &nbsp;&nbsp;&nbsp;<i>By ${wp.author} at ${wp.date}</i> <br />
        </c:forEach>
        
        <!-- Display posts here -->
        
    </body>
</html>
