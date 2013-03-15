/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author nicolajdamfrederiksen
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CakeSolutionGame.LagkagehusetTest.class, CakeSolutionGame.LaPetiteEclaireTest.class, CakeSolutionGame.LocationTest.class, CakeSolutionGame.CakistanTest.class, CakeSolutionGame.BaklavaciTest.class})
public class CakeSolutionGameSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
