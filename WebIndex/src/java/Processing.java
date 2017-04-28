/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Umesh
 */
@WebServlet(urlPatterns = {"/Processing"})
public class Processing extends HttpServlet {
 protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
 {
 res.setContentType("text/html");
 PrintWriter out = res.getWriter();
 
 String fname = req.getParameter("fname");
 String lname = req.getParameter("lname");
 
 String filename ="D:\\nik.txt";
 FileWriter fw = null;
 BufferedWriter bw = null;
 System.out.println(" ");
 String Details = "User data"+" "+fname+" "+lname;
 try
 {
  fw = new FileWriter(filename);
  bw = new BufferedWriter(fw);
  bw.write(Details);
  bw.close();
  fw.close();
  out.println("Data successfully saved");
 }
 catch(Exception e)
 {
 System.out.println(e.getMessage());
 }
 
 
 
 
 
        }
    }

    


