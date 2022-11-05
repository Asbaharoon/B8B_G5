/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_cpit251;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author asus
 */
public class ConsultationTest {
    
    public ConsultationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTime method, of class Consultation.
     */
    @Test
    
    public void testGetTime() {
        System.out.println("getTime");
        Consultation instance = new Consultation("ahmed alghamdi","9:00am","Monday","09/06");
        String expResult = "9:00am";
        String result = instance.getTime();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTime method, of class Consultation.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "9:00am";
        Consultation instance = new Consultation();
        instance.setTime(time);
        String expResult = "9:00am";
        String result = instance.getTime();
        assertEquals(expResult, result);
       
       
    }

    /**
     * Test of getLname method, of class Consultation.
     */
    @Test
    public void testGetLname() {
        System.out.println("getLname");
        Consultation instance = new Consultation("ahmed alghamdi","9:00am","Monday","09/06");
        String expResult = "ahmed alghamdi";
        String result = instance.getLname();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLname method, of class Consultation.
     */
    @Test
    public void testSetLname() {
        System.out.println("setLname");
        String Lname = "Ahmed Alghamdi";
        Consultation instance = new Consultation();
        instance.setLname(Lname);
        String expResult = "Ahmed Alghamdi";
        String result = instance.getLname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class Consultation.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Consultation instance = new Consultation("ahmed alghamdi","9:00am","Monday","09/06");
        String expResult = "Monday";
        String result = instance.getDay();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDay method, of class Consultation.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        String day = "Monday";
        Consultation instance = new Consultation();
        instance.setDay(day);
        String expResult = "Monday";
        String result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class Consultation.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Consultation instance = new Consultation("ahmed alghamdi","9:00am","Monday","09/06");
        String expResult = "09/06";
        String result = instance.getDate();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDate method, of class Consultation.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "06/09";
        Consultation instance = new Consultation();
        instance.setDate(date);
        String expResult = "06/09";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConID method, of class Consultation.
     */
    @Test
    public void testGetConID() {
        System.out.println("getConID");
        Consultation instance = new Consultation();
       instance.setConID(6);
        int expResult =  6;
        int result = instance.getConID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setConID method, of class Consultation.
     */
    @Test
    public void testSetConID() {
        System.out.println("setConID");
        int i = 12;
        Consultation instance = new Consultation();
        instance.setConID(i);
        int expResult =12;
        int result = instance.getConID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getConDate method, of class Consultation.
     */
    @Test
    public void testGetConDate() {
        System.out.println("getConDate");
        Consultation instance  = new Consultation();
        instance.setConDate("09/06");
        String expResult = "09/06";
        String result = instance.getConDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setConDate method, of class Consultation.
     */
    @Test
    public void testSetConDate() {
        System.out.println("setConDate");
        String i = "09/06";
        Consultation instance = new Consultation();
        instance.setConDate(i);
         String expResult ="09/06";
        String result = instance.getConDate();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAvailable method, of class Consultation.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        String available = "Available";
        Consultation instance = new Consultation();
        instance.setAvailable(available);
        String expResult = "Available";
        String result = instance.getAvailable();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getAvailable method, of class Consultation.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Consultation instance = new Consultation();
        instance.setAvailable("Available");
        String expResult = "Available";
        String result = instance.getAvailable();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescrption method, of class Consultation.
     */
    @Test
    public void testGetDescrption() {
        System.out.println("getDescrption");
        Consultation instance = new Consultation();
        instance.setDescrption("brief descrption about the case");
        String expResult = "brief descrption about the case";
        String result = instance.getDescrption();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDescrption method, of class Consultation.
     */
    @Test
    public void testSetDescrption() {
        System.out.println("setDescrption");
        String i = "brief descrption about the case";
        Consultation instance = new Consultation();
        instance.setDescrption(i);
         String expResult = "brief descrption about the case";
        String result = instance.getDescrption();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Consultation.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Consultation instance = new Consultation();
         User us = new User();
        instance.setCustomer(us);
        User expResult = us;
        User result = instance.getCustomer();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCustomer method, of class Consultation.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        User us = new User();
        Consultation instance = new Consultation();
        instance.setCustomer(us);
         User expResult = us;
        User result = instance.getCustomer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConsultationLawyer method, of class Consultation.
     */
    @Test
    public void testGetConsultationLawyer() {
        System.out.println("getConsultationLawyer");
        Consultation instance = new Consultation();
        Lawyer y = new Lawyer();
        instance.setConsultationLawyer(y);
        Lawyer expResult = y;
        Lawyer result = instance.getConsultationLawyer();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setConsultationLawyer method, of class Consultation.
     */
    @Test
    public void testSetConsultationLawyer() {
        System.out.println("setConsultationLawyer");
        Lawyer y = new Lawyer();
        Consultation instance = new Consultation();
        instance.setConsultationLawyer(y);
         Lawyer expResult = y;
        Lawyer result = instance.getConsultationLawyer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConsltation method, of class Consultation.
     */
     
    @Test
    @Ignore
    public void testSetConsltation() {
        System.out.println("setConsltation");
        Consultation instance = new Consultation();
        instance.setConsltation();
        
    }

    /**
     * Test of Displayschedule method, of class Consultation.
     */
    @Test
    public void testDisplayschedule() {
        System.out.println("Displayschedule");
        int n = 3;
        ArrayList<Consultation> Lschedule = new ArrayList();
       Lschedule.add(new Consultation("ahmed alghamdi","9:00am","Monday","09/06"));
        boolean expResult = false;
        boolean result = Consultation.Displayschedule(n, Lschedule);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of BookConsultation method, of class Consultation.
     */
    @Test (expected = NoSuchElementException.class)
    public void testBookConsultation() {
        System.out.println("BookConsultation");
        Scanner sc = new Scanner(System.in);
        String choise = "Y";
        Consultation con = new Consultation();
        User us = new User();
        while(sc.hasNextLine()){
           String desc = sc.nextLine();
            con.setDescrption(desc);
        }
        
        con.setAvailable("not availbale");
       
        con.setCustomer(us);
        con.getCustomer().AddConsultation(con);
        
        Consultation.BookConsultation(choise, us, con);
        String ex = "Your Consltation has been booked successfully "
                    + "\nPlease be in time";
        
        assertEquals( ex,  con.getConsultationLawyer());
        
 
    }

    /**
     * Test of toString method, of class Consultation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Consultation instance = new Consultation("ahmed alghamdi","9:00am","Monday","09/06");
        String expResult = "     Date        Time        Day        Available\n"
                + "     " + "09/06"+ "     " + "9:00am" + "     " + "Monday" + "        "+ null ;
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
