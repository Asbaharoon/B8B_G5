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
            System.out.println("            1.Login ");
            System.out.println("            2.Exit   ");
            System.out.print("       Please Enter a number:");
            int num = input2.nextInt();
            if (num >= 2) {
                System.exit(0);
            }

            User user1 = Login(input2);
            if (user1 == null) {
                System.out.println("The user password or Username is incorrect");
                System.out.println("Please try Again \n");

                //continue;
            } else {
                int num2 = 0;
                do {
                    System.out.println("\n       Welcome Back to Consultation \n");

                    num2 = Menu();
                    switch (num2) {
                        case 1:
                            //print all lawyers profile
                            for (int i = 0; i < list.size(); i++) {
                                System.out.println("\n--- " + (i + 1) + "---\n" + list.get(i).toString());
                                System.out.println("-----------------------------------");
                            }
                            System.out.print("Please enter your choice by number of the lawyer: ");
                            int n = input2.nextInt();
                            // if the entered number match lawyer appointment will display
                            if (Consultation.Displayschedule(n - 1, Lschedule)) {
                                System.out.println("\n----If it is suitable for you please write (Y) and if not  (N)-------");
                                String choise = input.nextLine();
                                //take customer choise and book consltation appoinment
                                Consultation.BookConsultation(choise, user1,Lschedule.get(n-1));
                            }
                            /* //Displayschedule(n - 1, Lschedule);
                            System.out.println("\n----If it is suitable for you please write (Y)  and if not  (N)-------");
                            String choise = input.nextLine();
                            //take customer choise and book consltation appoinment*/

                            break;
                        case 2:
                            //take the input rom user
                            System.out.print("Enter the Lawyer name to search pleese :");
                            String name = input.nextLine();
                            //call the serach method and save the result
                            Lawyer result = Customers.searchForLawyer(name, list);
                            if (result == null) {
                                //if the laweyer not found
                                System.out.println("There is no Lawyer with this name!");
                            } else {
                                //return the lawyer information if the laweyer founded
                                System.out.println(result.toString());
                            }
                            break;
                        case 3:
                            System.out.println("Your ended Consultation is:");
                            Rating.printEnded(user1.Customer_Consultation);
                            System.out.println("\n choice the Consultation:");
                            int nn = input2.nextInt();
                            System.out.print("How would you rate your experience out of 10? ");
                            double ra = input.nextDouble();
                            Rating.RatingCON(user1.Customer_Consultation.get(nn - 1), ra);
                            System.out.println("            Thank you :>");

                            break;
                        case 4:

                        /* if (user.getUserID()<20) {
                             Lawyer.ManageProfile(user.getUserID());

                        } */
                    }

                } while (num2 < 5);
            }
        }

    }
//this method will display the menu for the user and run choosen function

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("    1.  Make Consultation\n    2.  Search for Lawye"
                + "\n    3.  Rating Consultation Session\n    4.  Manage Lawyer Profile");
        System.out.println("--------------------------------------------------");
        System.out.print("Enter your choice (1 - 4) or any other number to terminate the program : ");
        int choice = sc.nextInt();
        return choice;
    }

    public static User Login(Scanner input2) {

        System.out.print("Enter Username: ");
        String username = input2.next();
        System.out.print("Enter Password: ");
        String password = input2.next();

        //search for the user and return it
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getuserPassword().equals(password) && user.get(i).getUserName().equals(username)) {
                // numUser = i;
                return user.get(i);
            }
        }

        return null;
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
            Lschedule.add(new Consultation(Lname, t, Day, Date, list));

        }
    }

    
    
    /*
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

    }*/
}
