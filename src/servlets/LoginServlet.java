package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;

import mainpackage.*;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        Users user = new Users(username,pass);
        int status = user.login();
        PrintWriter writer = response.getWriter();

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\" />");
        writer.println("<title>Login status</title>");
        writer.println("</head>");
        writer.println("<body>");

        if (status == 1){
            writer.println("<h1 style = 'font-family: Calibri; font-size: 18;' >Supervisor "+username+" logged in successfully.</h1>");
            doGet(request,response,status);

        } else if (status == 2){
            writer.println("<h1 style = 'font-family: Calibri; font-size: 18;' >Student "+username+" logged in successfully.</h1>");
            doGet(request,response,status);
        }
        else if (status == 4){
            writer.println("<h1 style = 'font-family: Calibri; font-size: 18;' > ID - password missmatch.</h1>");
            writer.println("<form action = 'index.jsp'> <input type = 'submit' value = 'Return Home' style = 'font-family: Calibri; font-size: 14; background-color: #05125c; color: white; padding: 14px 20px; margin: 8px 0; border: none; cursor: pointer;'/>" + "</form>");

        } else{
            writer.println("<h1 style = 'font-family: Calibri; font-size: 18;' >User does not exist.</h1>");
            writer.println("<form action = 'index.jsp'> <input type = 'submit' value = 'Return Home' style = 'font-family: Calibri; font-size: 14; background-color: #05125c; color: white; padding: 14px 20px; margin: 8px 0; border: none; cursor: pointer;'/> "+ "</form> ");
        }
        writer.println("</body>");
        writer.println("</html");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,  javax.servlet.http.HttpServletResponse response, int status ) throws javax.servlet.ServletException, IOException {
        if (status == 1){
            RequestDispatcher rd = request.getRequestDispatcher("/PatientInfos.jsp");
            rd.forward(request,response);

        }
        else if (status == 2){
            RequestDispatcher rd = request.getRequestDispatcher("/maiiin.jsp");
            rd.forward(request,response);
        }
    }
}