<%-- 
    Document   : Register
    Created on : 26 Apr, 2017, 1:57:00 PM
    Author     : Umesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="http://localhost:8080/WebIndex/Processing">
        <h1> User Registration page</h1>
        <table>
            <tr>
                <td>
                    First Name
                </td>
                <td>
                    <input type ="text" name="fname">
                </td>
            </tr>
            <td>
                Last Name
            </td>
            <td>
                 <input type ="text" name="lname">
            </td>
            
        </table>
        <BR><input type="submit" value="SUBMIT">
        
        </form>       
    </body>
</html>
