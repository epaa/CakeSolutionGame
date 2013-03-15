/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGameGroup;

import CakeSolutionGameGroup.FabulousLocation;
import CakeSolutionGameGroup.Location.Direction;
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
public class FabulousLocationTest {
    
    public FabulousLocationTest() {
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
     * Test of getDescription method, of class FabulousLocation.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        FabulousLocation instance = new FabulousLocation();
        String expResult = "This is a totally fabulouuuus place";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExits method, of class FabulousLocation.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Direction direction = null;
        FabulousLocation instance = new FabulousLocation();
        List expResult = null;
        List result = instance.getExits(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
