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
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class CustomersTest {
    
    public CustomersTest() {
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
     * Test of searchForLawyer method, of class Customers.
     */
    
    //Use assertEquals method to testing
    @Test
    public void testSearchForLawyer() {
        System.out.println("searchForLawyer");
        String info = "Ahmed Alghamdi";
        ArrayList<Lawyer> list = new ArrayList<>();
        Lawyer lawyer=new Lawyer("Ahmed Alghamdi","0503472498","AhmedAlghamdi@gmail.com","Bachelor","Law","financial cases",150,30,1);
        list.add(lawyer);
        Lawyer expResult = lawyer;
        Lawyer result = Customers.searchForLawyer(info, list);
        assertEquals(expResult, result);
      
    }
     
    //Use NullObject method to testing
     @Test
    public void testNullObject() {
        System.out.println("searchForLawyer");
        String info = "Omar";
        ArrayList<Lawyer> list = new ArrayList<>();
        Lawyer lawyer=new Lawyer("Ahmed Alghamdi","0503472498","AhmedAlghamdi@gmail.com","Bachelor","Law","financial cases",150,30,1);
        list.add(lawyer);
        Lawyer result = Customers.searchForLawyer(info, list);
        assertNull(result);
      
    }

}
