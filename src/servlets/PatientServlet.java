package servlets;

import mainpackage.Patient;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
@WebServlet(name = "servlets.PatientServlet")
public class PatientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        PrintWriter writer = response.getWriter();
        Patient patient = new Patient(username, request.getParameter("password"));
        ResultSet rs = patient.GetPatientInfos(username);
        ResultSet rs1 = patient.GetPatientInfos(username);
        request.setAttribute("username", username);
        doGet(request,response);

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\" />");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
        writer.println("<title>Appointments-Website for Patient</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div class =\"w3-container\">");
        writer.println("<table class = \"w3-table w3-bordered\">");
        writer.println("<h1 name='username' id = 'username' style = 'font-family:Calibri;' hiden "+ username + "</h1>");
        writer.println("<h1 style = 'font-family:Calibri;'>Welcome " + username + ", your Personal Information are:</h1>");


        writer.println("<tr><td><b>Name</b></td>");
        writer.println("<td><b>Surname</b></td>");
        writer.println("<td><b>AMKA</b></td>");
        writer.println("<td><b>Username</b></td></tr>");
        try {
            while (rs1.next()) {
                writer.println("<tr><td>" + rs1.getString("name") + "</td>");
                writer.println("<td>" + rs1.getString("surname") + "</td>");
                writer.println("<td>" + rs1.getString("patientamka") + "</td>");
                writer.println("<td>" + username + "</td>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        writer.println("</table>");
        writer.println("<form method = 'post' action = 'MyAppointments.jsp'>" +
                "<input type='hidden'name= 'username' value ="+ username+ ">" +
                "<input type=\"submit\" value=\"Show My Previous Appointments\" class = 'button'></form>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");

    }
        protected void doGet (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
        response,int status ) throws javax.servlet.ServletException, IOException
        {

        }
    }