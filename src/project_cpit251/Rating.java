package project_cpit251;

import java.util.*;

public class Rating {

    //this method will print all user consultation  mathematical necessary operations 
    public static double RatingCON(Consultation consultation, double rate) {
        Lawyer law = consultation.getConsultationLawyer();
        //update the number of consultations of the lawyer
        law.setNumOfConsultations(law.getNumOfConsultations()+1);
        rate = rate + law.getLawyerRate();
        return rate;
    }
    //this method will print all user consultation

    public static int printEnded(ArrayList<Consultation> consultation) {

        Scanner input = new Scanner(System.in);
        //print all user Consultation and ask hem to choice one to rate
        System.out.println("\nYour ended Consultations is:");
        for (int i = 0; i < consultation.size(); i++) {
            Consultation con = consultation.get(i);
            System.out.println("   " + (i + 1) + "-   Consultation Date: "
                    + con.getDate() + " " + con.getDay() + " " + con.getTime()
                    + "\n   Case Tyep: " + con.getConsultationLawyer().getCacesType()
                    + "\n   Lawyer name: " + con.getConsultationLawyer().getName() + "\n");
        }
        System.out.print("\n choice the Consultation:");
        int n2 = input.nextInt();
        if (n2 - 1 < consultation.size()) {
            return n2;
        } else {
            return -1;
        }

    }

}
