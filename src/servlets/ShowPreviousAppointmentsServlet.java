package servlets;

import mainpackage.Patient;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "servlets.ShowPreviousAppointmentsServlet")
public class ShowPreviousAppointmentsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        PrintWriter writer = response.getWriter();
        Patient patient = new Patient(username, request.getParameter("password"));
        ResultSet rs = patient.GetPatientInfos(username);
        request.setAttribute("username", username);

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
        writer.println("<h1 style = 'font-family:Calibri;'>"+username+"</h1>");
        writer.println("<h1>Your Previous Appointments are:</h1>");
        writer.println("<tr><td><b>Patient's Name</b></td>");
        writer.println("<td><b>Patient's Surname</b></td>");
        writer.println("<td><b>Date</b></td>");
        writer.println("<td><b>Starting Time</b></td>");
        writer.println("<td><b>Ending Time</b></td>");
        writer.println("<td><b>Doctor's Name</b></td>");
        writer.println("<td><b>Doctor's Surname</b></td>");
        writer.println("<td><b>Doctor's Speciality</b></td></tr>");
        try {
            while (rs.next()) {
                writer.println("<tr><td>" + rs.getString("name") + "</td>");
                writer.println("<td>" + rs.getString("surname") + "</td>");
                writer.println("<td>" + rs.getString("date") + "</td>");
                writer.println("<td>" + rs.getString("startslottime") + "</td>");
                writer.println("<td>" + rs.getString("endslottime") + "</td>");
                writer.println("<td>" + rs.getString(7) + "</td>");
                writer.println("<td>" + rs.getString(8) + "</td>");
                writer.println("<td>" + rs.getString(9) + "</td>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        writer.println("</table>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
