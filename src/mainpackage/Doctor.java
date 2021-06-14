package mainpackage;

import java.util.Scanner;

public class Doctor extends Users {
    public String speciality;
    public int DoctorId;
    Scanner myObject = new Scanner(System.in);  // Create a Scanner object

    public Doctor(String username, String password, String name, String surname, int DoctorId, String speciality) throws IllegalArgumentException  {
        super(username, password, name, surname);
        this.speciality=speciality;
        this.DoctorId=DoctorId;
    }


    public void getSpecialty ()  throws IllegalArgumentException

    {
        System.out.println("Enter your Speciality:");
        String speciality = myObject.nextLine();  // Read user input
        System.out.println(speciality);
        this.speciality=speciality;
    }
    public void getDoctorId() throws IllegalArgumentException{
        try {
            System.out.println("Enter your Id:");
            int DoctorId = Integer.parseInt(myObject.nextLine());  // Read user input
            System.out.println(DoctorId);
            this.DoctorId = DoctorId;
            System.out.println("Your data are: Username:" +username +", Password: "+ password+", Name: "+ name+ ", Surname "+ surname+ ", Speciality: " +speciality+ ", Id:" + DoctorId);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception occurred. Id is integer");
        }
    }
    public void DocAvailability(){
        System.out.println("Enter the Day to see planned meetings:");
        String day = myObject.nextLine();  // Read user input
        System.out.println("For Day:" +day+ " you ve planned 3 meetings.");

    }
    public void DocSchedule(){
        }
    }

