package mainpackage;
import java.util.Scanner;

public class CreateUsers {
    public static String usernamep;
    public static String passwordp;
    public static String namep;
    public static String surnamep;
    public static int DoctorId;
    public static String speciality;
    public static String amka;
    public String doc_or_pat;
    public static String dateday;
    public static String time;


    public String getUsernamep() {
        return usernamep;
    }

    public void setUsernamep(String newUsernamep) {
        this.usernamep = newUsernamep;
    }

    public String getPasswordp() {
        return passwordp;
    }

    public void setPasswordp(String newPasswordp) {
        this.passwordp = newPasswordp;
    }

    public String getdoc() {
        return doc_or_pat;
    }

    public void setdoc(String newdoc_or_pat) {
        this.doc_or_pat = newdoc_or_pat;
    }

    public CreateUsers(String username, String password) {

    }
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("If you are a Doctor, type d. If you are a Patient, type p. If you are an Admin, type a");
        String doc_or_pat = myObj.nextLine();
        if (doc_or_pat.equals("d")) {
            System.out.println("Enter Username");
            String usernamep = myObj.nextLine();  // Read user input
            System.out.println("Enter Password");
            String passwordp = myObj.nextLine();  // Read user input
            System.out.println("Enter Name");
            namep = myObj.nextLine();  // Read user input
            System.out.println("Enter Surname");
            surnamep = myObj.nextLine();  // Read user input
            Doctor Doctor1 = new Doctor(usernamep, passwordp, namep, surnamep, DoctorId, speciality);
            System.out.println("Time to login....");
            Doctor1.login();
            Doctor1.getSpecialty();
            Doctor1.getDoctorId();
            System.out.println("If you want to see your appointments type y");
            String answer = myObj.nextLine();  // Read user input
            if(answer.equals("y")){
                Doctor1.DocAvailability();
            }
            Doctor1.DocSchedule();
            System.out.println("Press l to logout");
            String answer2 = myObj.nextLine();  // Read user input
            if(answer.equals("l")){
               // Doctor1.logout();
            }

        } else if (doc_or_pat.equals("p")) {
            System.out.println("Enter Username:");
            usernamep = myObj.nextLine();  // Read user input
            System.out.println("Enter Password:");
            passwordp = myObj.nextLine();  // Read user input
            System.out.println("Enter Name:");
            namep = myObj.nextLine();  // Read user input
            System.out.println("Enter Surname:");
            surnamep = myObj.nextLine();  // Read user input
            Patient Patient1 = new Patient(usernamep, passwordp, namep, surnamep, amka);
            Patient1.Registration();
            Patient1.login();
            Patient1.get_set();
            System.out.println("Is it emergency? (If yes, type y. Else tap whatever you want)");
            String emerg = myObj.nextLine();  // Read user input
            if(emerg.equals("y")){
                Appointment Apppointment1 = new Appointment(usernamep, passwordp, namep, surnamep,dateday,time);
                Apppointment1.GetMeeting();            }
            else {
                System.out.println("Do you want a specific doctor? (If yes, type y)");
                String answer = myObj.nextLine();  // Read user input
                if (answer.equals("y")) {
                    Patient1.AvailableMeetings();
                }
                System.out.println("Do you want to insert patient info from text? (If yes, type y)");
                String answer1 = myObj.nextLine();  // Read user input
                if (answer1.equals("y")) {
                    Patient1.Infos_From_Txt();
                }
                System.out.println("Do you look for specific speciality? (If yes, type y)");
                String answer2 = myObj.nextLine();  // Read user input
                if (answer2.equals("y")) {
                    Patient1.ArrangeMeetingSpec();
                }
            }
                Patient1.SearchMeeting();
                Patient1.PatientHistory();
                System.out.println("Press l to logout");
                String answer3 = myObj.nextLine();  // Read user input
                if (answer3.equals("l")) {
                   // Patient1.logout();
                }


        } else if (doc_or_pat.equals("a")) {
            System.out.println("Enter Username:");
            usernamep = myObj.nextLine();  // Read user input
            System.out.println("Enter Password:");
            passwordp = myObj.nextLine();  // Read user input
            System.out.println("Enter Name:");
            namep = myObj.nextLine();  // Read user input
            System.out.println("Enter Surname:");
            surnamep = myObj.nextLine();  // Read user input
            Admin Admin1 = new Admin(usernamep, passwordp, namep, surnamep);
            Admin1.login();
            Admin1.InsertDoc();
            System.out.println("Press l to logout");
            String answer3 = myObj.nextLine();  // Read user input
            if (answer3.equals("l")) {
             //   Admin1.logout();
            }
        }
            myObj.close();

        }
    }




