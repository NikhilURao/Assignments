<%-- 
    Document   : ReadFile
    Created on : 26 Apr, 2017, 2:38:42 PM
    Author     : Umesh
--%>

<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reading data from file</h1>
        <%
        int i;
        char c;
        try
        {
        FileInputStream f = new FileInputStream("D:\\nik.txt");
        while((i=f.read())!=-1)
        {
            c=(char)i;
            out.print(c);
        }
        }
        catch(Exception e)
                {
                System.out.println("e.getMessage");
                }
        
        %>
    </body>
</html>
