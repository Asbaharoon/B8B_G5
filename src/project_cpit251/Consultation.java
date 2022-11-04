package project_cpit251;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Consultation {

    int ConID;
    String ConDate = null;
    String Descrption = null;
    //  Customers ConsultationAt;
    User custom;
    Lawyer ConsultationLawyer;
    String time;
    String Lname;
    String day;
    String date;
    String available;

    /*Consultation(String desc, int ConID) {
        this.Descrption = desc;
        this.ConID = ConID;

        ConID++;
    }*/
 /* Consultation(String Lname, String time, String Day, String Date) {
        this.Lname = Lname;
        this.date = Date;
        this.day = Day;
        this.time = time;
    }*/
    Consultation(String Lname, String time, String Day, String Date, ArrayList<Lawyer> list) {
        //this.Lname = Lname;
        this.date = Date;
        this.day = Day;
        this.time = time;
        this.ConsultationLawyer=Customers.searchForLawyer(Lname, list);
        this.available="available";
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getConID() {
        return ConID;
    }

    public void setConID(int i) {
        this.ConID = i;
    }

    public String getConDate() {
        return ConDate;
    }

    public void setConDate(String i) {
        this.ConDate = i;
    }
    public void setAvailable(String available) {
        this.available = available;
    }

    public String getAvailable() {
        return available;
    }
    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String i) {
        this.Descrption = i;
    }

    public User getCustomer() {
        return custom;
    }

    public void setCustomer(User us) {
        this.custom = us;

    }

    public Lawyer getConsultationLawyer() {
        return ConsultationLawyer;
    }

    public void setConsultationLawyer(Lawyer y) {
        this.ConsultationLawyer = y;

    }

    public void setConsltation() {
        System.out.println("Your Consltation" + ConID + " has been booked successfully ");
        System.out.println("Please be in time");
    }

   /* public Consultation choose(String name, ArrayList<Consultation> list) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equalsIgnoreCase(list.get(i).getLname())) {
                return list.get(i);
            }
        }
        return null;
    }*/
        // This method will display the available appointment
    public static boolean Displayschedule(int n, ArrayList<Consultation> Lschedule) {
        Scanner sc = new Scanner(System.in);
        if (n < Lschedule.size()) {
            if (Lschedule.get(n).getAvailable().equals("available")) {
                System.out.println("       - this is  the available appointment  for the lawyer: "
                        + Lschedule.get(n).getConsultationLawyer().getN());
                System.out.println(Lschedule.get(n).toString());
                return true;
            } else {
                System.out.println("\nWe will inform you if there is any avalible time in the lawyer schedule\n Thank You");
                return false;
            }
        } else {
            System.out.println("\nthere is no laywer with this number");
            return false;

        }

    }
        //this method will book appointment for the customer
    public static void BookConsultation(String choise, User us,Consultation con) {
        Scanner sc = new Scanner(System.in);
        if (choise.equalsIgnoreCase("y")) {
            System.out.print("\n  Please enter a brief description about your case: ");
            String desc = sc.nextLine();
             con.setAvailable("not availbale");
             con.setDescrption(desc);
             con.setCustomer(us);
   
            //add the consultion to customer profile
            con.getCustomer().AddConsultation(con);
            //increment the number of Consultation og the lawyer
            con.getConsultationLawyer().setNumOfConsultations(con.getConsultationLawyer().getNumOfConsultations() + 1);
            System.out.println("Your Consltation has been booked successfully "
                    + "\nPlease be in time");

        } else {
            System.out.println("\nWe are sorry for not having an suitable appointment with you");
        }

    }

    @Override
    public String toString() {

        return "     Date        Time        Day        Available\n" +
                "     " + this.date + "     " + this.time + "     " + this.day+"        "+this.available;
    }
}
