package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "myServlet", urlPatterns = {"/myServlet"})
public class myServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<HTML><HEAD><TITLE> MY PAGE </TITLE> </HEAD></HTML");
    out.println("<BODY><P><h1> This is my first paragraph</h1></P> </BODY>");
}    
}

    


