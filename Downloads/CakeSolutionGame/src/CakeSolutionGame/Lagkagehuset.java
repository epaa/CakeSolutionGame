/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGame;
 import java.util.List;
 import java.util.ArrayList;
/**
 *
 * @author nicolajdamfrederiksen
 */
//It creates a list based on the info in the interface Cakistan
public class Lagkagehuset implements Cakistan {
    
    List<Location> myLocations = new ArrayList<Location>();
    
    public Lagkagehuset() {
            myLocations.add(new Baklavaci());
            
    }

    @Override
    public List<Location> getLocations() {
        return myLocations;
    }

    
    
    
}
