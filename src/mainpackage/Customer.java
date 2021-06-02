package mainpackage;
import dbcon.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    private String name;
    private String surname;
    private String age;
    private String sex;
    private String email;
    private String password;

    public Customer() {
        this.password = "NotSet";
        this.email = "NotSet";
    }
    public Customer( String email, String password) {

        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }


    public String getPassword() {
        return password;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int login(){
        Connection con;
        PreparedStatement pst1,pst2;

        ResultSet results1 = null, results2 = null;
        try{
            con = ConnectionProvider.getCon();
            pst1 = con.prepareStatement("select hash from security where email =?");
            pst1.setString(1,this.getEmail());
            results1 = pst1.executeQuery();

            while(results1.next()){
                String userHash = results1.getString("hash"); //original hash
                String password = this.getPassword();
                String currentHash = Encryption.makeHash(password);  //current hash

                if(currentHash.equals(userHash)){
                    int status = 0;
                    pst1 = con.prepareStatement("select security.email, customer.surname from security inner join customer on security.email = customer.email where security.hash =? and security.email=?");
                    pst1.setString(1,userHash);
                    pst1.setString(2,email);
                    results1 = pst1.executeQuery();
                    pst2 = con.prepareStatement("select security.email, customer.surname from security inner join customer on security.email = customer.email where security.hash =? and security.email=?");
                    pst2.setString(1,userHash);
                    pst2.setString(2,email);
                    results2 = pst2.executeQuery();
                    con.close();

                    if(results1.next()){
                        status = 1;
                        name = results1.getString(2);

                    }
                    else if (results2.next()){
                        status = 2;
                        name = results2.getString(2);
                    }
                    else { status = 3;}
                    return status;
                }else {
                    con.close();
                    return 4;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}