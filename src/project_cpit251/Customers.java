
package project_cpit251;

import java.util.ArrayList;

public class Customers extends User{

    //Method that takes the name enterd by user and th array list to serach by lawyer name 
    public static Lawyer searchForLawyer(String name, ArrayList<Lawyer> list ) {
        
        for(int i=0;i<list.size();i++){
            if(name.equalsIgnoreCase(list.get(i).getN()))
                return list.get(i);
        }
        return null;
    }
    public String MakeConsultation(String CaseType, String name, ArrayList<Lawyer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (name.equalsIgnoreCase(list.get(i).getN())) {
                return list.get(i).getC();
            }
        }
        return null;
    }


  
 
}