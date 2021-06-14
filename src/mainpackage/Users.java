package mainpackage;
import dbcon.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    public String username;
    public String password;
    public String name;
    public String surname;

    public static int Userscounter = 0;
    public boolean x1 = false;

    public Users(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public String getName() {
        return name;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public Users(String username, String password, String name, String surname) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        Userscounter++;

    }

    public int login() {
        Connection con;
        PreparedStatement pst1, pst2;

        ResultSet results1 = null, results2 = null;
        try {
            con = ConnectionProvider.getCon();
            pst1 = con.prepareStatement("select doctorappointment.patient.hashedpassword from doctorappointment.patient where doctorappointment.patient.username =?");
            pst1.setString(1, this.getUsername());
            results1 = pst1.executeQuery();

            while (results1.next()) {
                String userHash = results1.getString("hashedpassword"); //original hash
                String password = this.getPassword();
                String currentHash = dbcon.Encryption.makeHash(password);  //current hash

                if (currentHash.equals(userHash)) {
                    int status = 0;
                    pst1 = con.prepareStatement("select doctorappointment.patient.name from doctorappointment.admin inner join doctorappointment.patient on doctorappointment.admin.username = doctorappointment.patient.username where doctorappointment.patient.hashedpassword =? and doctorappointment.patient.username=?");
                    pst1.setString(1, userHash);
                    pst1.setString(2, username);
                    results1 = pst1.executeQuery();
                    pst2 = con.prepareStatement("select doctorappointment.doctor.name from doctorappointment.admin inner join doctorappointment.doctor on doctorappointment.admin.username = doctorappointment.doctor.username where doctorappointment.doctor.hashedpassword =? and doctorappointment.doctor.username=?");
                    pst2.setString(1, userHash);
                    pst2.setString(2, username);
                    results2 = pst2.executeQuery();

                    if(results1.next()){
                        status = 1;
                        name = results1.getString(1);
                    }
                    else if(results2.next()){
                        status = 2;
                        name = results2.getString(1);
                    }
                    else { status = 3;}
                    return status;
                }else {
                    con.close();
                    return 4;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}