package project_cpit251;

import java.util.ArrayList;
import java.util.Scanner;

public class Lawyer extends User {

    String Name = null;
    String Degree = null;
    String Specialty = null;
    double price;
    int numOfConsultations;
    String CasesType = null;
    double LawyerRate;

    public Lawyer(String name, String phone, String email, String degree, String specialty, String CasesType, double price, int numOfConsultations, int id) {
        super(phone, email);
        this.Name = name;
        this.Degree = degree;
        this.Specialty = specialty;
        this.CasesType = CasesType;
        this.price = price;
        this.numOfConsultations = numOfConsultations;
        this.UserID = id;
    }

    Lawyer() {
        
    }

   

    public String getName() {
        return Name;
    }

    public void setName(String i) {
        this.Name = i;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String i) {
        this.Degree = i;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String y) {
        this.Specialty = y;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double y) {
        this.price = y;
    }

    public int getNumOfConsultations() {
        return numOfConsultations;
    }

    public void setNumOfConsultations(int numOfConsultations) {
        this.numOfConsultations = numOfConsultations;
    }

    public String getCacesType() {
        return CasesType;
    }

    public void setCacesType(String y) {
        this.CasesType = y;

    }

    public double getLawyerRate() {
        return LawyerRate;
    }

    public void setLawyerRate(double LawyerRate) {
        this.LawyerRate = LawyerRate;
    }
    
    //Method to getLawyer by the id
    public static Lawyer getLawyer(String id, ArrayList<Lawyer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(Integer.toString(list.get(i).getUserID())))//if condition to return lawyer by id 
            {
                return list.get(i);
            }
        }
        return null;
    }
    //Method to call lawyer profile and edit it
    public static void ManageProfile(String id) {
        Scanner input = new Scanner(System.in);
        //Print statements
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tLawyer Profile");
        System.out.println("1- Edit Degree"
                + "\n2- Edit Phone Number"
                + "\n3- Edit Email ");
        System.out.println("--------------------------------------------------");
        System.out.print("Chose your selection (Notice: To return to the main menu, enter any other key): ");
        String select = input.nextLine();
        
        Lawyer result = getLawyer(id, Main.list);//Returned Lawyer
        switch (select) {
            case "1":
                //Case to change degree
                System.out.print("Enter your new Degree: ");
                String Degree = input.nextLine();
                result.setDegree(Degree);
                break;

            case "2":
                //Case to change phone
                System.out.print("Enter your new Phone Number: ");
                String Phone = input.nextLine();
                result.setPhone(Phone);
                break;

            case "3":
                //Case to change email
                System.out.print("Enter your new Email: ");
                String Email = input.nextLine();
                result.setUserEmail(Email);
                break;
        }
        System.out.println("--------------------------------------------------");
        System.out.println(result.toString());//show profile after change
        System.out.println("--------------------------------------------------");
    }

    @Override
    public String toString() {
        return "The Lawyer name is: " + this.Name + "\n" + "Phone Number: " + this.Phone + "\n" + "Email: " + this.UserEmail + "\n"
                + "The Degree is: " + this.Degree + "\n" + "The Specialty is: " + this.Specialty + "\n" + "The Case Type is : "
                + this.CasesType + "\n" + "The Consultations price is: " + this.price + "\n" + "The number Of Consultations is: "
                + this.numOfConsultations;
    }
     
}
