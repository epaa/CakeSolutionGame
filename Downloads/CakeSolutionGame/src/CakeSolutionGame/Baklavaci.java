/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGame;
 import java.util.List;
/**
 *
 * @author nicolajdamfrederiksen
 */

// It creates a list of the directions enumerated in the interface Location
public class Baklavaci implements Location {
    
    
      @Override
    public List<Location> getExits(Direction direction) {
    return null;   
    }
    
      @Override
    public String getDescription() {
            return "This is a totally fabulouuuus place";
    }

  
    
}
