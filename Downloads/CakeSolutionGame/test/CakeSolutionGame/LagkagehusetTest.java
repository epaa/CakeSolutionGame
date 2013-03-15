/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGame;

import CakeSolutionGame.Lagkagehuset;
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
public class LagkagehusetTest {
    
    public LagkagehusetTest() {
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
     * Test of getLocations method, of class Lagkagehuset.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Lagkagehuset instance = new Lagkagehuset();
        List expResult = null;
        List<Location> result = instance.getLocations();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull(result);
    }
}
