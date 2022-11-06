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
    @Ignore
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        User instance = new User();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Ignore
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String i = "";
        User instance = new User();
        instance.setUserName(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getuserPassword method, of class User.
     */
    @Ignore
    @Test
    public void testGetuserPassword() {
        System.out.println("getuserPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getuserPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setuserPassword method, of class User.
     */
    @Ignore
    @Test
    public void testSetuserPassword() {
        System.out.println("setuserPassword");
        String i = "";
        User instance = new User();
        instance.setuserPassword(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class User.
     */
    @Ignore
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        User instance = new User();
        String expResult = "";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserEmail method, of class User.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        User instance = new User("0504768952", "KhaledAlshehri@gmail.com");
        String y = "Khaled22@gmail.com";
        instance.setUserEmail(y);
        String expectedResult = "Khaled22@gmail.com";
        String result = instance.getUserEmail();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getPhone method, of class User.
     */
    @Ignore
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        User instance = new User();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class User.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        User instance = new User("0503472498", "AhmedAlghamdi@gmail.com");
        String Phone = "0555553214";
        instance.setPhone(Phone);
        String expectedResult = "0555553214";
        String result = instance.getPhone();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getUserID method, of class User.
     */
    @Ignore
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        User instance = new User();
        int expResult = 0;
        int result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserID method, of class User.
     */
    @Ignore
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        int UserID = 0;
        User instance = new User();
        instance.setUserID(UserID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddConsultation method, of class User.
     */
    @Test
    public void testAddConsultation() {
        System.out.println("AddConsultation");
        Consultation con = null;
        User instance = new User();
        instance.AddConsultation(con);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultation method, of class User.
     */
    @Test
    public void testGetConsultation() {
        System.out.println("getConsultation");
        int i = 0;
        User instance = new User();
        instance.getConsultation(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletConsultation method, of class User.
     */
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
        String username = "";
        String password = "";
        User expResult = null;
        User result = User.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
