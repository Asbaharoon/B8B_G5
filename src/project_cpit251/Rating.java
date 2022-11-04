
package project_cpit251;

import java.util.*;

public class Rating {

   public static void RatingCON(Consultation consultation,double rate){
       Lawyer law=consultation.getConsultationLawyer();
       rate=rate+law.getLawyerRate()/law.getNumOfConsultations();
        consultation.getConsultationLawyer().setLawyerRate(rate);
    }
      public static void printEnded(ArrayList<Consultation> consultation){
          for(int i=0;i<consultation.size();i++){
              Consultation con=consultation.get(i);
              System.out.println("   "+(i+1)+"-   Consultation ID: "+con.getConID()+
                      "\n   Consultation Date: "+con.getConDate()+
                      "\n   Case Tyep: "+con.getConsultationLawyer().getC()+
                      "\n   Lawyer name: "+ con.getConsultationLawyer().getN()+"\n");
          }
        
    }
    
}
