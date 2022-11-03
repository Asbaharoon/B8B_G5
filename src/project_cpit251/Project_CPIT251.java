package project_cpit251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_CPIT251 {

    static ArrayList<User> user = new ArrayList<>();
    static ArrayList<Lawyer> list = new ArrayList<>();  //decler array list from lawyer class type
    static ArrayList<Consultation> Lschedule = new ArrayList<>();
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
                       //print all lawyers profile
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("\n"+list.get(i).toString());
                            System.out.println("-----------------------------------");
                        }
                        System.out.print("Please enter your choice of lawyer: ");
                        String Lname = input.nextLine();
                        // if the entered name match lawyer appointment will display
                        Displayschedule(Lname, list); 
                        System.out.println("\n----If it is suitable for you please write (Y)  and if not  (N)-------");
                        String choise = input.next();
                        //take customer choise and book consltation appoinment
                        BookConsultation(choise); 

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

        //read the data from input file and store it
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
        //read the data from input file and store it
        while (inputlogin.hasNext()) {
            user.add(new User(inputlogin.next(), inputlogin.next(), inputlogin.nextInt()));

        }
        //Read the data from lawyers appointment file and store it
        File file3 = new File("LawyersAppointments.txt");

        if (!file3.exists()) {
            throw new FileNotFoundException("file is not exist");
        }
        Scanner input3 = new Scanner(file3);
        while (input3.hasNext()) {
            String Lname = input3.nextLine();
            String t = input3.nextLine();
            String Day = input3.nextLine();
            String Date = input3.nextLine();
            Lschedule.add(new Consultation(Lname, t, Day, Date));
            

        }
    }
    // This method will display the available appointment
    public static void Displayschedule(String name, ArrayList list) {
        if (name == null) {
            System.out.println("\nthere is no laywer with this name");
        } else {

            System.out.println("       - this is  the available appointment  for the lawyer: " + name);
            Consultation l = new Consultation();
            Consultation d = l.choose(name, Lschedule);
            System.out.print(d.toString());

        }

    }
    //this method will book appointment for the customer
    public static void BookConsultation(String choise) {
        if (choise.equalsIgnoreCase("y")) {
            System.out.println("Your Consltation has been booked successfully "
      +  "\nPlease be in time");

        } else if (choise.equalsIgnoreCase("N")) {
            System.out.println("\nWe will inform you if there is any avalible time in the lawyer schedule\n Thank You");
        }

    }
}
