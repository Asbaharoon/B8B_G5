package project_cpit251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<User> user = new ArrayList<>();
    static ArrayList<Lawyer> list = new ArrayList<>();  //decler array list from lawyer class type
    static ArrayList<Consultation> Lschedule = new ArrayList<>();
    //static int numUser = -1;

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
            if (num == 2) {// exit
                System.exit(0);
            }
            if (num == 1) {
                System.out.print("Enter Username: ");
                String username = input2.next();
                System.out.print("Enter Password: ");
                String password = input2.next();
                User user1 = User.Login(username, password);
                //if user1=null that's means there is problem with login data
                if (user1 == null) {
                    System.out.println("The user password or Username is incorrect");
                    System.out.println("Please try Again \n");

                } //user not = null that's means user successfully login
                else {

                    int num2 = 0;
                    do {
                        System.out.println("\n       Welcome Back to Consultation \n");

                        //show the menu
                        num2 = Menu();
                        switch (num2) {
                            case 1:
                                if (user1.getUserID() < 20) {
                                    System.out.print("You can't do this because you're not a lawyer. ");
                                } else {

                                    //print all lawyers profile
                                    for (int i = 0; i < list.size(); i++) {
                                        System.out.println("\n--- " + (i + 1) + "---\n" + list.get(i).toString());
                                        System.out.println("-----------------------------------");
                                    }
                                    System.out.print("Please enter your choice by number of the lawyer: ");
                                    int n = input2.nextInt();
                                    // if the entered number match lawyer
                                    if (Consultation.Displayschedule(n - 1, Lschedule)) {
                                        //check if the appoinment suitable for the user
                                        System.out.println("\n----If it is suitable for you please write (Y) and if not  (N)-------");
                                        String choise = input.nextLine();
                                        //take customer choise and book consltation appoinment
                                        Consultation.BookConsultation(choise, user1, Lschedule.get(n - 1));
                                    }
                                }
                                break;
                            case 2:
                                //take the input rom user
                                System.out.print("\nEnter the Lawyer name to search pleese :");
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
                                if (user1.getUserID() < 20) {
                                    System.out.print("You can't do this because you're not a lawyer. ");
                                } else {
                                    
                                    if (user1.Customer_Consultation.isEmpty()) {
                                        System.out.println("\n    You do not have any Consultation!");
                                    }
                                    else{
                                    // call method printEnded to print user Consultations
                                    int n2 = Rating.printEnded(user1.Customer_Consultation);
                                    if (n2 <= 0) {
                                        System.out.println(" Ther is no Consultations with this number!");
                                    } else {
                                        //get the user rate for a Consultation
                                        System.out.print("How would you rate your experience out of 10? ");
                                        double ra = input2.nextDouble();
                                        //send the rate to method RatingCON to do the mathematical necessary operations
                                        Rating.RatingCON(user1.Customer_Consultation.get(n2 - 1), ra);
                                        System.out.println("            Thank you :>");
                                    }}
                                }
                                break;
                            case 4:
                                //check user if it ia a lawyer or not using id
                                if (user1.getUserID() < 20) {
                                    Lawyer.ManageProfile(Integer.toString(user1.getUserID()));
                                } else {
                                    System.out.print("You can't do this because you're not a lawyer. ");
                                }

                                break;
                        }
                    } while (num2 < 5);
                }

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
        System.out.print("Enter your choice (1 - 4) or any other number to back to login bage: ");
        int choice = sc.nextInt();
        return choice;
    }

    //this method will read all the files
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
            String id = input.nextLine();
            list.add(new Lawyer(Name, Phone, Email, Degree, Specialty, CasesTyep, Double.parseDouble(price), Integer.parseInt(num), Integer.parseInt(id)));

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
            String time = input3.nextLine();
            String Day = input3.nextLine();
            String Date = input3.nextLine();
            Lschedule.add(new Consultation(Lname, time, Day, Date, list));

        }
    }
}
