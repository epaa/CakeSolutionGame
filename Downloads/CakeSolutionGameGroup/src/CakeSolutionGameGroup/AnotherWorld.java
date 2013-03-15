/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGameGroup;
 import java.util.List;
 import java.util.ArrayList;
/**
 *
 * @author nicolajdamfrederiksen
 */
//It creates a list based on the info in the interface World
public class AnotherWorld implements World {
    
    List<Location> myLocations = new ArrayList<Location>();
    
    public AnotherWorld() {
            myLocations.add(new FabulousLocation());
            
    }

    @Override
    public List<Location> getLocations() {
        return myLocations;
    }

    
    
    
}
