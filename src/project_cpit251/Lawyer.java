package project_cpit251;

import java.util.Scanner;

public class Lawyer extends User {

    String Name = null;
    String Degree = null;
    String Specialty = null;
    double price;
    int numOfConsultations;
    String CasesTyep = null;

    Scanner input = new Scanner(System.in);

    public Lawyer() {

    }

    public Lawyer(String name, String phone, String email, String degree, String specialty, String casesTyep, double price, int numOfConsultations) {
        this.Name = name;
        this.Phone = phone;
        this.UserEmail = email;
        this.Degree = degree;
        this.Specialty = specialty;
        this.CasesTyep = casesTyep;
        this.price = price;
        this.numOfConsultations = numOfConsultations;
    }

    public String getN() {
        return Name;
    }

    public void setN(String i) {
        this.Name = i;
    }

    public String getD() {
        return Degree;
    }

    public void setD(String i) {
        this.Degree = i;
    }

    public String getS() {
        return Specialty;
    }

    public void setS(String y) {
        this.Specialty = y;

    }

    public double getP() {
        return price;
    }

    public void setP(double y) {
        this.price = y;
    }

    public int getNumOfConsultations() {
        return numOfConsultations;
    }

    public void setNumOfConsultations(int numOfConsultations) {
        this.numOfConsultations = numOfConsultations;
    }

    public String getC() {
        return CasesTyep;
    }

    public void setC(String y) {
        this.CasesTyep = y;

    }

    public void ManageProfile(String info) {
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tLawyer Profile");
        System.out.println("1- Edit Degree"
                + "\n2- Edit Phone Number"
                + "\n3- Edit Email ");
        System.out.println("--------------------------------------------------");
        System.out.print("Chose your selection: ");
        String select = input.nextLine();

        Lawyer result = Customers.searchForLawyer(info, Project_CPIT251.list);
        switch (select) {
            case "1":

                System.out.print("Enter your new Degree: ");
                String Degree = input.nextLine();
                result.setD(Degree);

                break;

            case "2":
                System.out.print("Enter your new Phone Number: ");
                String Phone = input.nextLine();
                result.setPhone(Phone);

                break;

            case "3":
                System.out.print("Enter your new Email: ");
                String Email = input.nextLine();
                result.setUserEmail(Email);
                break;

            default:
                System.out.println("Wrong selection");
        }
        System.out.println("--------------------------------------------------");

        System.out.println(result.toString());
    }

    

    @Override
    public String toString() {
        return "The Lawyer name is: " + this.Name + "\n" + "Phone Number: " + this.Phone + "\n" + "Email: " + this.UserEmail + "\n"
                + "The Degree is: " + this.Degree + "\n" + "The Specialty is: " + this.Specialty + "\n" + "The Case Type is : "
                + this.CasesTyep + "\n" + "The Consultations price is: " + this.price + "\n" + "The number Of Consultations is: "
                + this.numOfConsultations;
    }

}
