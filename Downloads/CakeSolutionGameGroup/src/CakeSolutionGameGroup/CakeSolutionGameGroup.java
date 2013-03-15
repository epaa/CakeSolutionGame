/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGameGroup;
 
import java.util.List;

import CakeSolutionGameGroup.World;
import CakeSolutionGameGroup.Location.Direction;
/**
 *
 * @author nicolajdamfrederiksen
 */
public class CakeSolutionGameGroup {

    public static void main(String[] args) {
        
                AnotherWorld newWorld = new AnotherWorld();
                List<Location> myLocations = newWorld.getLocations();
                
                for (Location giveMeaLocationOneAtATime : myLocations) {
                        System.out.println("Fancy for loop: " 
                                +giveMeaLocationOneAtATime.getDescription());
                }
                
                
                for (Direction theNextDirection : Direction.values()) {
                        System.out.println(theNextDirection);
                    
                }
                
                
                
    
    }
    }


