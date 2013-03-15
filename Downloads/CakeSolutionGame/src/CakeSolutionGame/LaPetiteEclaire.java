/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CakeSolutionGame;
 
import java.util.List;

import CakeSolutionGame.Cakistan;
import CakeSolutionGame.Location.Direction;
/**
 *
 * @author nicolajdamfrederiksen
 */
public class LaPetiteEclaire {

    public static void main(String[] args) {
        
                Lagkagehuset newWorld = new Lagkagehuset();
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


