package project_cpit251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Project_CPIT251 {

public static void main(String[] args) throws FileNotFoundException {
        //read from file
        File file1 = new File("input.txt");

        if (!file1.exists()) {
            throw new FileNotFoundException("file is not exist");
        }
        Scanner input = new Scanner(file1);
        Scanner input2 = new Scanner(System.in);
        //decler array list from lawyer class type
        ArrayList<Lawyer> list = new ArrayList<>();
        //read the data from input file and stor
        while (input.hasNext()){
            String Name = input.nextLine();
            String Degree = input.nextLine();
            String Specialty = input.nextLine();
            String price = input.nextLine();
            String num = input.nextLine();
            String CasesTyep = input.nextLine();
            list.add(new Lawyer(Name, Degree, Specialty, CasesTyep, Double.parseDouble(price), Integer.parseInt(num)));

        }
        //object from coustmer class
        Customers object = new Customers();
        //take the input rom user
        System.out.print("Enter the Lawyer name to search pleese :");
        String name = input2.nextLine();
        //call the serach method and save the result
        Lawyer result = object.searchForLawyer(name, list);
        if (result == null) {
            //if the laweyer not found
            System.out.println("There is no Lawyer with this name!");
        } else {
            //return the lawyer information if the laweyer founded
            System.out.println(result.toString());
        }

    }

}






   
  



