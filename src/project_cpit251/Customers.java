
package project_cpit251;

import java.util.ArrayList;

public class Customers extends User{

    //Method that takes the name enterd by user and th array list to serach by lawyer name 
    public static Lawyer searchForLawyer(String info, ArrayList<Lawyer> list ) {
        
        for(int i=0;i<list.size();i++){
            if(info.equalsIgnoreCase(list.get(i).getN()) || info.equals(Integer.toString(list.get(i).getUserID())))//check if the info is a name or id
                return list.get(i);
        }
        return null;
    }
    


  
 
}