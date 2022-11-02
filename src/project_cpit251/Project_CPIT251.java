package project_cpit251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_CPIT251 {

    static ArrayList<User> user = new ArrayList<>();
    static ArrayList<Lawyer> list = new ArrayList<>();  //decler array list from lawyer class type
    static int numUser = -1;

    public static void main(String[] args) throws FileNotFoundException {

        Readfile(); //read from file
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------\n");
            System.out.println("        Welcome to Consultation \n");
            System.out.println("--------------------------------------");
            System.out.print("Enter Username: ");
            String username = input2.next();
            System.out.print("Enter Password: ");
            String password = input2.next();
            boolean checking = Login(username, password);
            if (checking == false) {
                System.out.println("The user password or Username is incorrect");
                System.out.println("Please try Again \n");

                //continue;
            } else {
                System.out.println("       Welcome Back to Consultation \n");

                //object from coustmer class
                Customers object = new Customers();
                //take the input rom user
                System.out.print("Enter the Lawyer name to search pleese :");
                String name = input.nextLine();
                //call the serach method and save the result
                Lawyer result = object.searchForLawyer(name, list);
                if (result == null) {
                    //if the laweyer not found
                    System.out.println("There is no Lawyer with this name!");
                } else {
                    //return the lawyer information if the laweyer founded
                    System.out.println(result.toString());
                }
                switch (Menu()) {
                    case 1:
                        //Create a customer object to to start consltation request from the customer
                        Customers consultSession = new Customers();
                        System.out.print("Please enter yourcase type? ");
                        String casetype = input2.nextLine();
                        // the method will check if the customer case type match the lawyer case types
                        String cases = consultSession.MakeConsultation(casetype, name, list);
                        if (cases == null) {
                            // if not, the system will reject customer request 
                            System.out.println("This type of cases is not this lawyer specialty!");
                            System.out.println("We are sorry your Consultation request has been rejected");

                        } else {
                            // if it matched, the customer will send a brief description for his case
                            System.out.print("Please enter a brief description about your case: ");
                            String desc = input2.nextLine();
                            // the customer description will be saved as an object and get an ID and sent to the lawyer
                            Consultation Cdesc = new Consultation(desc);

                            System.out.println("Your case description has been sent to the laywer\n We will inform you about the session details soon\n Be patient ♡");

                        }
                        break;
                    case 2:
                        if (name.equalsIgnoreCase(result.getN())) {
                            result.ManageProfile(name);

                        }

                        break;
                    case 3:
                        break;
                    default:
                        System.exit(0);

                }

            }
        }

    }
//this method will display the menu for the user and run choosen function

    public static int Menu() {

        System.out.println("--------------------------------------------------");
        System.out.println("    1.  Make Consultation\n    2.  Manage"
                + " Lawyer Profile\n    3.  Rating Consultation Session");
        System.out.println("--------------------------------------------------");
        System.out.print("Enter your choice (1 - 3) or any other number to terminate the program : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    public static boolean Login(String username, String password) {

        //search for the user and return it
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getuserPassword().equals(password) && user.get(i).getUserName().equals(username)) {
                numUser = i;
                return true;
            }
        }
        return false;
    }

    public static void Readfile() throws FileNotFoundException {
        File file1 = new File("input.txt");

        if (!file1.exists()) {
            throw new FileNotFoundException("file is not exist");
        }
        Scanner input = new Scanner(file1);

        //read the data from input file and stor
        while (input.hasNext()) {
            String Name = input.nextLine();
            String Phone = input.nextLine();
            String Email = input.nextLine();
            String Degree = input.nextLine();
            String Specialty = input.nextLine();
            String price = input.nextLine();
            String num = input.nextLine();
            String CasesTyep = input.nextLine();
            list.add(new Lawyer(Name, Phone, Email, Degree, Specialty, CasesTyep, Double.parseDouble(price), Integer.parseInt(num)));

        }

        File file2 = new File("login.txt");
        if (!file2.exists()) {
            throw new FileNotFoundException("file is not exist");
        }
        Scanner inputlogin = new Scanner(file2);
        //read the data from input file and stor
        while (inputlogin.hasNext()) {
            user.add(new User(inputlogin.next(), inputlogin.next(), inputlogin.nextInt()));

        }
    }

}
