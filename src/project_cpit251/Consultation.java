package project_cpit251;

import java.util.ArrayList;
import java.util.UUID;

public class Consultation {

    int ConID;
    String ConDate = null;
    String Descrption = null;
    Customers ConsultationAt;
    Lawyer ConsultationLawyer;
    String time;
    String Lname;
    String day;
    String date;

    Consultation(String desc, int ConID) {
        this.Descrption = desc;
        this.ConID = ConID;

        ConID++;
    }
    Consultation(String Lname, String t, String Day, String Date) {
        this.Lname = Lname;
        this.date = Date;
        this.day = Day;
        this.time = t;
    }


    Consultation() {
        
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

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String i) {
        this.Descrption = i;
    }

    public Customers getConsultationAt() {
        return ConsultationAt;
    }

    public void setConsultationAt(Customers y) {
        this.ConsultationAt = y;

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

    public Consultation choose(String name, ArrayList<Consultation> list) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equalsIgnoreCase(list.get(i).getLname())) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {

        return ".     Date        Time        Day\n" + "     " + this.date + "     " + this.time + "     " + this.day;
    }
}
