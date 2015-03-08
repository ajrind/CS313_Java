<%-- 
    Document   : new_post
    Created on : Mar 7, 2015, 3:52:39 PM
    Author     : Andrew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <form action="Logout" method="POST">
            <input type="submit" value="Log Out">
        </form>
        
        <h1>Hello, ${username}!</h1>
        <h3> <a href="ReadPosts"> View Posts </a> </h3>
        
        <form action="WritePost" method="POST">
            <h2> Write a new post: </h2>
            <table>
                <tr>
                    <td>
                        <h4> Title: </h4>
                    </td>
                    <td> 
                        <input type="text" name="postTitle" id="postTitle" /> <br />
                    </td>
                </tr>
                <tr>
                    <td>
                        <h4> Content: </h4>
                    </td>
                    <td>
                        <textarea name="postContent" id="postContent"> </textarea> <br />
                    </td>
                </tr>
            </table>
            <br />
            
            <!-- error checking for blank entries?-->
            <input type="submit" value="Submit Post"> <br />
        </form>
    </body>
</html>
