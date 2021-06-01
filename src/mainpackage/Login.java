package mainpackage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;



public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        Customer customer1 = new Customer(email,pass);
        int status = customer1.login();
        String firstname = customer1.getFirstname();
        String surname = customer1.getSurname();
        int age = customer1.getAge();
        String sex = customer1.getSex();
        PrintWriter writer = response.getWriter();

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\" />");
        writer.println("<title>Login status</title>");
        writer.println("</head>");
        writer.println("<body>");

        if (status == 1){
            writer.println("<h1 style = 'font-family: Calibri; font-size: 18;' >Supervisor "+firstname+" "+surname+" logged in successfully.</h1>");
            doGet(request,response,status);

        }
        else if (status == 2){
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
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request,response);
        }

    }
}