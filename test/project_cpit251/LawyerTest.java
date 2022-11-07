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

    Lawyer instance = new Lawyer("Ahmed Alghamdi", "0503472498", "AhmedAlghamdi@gmail.com", "Bachelor", "Law", "financial cases", 150, 30, 1);
      

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
    @Test
    public void testGetName() {
        System.out.println("getName");
        // Lawyer instance = new Lawyer();
        String expResult = "Ahmed Alghamdi";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setN method, of class Lawyer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String i = "Ahmed";
        Lawyer instance = new Lawyer();
        instance.setName(i);
        String result = instance.getName();
        assertEquals(i, result);

    }

    /**
     * Test of getD method, of class Lawyer.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        String expResult = "Bachelor";
        String result = instance.getDegree();
        assertEquals(expResult, result);

    }

    /**
     * Test of setD method, of class Lawyer.
     */
    @Test
    public void testSetDegree() {
        System.out.println("setDegree");
        String i = "Master";
        instance.setDegree(i);
        String expectedResult = "Master";
        String result = instance.getDegree();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getS method, of class Lawyer.
     */
    @Test
    public void testGetSpecialty() {
        System.out.println("getSpecialty");
        String expResult = "Law";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);

    }

    /**
     * Test of setS method, of class Lawyer.
     */
    @Test
    public void testSetSpecialty() {
        System.out.println("setSpecialty");
        String y = "Islamic studies";
        instance.setSpecialty(y);
        String expResult = "Islamic studies";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);

    }

    /**
     * Test of getP method, of class Lawyer.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 150.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setP method, of class Lawyer.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double y = 100.0;
        instance.setPrice(y);
        double result = instance.getPrice();
        double expResult = 100.0;
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getNumOfConsultations method, of class Lawyer.
     */
    @Test
    public void testGetNumOfConsultations() {
        System.out.println("getNumOfConsultations");
        int expResult = 30;
        int result = instance.getNumOfConsultations();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNumOfConsultations method, of class Lawyer.
     */
    @Test
    public void testSetNumOfConsultations() {
        System.out.println("setNumOfConsultations");
        int numOfConsultations = 20;
        instance.setNumOfConsultations(numOfConsultations);
        int expResult = 20;
        int result = instance.getNumOfConsultations();
        assertEquals(expResult, result);

    }

    /**
     * Test of getC method, of class Lawyer.
     */
    @Test
    public void testGetCacesType() {
        System.out.println("getCacesType");
        String expResult = "financial cases";
        String result = instance.getCacesType();
        assertEquals(expResult, result);

    }

    /**
     * Test of setC method, of class Lawyer.
     */
    @Test
    public void testSetCacesType() {
        System.out.println("setCacesType");
        String y = "Criminal cases";
        instance.setCacesType(y);
        String expResult = "Criminal cases";
        String result = instance.getCacesType();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLawyerRate method, of class Lawyer.
     */
    @Test
    public void testGetLawyerRate() {
        System.out.println("getLawyerRate");
        double expResult = 0.0;
        double result = instance.getLawyerRate();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setLawyerRate method, of class Lawyer.
     */
    @Test
    public void testSetLawyerRate() {
        System.out.println("setLawyerRate");
        double LawyerRate = 1.0;
        instance.setLawyerRate(LawyerRate);
        double expResult = 1.0;
        double result = instance.getLawyerRate();
        assertEquals(expResult, result, 0.0);
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
        Lawyer info = new Lawyer("Omar Alhashmy", "0552736883", "OmarAlhashmy@gmail.com", "Master", "Law", "Personal status cases", 200, 50, 4);
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
    @Test
    public void testToString() {
        System.out.println("toString");
        Lawyer instance = new Lawyer("Omar Alhashmy", "0552736883", "OmarAlhashmy@gmail.com", "Master", "Law", "Personal status cases", 200, 50, 4);
        String expResult = "The Lawyer name is: Omar Alhashmy\n"
                + "Phone Number: 0552736883\n"
                + "Email: OmarAlhashmy@gmail.com\n"
                + "The Degree is: Master\n"
                + "The Specialty is: Law\n"
                + "The Case Type is : Personal status cases\n"
                + "The Consultations price is: 200.0\n"
                + "The number Of Consultations is: 50";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

}
