/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project_cpit251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author nessm
 */
public class UserTest {
     User instance = new User("Ahmed","A1234",1);
     User instance1 = new User("0503472498","AhmedAlghamdi@gmail.com");
     
    
    public UserTest() {
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
     * Test of getUserName method, of class User.
     */
    
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String expResult = "Ahmed";
        String result = instance.getUserName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUserName method, of class User.
     */
   
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String i = "Saad";
        instance.setUserName(i);
        String expResult = "Saad";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getuserPassword method, of class User.
     */
    
    @Test
    public void testGetuserPassword() {
        System.out.println("getuserPassword");
        String expResult = "A1234";
        String result = instance.getuserPassword();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setuserPassword method, of class User.
     */
    
    @Test
    public void testSetuserPassword() {
        System.out.println("setuserPassword");
        String i = "A1212";
        instance.setuserPassword(i);
        String result = instance.getuserPassword();
        assertEquals(i, result);
    }

    /**
     * Test of getUserEmail method, of class User.
     */
   
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        String expResult = "AhmedAlghamdi@gmail.com";
        String result = instance1.getUserEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserEmail method, of class User.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String y = "Khaled22@gmail.com";
        instance1.setUserEmail(y);
        String expectedResult = "Khaled22@gmail.com";
        String result = instance1.getUserEmail();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getPhone method, of class User.
     */
    
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        String expResult = "0503472498";
        String result = instance1.getPhone();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPhone method, of class User.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String Phone = "0555553214";
        instance1.setPhone(Phone);
        String expectedResult = "0555553214";
        String result = instance1.getPhone();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getUserID method, of class User.
     */
    
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        int expResult = 1;
        int result = instance.getUserID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserID method, of class User.
     */
    
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        int UserID = 2;
        instance.setUserID(UserID);
        int result = instance.getUserID();
        assertEquals(UserID, result);
    }

    /**
     * Test of AddConsultation method, of class User.
     */
    @Test
    public void testAddConsultation() {
        System.out.println("AddConsultation");
        Consultation con =  new Consultation("ahmed alghamdi","9:00am","Monday","09/06" );
        instance.AddConsultation(con);
        assertEquals(con, instance.getConsultation(0));
         
    }

    /**
     * Test of getConsultation method, of class User.
     */
    @Test
    public void testGetConsultation() {
        System.out.println("getConsultation");
        Consultation con =  new Consultation("ahmed alghamdi","9:00am","Monday","09/06" );
        instance.AddConsultation(con);
        Consultation result = instance.getConsultation(0);
        assertEquals(con, result);
        
    }

    /**
     * Test of deletConsultation method, of class User.
     */
    @Ignore
    @Test
    public void testDeletConsultation() {
        System.out.println("deletConsultation");
        int i = 0;
        User instance = new User();
        instance.deletConsultation(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class User.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        Main m = new Main();
        String username = "Ali";
        String password = "A1234";
        User expResult = null;
        User result = User.Login(username, password);
        assertNull(result);
         
    }
    
}
