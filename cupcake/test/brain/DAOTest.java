/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexander
 */
public class DAOTest {
    
    public DAOTest() {
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
     * Test of getUser method, of class DAO.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String name = "mads";
        String pword = "1234";
        DAO instance = new DAO();
        String expResult = "mads";
        String result = instance.getUser(name, pword).getUname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result + " should = " + expResult);
    }

 
    
}
