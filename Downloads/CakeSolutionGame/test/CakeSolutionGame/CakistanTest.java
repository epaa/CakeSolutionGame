/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGame;

import CakeSolutionGame.Cakistan;
import CakeSolutionGame.Location;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class CakistanTest {
    
    public CakistanTest() {
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
     * Test of getLocations method, of class Cakistan.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Cakistan instance = new WorldImpl();
        List expResult = null;
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    public class WorldImpl implements Cakistan {

        public List<Location> getLocations() {
            return null;
        }
    }
}
