package mainpackage;
import dbcon.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registration extends Customer{
    String name;
    String surname;
    String age;
    String sex;
    String email;
    String password;

    public Registration(String name,String surname, String age, String sex, String email, String password){
        super();
        this.name = name;
        this.surname = surname;
        this.age=age;
        this.sex=sex;
        this.email=email;
        this.password=password;
    }
    public static int RegisterCustomer(String name,String surname,String age, String sex, String email, String password){
        Connection con;
        PreparedStatement stmt;
        con = ConnectionProvider.getCon();
        try{
            stmt = con.prepareStatement("insert into customer values(?,?,?,?,?,?) ;");
            stmt.setString(1, name);
            stmt.setString(2,surname);
            stmt.setString(3,age);
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
    public static int RegisterinSecurity(String hash,String email){
        Connection con;
        PreparedStatement stmt2;
        con = ConnectionProvider.getCon();
        try{
            stmt2 = con.prepareStatement("insert into security values(?,?) ;");
            stmt2.setString(1, hash);
            stmt2.setString(2,email);
            stmt2.executeUpdate();
            System.out.println("Registration in security is Done.");
            con.close();
            return 1;
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Registration in security Failed.");
            return 0;
        }
    }
}
