package mainpackage;

import java.util.Scanner;

public class Admin extends Users{
    int DoctorId;
    String speciality;
    public Admin(String username, String password, String name, String surname) throws IllegalArgumentException  {
        super(username, password, name, surname);
    }
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public void InsertDoc() throws IllegalArgumentException{
            System.out.println("Insert Doctor");
            System.out.println("Enter Doctor's Username");
            String usernamed = myObj.nextLine();  // Read user input
            System.out.println("Enter Doctor's Password");
            String passwordd = myObj.nextLine();  // Read user input
            System.out.println("Enter Doctor's Name");
            String named = myObj.nextLine();  // Read user input
            System.out.println("Enter Doctor's Surname");
            String surnamed = myObj.nextLine();  // Read user input
            System.out.println("Enter Doctor's DoctorId");
            int DoctorId = Integer.parseInt(myObj.nextLine());  // Read user input
            System.out.println("Enter Doctor's Speciality");
            String speciality = myObj.nextLine();  // Read user input
            this.username=usernamed;
            this.password=passwordd;
            this.name=named;
            this.surname=surnamed;
            this.DoctorId=DoctorId;
            this.speciality=speciality;
            Doctor Doctor2 = new Doctor(username,password,name,surname, DoctorId,speciality);
            System.out.println("You insterted succesfully the doctor with Username:" +username +", Password: "+ password+", Name: "+ name+ ", Surname "+ surname+ ", Speciality: " +speciality+ ", Id:" + DoctorId);

    }

        public void ManageMeetings(){
        }

}
