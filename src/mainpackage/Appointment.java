package mainpackage;

import java.util.Scanner;

public class Appointment extends Patient{
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    String time;
    String dateday;
    public Appointment(String username, String password, String name, String surname, String dateday, String time)  throws IllegalArgumentException {
        super(username, password, name, surname, amka);
    }
    public void GetMeeting() {
        System.out.println("Enter the Day you want the Meeting to be");
        String date1 = myObj.nextLine();  // Read user input
        System.out.println("Enter the Time you want the Meeting to be");
        String time1 = myObj.nextLine();  // Read user input
        this.time = time1;
        this.dateday = date1;
        System.out.println("Ok your appointment is arranged for " + dateday+ ", "+time);

    }

    private class App extends Doctor{
        public App(String username, String password, String name, String surname, int DoctorId, String speciality) {
            super(username, password, name, surname, DoctorId, speciality);
        }

        }

    }

