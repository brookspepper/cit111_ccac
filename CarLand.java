/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackToTheFuture;

public class CarLand {
    public static void main(String[] args) {
        // create a new instance of a Car object with the keyword: new
        Car deLorean = new Car();
        // set member variables on the instance of Car stored in deLorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        // send our Car instance to a helper method to print its member variables
        displayCarStats(deLorean);
        // test its methods
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.decelerate(12);
        // check status again
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);
        
        Car AMC_Eagle =new Car();
        AMC_Eagle.year=1984;
        AMC_Eagle.makeModel="AMC Eagle";
        AMC_Eagle.startEngine();
        AMC_Eagle.accelerate(50);
        AMC_Eagle.decelerate(0);
        displayCarStats(AMC_Eagle);
        
        Car BMW=new Car();
        BMW.year=1985;
        BMW.makeModel="BMW 733i";
        
        Car Toyota=new Car();
        Toyota.year=1982;
        Toyota.makeModel="Toyota Hilux";
                
    } // close main
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.out.println("*****************");
    } // close displayCarStats
    
    
} // close class