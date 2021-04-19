/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Brooks 
 */
public class Donut 
{
    //memeber variables
    private int percRemaining=100;
    public String name;
    
    //method: takes in an integer representing the size of the bite
    //being taken out of this donut. returns nothing
    public void simulateEating(int percentEaten)
    {
        //subract the bite size from the total donut remaining
        percRemaining=percRemaining-percentEaten;
        System.out.println("Inisde simulateEating method.");
    }//close method
    
    //method takes no input and returns percent remaining
    public int getPercRemaining()
    {    
        //very simple guts: just send back the value of one of the object's member variables to the calling method
        //this is called a getter
        System.out.println("Inside percRemaining method.");
        return percRemaining;
    }//close method
    
    //there is no main method in this class!
    //we must take this object with the new keyword inside another class
    //in order for this class to do anything
    
}
