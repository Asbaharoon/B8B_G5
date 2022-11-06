/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author nessm
 */
public class LawyerTest {
    
    public LawyerTest() {
    }
    
    @Ignore
    @BeforeClass
    public static void setUpClass() {
    }
    @Ignore
    @AfterClass
    public static void tearDownClass() {
    }
    @Ignore
    @Before
    public void setUp() {
    }
    @Ignore
    @After
    public void tearDown() {
    }

    /**
     * Test of getN method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testGetN() {
        System.out.println("getN");
        Lawyer instance = new Lawyer();
        String expResult = "";
        String result = instance.getN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setN method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testSetN() {
        System.out.println("setN");
        String i = "";
        Lawyer instance = new Lawyer();
        instance.setN(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getD method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testGetD() {
        System.out.println("getD");
        Lawyer instance = new Lawyer();
        String expResult = "";
        String result = instance.getD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setD method, of class Lawyer.
     */
    @Test
    public void testSetD() {
        System.out.println("setD");
        Lawyer instance = new Lawyer("Ahmed Alghamdi", "0503472498", "AhmedAlghamdi@gmail.com", "Bachelor", "Law", "financial cases", 150, 30, 1);
        String i = "Phd";
        instance.setD(i);
        String expectedResult = "Phd";
        String result = instance.getD();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getS method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testGetS() {
        System.out.println("getS");
        Lawyer instance = new Lawyer();
        String expResult = "";
        String result = instance.getS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setS method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testSetS() {
        System.out.println("setS");
        String y = "";
        Lawyer instance = new Lawyer();
        instance.setS(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getP method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testGetP() {
        System.out.println("getP");
        Lawyer instance = new Lawyer();
        double expResult = 0.0;
        double result = instance.getP();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setP method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testSetP() {
        System.out.println("setP");
        double y = 0.0;
        Lawyer instance = new Lawyer();
        instance.setP(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfConsultations method, of class Lawyer.
     */
    @Test
    public void testGetNumOfConsultations() {
        System.out.println("getNumOfConsultations");
        Lawyer instance = new Lawyer();
        int expResult = 0;
        int result = instance.getNumOfConsultations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfConsultations method, of class Lawyer.
     */
    @Test
    public void testSetNumOfConsultations() {
        System.out.println("setNumOfConsultations");
        int numOfConsultations = 0;
        Lawyer instance = new Lawyer();
        instance.setNumOfConsultations(numOfConsultations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getC method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testGetC() {
        System.out.println("getC");
        Lawyer instance = new Lawyer();
        String expResult = "";
        String result = instance.getC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setC method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testSetC() {
        System.out.println("setC");
        String y = "";
        Lawyer instance = new Lawyer();
        instance.setC(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLawyerRate method, of class Lawyer.
     */
    @Test
    public void testGetLawyerRate() {
        System.out.println("getLawyerRate");
        Lawyer instance = new Lawyer();
        double expResult = 0.0;
        double result = instance.getLawyerRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLawyerRate method, of class Lawyer.
     */
    @Test
    public void testSetLawyerRate() {
        System.out.println("setLawyerRate");
        double LawyerRate = 0.0;
        Lawyer instance = new Lawyer();
        instance.setLawyerRate(LawyerRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLawyer method, of class Lawyer.
     */
    @Test
    public void testGetLawyer() {
        System.out.println("getLawyer");
        String id = "3";
        ArrayList<Lawyer> list = new ArrayList<>();
        Lawyer info = new Lawyer("Salman Alghamdi", "0557687843", "SalmanAlghamdi@gmail.com", "Bachelor", "Law", "Criminal cases", 180, 20, 3);
        list.add(info);
        Lawyer expectedResult = info;
        Lawyer result = Lawyer.getLawyer(id, list);
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testNullObject() {
        System.out.println("getLawyer");
        String id = "5";
        ArrayList<Lawyer> list = new ArrayList<>();
        Lawyer info =new Lawyer("Omar Alhashmy", "0552736883", "OmarAlhashmy@gmail.com", "Master", "Law", "Personal status cases", 200, 50, 4);
        list.add(info);
        Lawyer result = Lawyer.getLawyer(id, list);
        assertNull(result);
    }

    /**
     * Test of ManageProfile method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testManageProfile() {
        System.out.println("ManageProfile");
        String info = "";
        Lawyer.ManageProfile(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lawyer.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        Lawyer instance = new Lawyer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
