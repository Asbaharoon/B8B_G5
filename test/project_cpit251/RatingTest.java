/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_cpit251;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class RatingTest {

    public RatingTest() {
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
     * Test of RatingCON method, of class Rating.
     */
    @Test
    public void testRatingCON() {
        System.out.println("RatingCON");
         ArrayList<Lawyer> list = new ArrayList<>();
        list.add(new Lawyer("Ahmed Alghamdi","0503472498","AhmedAlghamdi@gmail.com","Bachelor","Law","financial cases",150,30,1));
        Consultation consultation = new Consultation("Ahmed Alghamdi", "10:00am" , "Monday" , "16/05",list);
        double rate = 10;
        double expResult = 7.5;
        double result = Rating.RatingCON(consultation, rate);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }
        @Test
    public void testRatingCON_NotEquals() {
        System.out.println("RatingCON");
         ArrayList<Lawyer> list = new ArrayList<>();
        list.add(new Lawyer("Ahmed Alghamdi","0503472498","AhmedAlghamdi@gmail.com","Bachelor","Law","financial cases",150,30,1));
        Consultation consultation = new Consultation("Ahmed Alghamdi", "10:00am" , "Monday" , "16/05",list);
        double rate = 10;
        double expResult = 20;
        double result = Rating.RatingCON(consultation, rate);
        assertNotEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of printEnded method, of class Rating.
     */
    @Test
    @Ignore
    public void testPrintEnded() {
        System.out.println("printEnded");
        ArrayList<Consultation> consultation = null;
        int expResult = 0;
        int result = Rating.printEnded(consultation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
