/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGameGroup;

import CakeSolutionGameGroup.Location;
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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getExits method, of class Location.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Direction direction = null;
        Location instance = new LocationImpl();
        List expResult = null;
        List result = instance.getExits(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Location.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Location instance = new LocationImpl();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    public class LocationImpl implements Location {

        public List<Location> getExits(Direction direction) {
            return null;
        }

        public String getDescription() {
            return "";
        }
    }
}
