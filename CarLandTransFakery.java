/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackToTheFuture;

/**
 *
 * @author 14124
 */
public class CarLandTransFakery {
    public static void main(String[] args) {
        // create a new instance of a Car object with the keyword: new
        Car deLorean = new Car();
        // set member variables on the instance of Car stored in deLorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        // send our Car instance to a helper method to print its member variables
        deLorean.startEngine();
        System.out.println("Shifting up to 2 at 15 mph");
        System.out.println("Shifting up to 3 at 35 mph");
        deLorean.accelerate(50);
        displayCarStats(deLorean);
        deLorean.decelerate(40);
        System.out.println("Downshifting to 2 at 15 mph");
        System.out.println("Downshifting to 1 at 10 mph");
        displayCarStats(deLorean);
        
    } // close main
    
    public static void displayCarStats(Car anyCarObject)
    {
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        if(anyCarObject.getCurrentSpeed()>45){
            System.out.println("Gear: 3");
        } else if (anyCarObject.getCurrentSpeed() < 20){
            System.out.println("Gear: 1");
        }
        System.out.println("*****************");
    } // close displayCarStats
    
    
} // close class