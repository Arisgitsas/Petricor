package dbcon;
import mainpackage.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDAO {
    static Connection con;
    static PreparedStatement stmt;

    public static int RegisterCustomer(String name,String surname,int age, String sex, String email, String password){
        Connection con;
        PreparedStatement stmt;
        con = ConnectionProvider.getCon();
        try{
            stmt = con.prepareStatement("insert into customer values(?,?,?,?,?,?) ;");
            stmt.setString(1, name);
            stmt.setString(2,surname);
            stmt.setInt(3,age);
            stmt.setString(4,sex);
            stmt.setString(5,email);
            stmt.setString(6,password);

            stmt.executeUpdate();
            System.out.println("Registration is Done.");
            con.close();
            return 1;
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Registration Failed.");
            return 0;
        }
    }

    }


