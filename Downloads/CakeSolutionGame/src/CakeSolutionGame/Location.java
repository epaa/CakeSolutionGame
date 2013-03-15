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

//It is the interface, in which the directions are enumerated
public interface Location {
     public enum Direction  {EAST, NORTH, WEST, SOUTH, UP, DOWN };
     List<Location> getExits(Direction direction);
     String getDescription();
}