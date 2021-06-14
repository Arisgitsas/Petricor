package mainpackage;
import dbcon.ConnectionProvider;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Patient extends Users{
    public String meetDate;
    public String Day;
    public String time;
    public int MeetingId;
    public static String amka;
    Scanner obj4 = new Scanner(System.in);


    public Patient(String username, String password, String name, String surname, String amka) throws IllegalArgumentException  {
        super(username,password,name,surname);
        this.amka=amka;
    }

    public Patient(String username, String password) {
        super(username,password);
    }

    public String getMeetDate() {
        return meetDate;
    }
    public void setName(String newmeetDate) {
        this.meetDate=newmeetDate;
    }
    public String getDay() {
        return Day;
    }
    public void setDay(String newDay) {
        this.Day=newDay;
    }
    public String getTime() {
        return time;
    }
    public void setSurname(String newtime) {
        this.time=newtime;
    }
    public Integer getMeetingId() {
        return MeetingId;
    }
    public void setPassword(Integer newMeetingId) {
        this.MeetingId=newMeetingId;
    }


    public void get_set() throws IllegalArgumentException {
        Scanner obj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your AMKA");

        String amka = obj3.nextLine();  // Read user input
        System.out.println("Your AMKA is: " + amka);  // Output user input
        this.amka = amka;
        System.out.println("Your data are: Username:" +username +", Password: "+ password+", Name: "+ name+ ", Surname "+ surname+ ", AMKA: " +amka);

    }

    public void Registration() throws IllegalArgumentException {
        if (((username)=="")||(password=="")){
            System.out.println("Registration Time! Enter the username you want:");
            String username = obj4.nextLine(); // Read user input
            System.out.println("Your name is: " + username);  // Output user input

            System.out.println("Enter the password you want:");
            String password = obj4.nextLine(); // Read user input
            System.out.println("Your pass is: " + password);  // Output user input
            this.username=username;
            this.password=password;
            System.out.println("Your data are: Username:" +name +", Password: "+ password);

        }

    }
    public void AvailableMeetings() {
        meetDate = "12/02/2021";
        Day = "Thursday";
        time = "13:30";
        MeetingId = 0;
        System.out.println("Enter the Id of the Doctor you search for:");
        String for_id = obj4.nextLine(); // Read user input
        System.out.println("Mr/Mrs "+username+" Available Meetings with the Doctor with Id: "+for_id+ " is " +meetDate+" "+Day+" "+time);
    }
    public void ArrangeMeetingSpec(){
        meetDate = "12/02/2021";
        Day = "Thursday";
        time = "13:30";
        MeetingId = 0;
        System.out.println("Enter the speciality of the Doctor you search for:");
        String for_spec = obj4.nextLine(); // Read user input
        System.out.println("Available Meetings with "+for_spec+ " Doctors are: " +meetDate+" "+Day+" "+time);
    }

    public void SearchMeeting(){
        Scanner objmeet = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your AMKA to see your scheduled meetings");

        String amka = objmeet.nextLine();  // Read user input
        System.out.println("Your Scheduled Meetings are: bla bla bla");  // Output user input
        this.MeetingId = MeetingId;

    }
    public void PatientHistory(){
        Scanner objamka = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your AMKA to find your patient history:");

        String amka = objamka.nextLine();  // Read user input
        System.out.println("Your previous appointments are: bla bla bla");  // Output user input
        this.amka = amka;

    }
    public void Infos_From_Txt()  {
        try {
            File file = new File("C:\\Users\\xarat\\Documents\\Σχολή\\4ο Εξάμηνο\\Προγραμματισμός στο Διαδίκτυο και τον Παγκόσμιο Ιστό\\patienttext.txt");
            Scanner scan = new Scanner(file);
            String fileContent = scan.nextLine();
            String[] arguments = fileContent.split(" ");
            this.username = arguments[0];
            this.password = arguments[1];
            this.name = arguments[2];
            this.surname = arguments[3];
            this.amka = arguments[4];
            System.out.println("Data of Patient in the Text File Are: Username:" + username + ", Password:" + password + ", Name:" + name + ", Surname:" + surname);
        }
        catch (IOException e) {
            System.out.println("File does not exist");
        }
    }
    public static ResultSet GetPatientInfos(String username){
        ResultSet resultSet;
        Connection con;
        PreparedStatement stmt;
        con = ConnectionProvider.getCon();
        try{
            stmt = con.prepareStatement("select doctorappointment.patient.name,doctorappointment.patient.surname,doctorappointment.patient.patientamka,\n" +
                    "doctorappointment.appointment.date, doctorappointment.appointment.startslottime,\n" +
                    "doctorappointment.appointment.endslottime, doctorappointment.doctor.name,doctorappointment.doctor.surname,\n" +
                    "       doctorappointment.doctor.specialty\n" +
                    "from ((doctorappointment.patient inner join doctorappointment.appointment\n" +
                    "on doctorappointment.patient.patientamka = doctorappointment.appointment.patient_patientamka)\n" +
                    "    inner join doctorappointment.doctor\n" +
                    "        on doctorappointment.doctor.doctoramka = doctorappointment.appointment.doctor_doctoramka)\n" +
                    "    where doctorappointment.patient.username =?");
            stmt.setString(1,username);
            resultSet = stmt.executeQuery();
            con.close();
            return resultSet;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}