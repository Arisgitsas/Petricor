import dbcon.Encryption;
import mainpackage.Registration;
import mainpackage.Customer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "Registers")
public class Registers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String name = (String) request.getParameter("name");
            String surname = (String) request.getParameter("surname");
            String age = (request.getParameter("age"));
            String sex = (String) request.getParameter("sex");
            String email = (String) request.getParameter("email");
            String password = (String) request.getParameter("password");
            Registration register1 = new Registration(name, surname, age, sex, email, password);
            Registration.RegisterCustomer(name, surname, age, sex, email, password);
            String hash = Encryption.makeHash(password);
            Registration.RegisterinSecurity(hash,email);
            if (Registration.RegisterCustomer(name, surname, age, sex, email, password) == 1) {
                out.print("<script>alert('Meeting arranged successfully!');window.history.back();</script>");
            } else {
                out.print("<script>alert('Error in meeting arrangement...');window.history.back();</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
