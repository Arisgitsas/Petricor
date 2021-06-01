package mainpackage;
import dbcon.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    private String id ;
    private String firstname;
    private String surname;
    private int age;
    private String sex;
    private String email;
    private String password;

    public Customer() {
        this.password = "NotSet";
        this.id = "NotSet";
    }
    public Customer( String id, String password) {

        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
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
            pst1 = con.prepareStatement("select hash from users where id =?");
            pst1.setString(1,this.getId());
            results1 = pst1.executeQuery();

            while(results1.next()){
                String userHash = results1.getString("hash"); //original hash
                String password = this.getPassword();
                String currentHash = Encryption.makeHash(password);  //current hash

                if(currentHash.equals(userHash)){
                    int status = 0;
                    pst1 = con.prepareStatement("select security.id, customer.surname from security inner join customer on security.id = customer.id where security.hash =? and security.id=?");
                    pst1.setString(1,userHash);
                    pst1.setString(2,id);
                    results1 = pst1.executeQuery();
                    pst2 = con.prepareStatement("select security.id, customer.surname from security inner join customer on security.id = customer.id where security.hash =? and security.id=?");
                    pst2.setString(1,userHash);
                    pst2.setString(2,id);
                    results2 = pst2.executeQuery();
                    con.close();

                    if(results1.next()){
                        status = 1;
                        firstname = results1.getString(2);

                    }
                    else if (results2.next()){
                        status = 2;
                        firstname = results2.getString(2);
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