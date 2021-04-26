package BackToTheFuture;
import java.util.Scanner;
/**
 * Model of a car inspired by Back To The Future 1's 8 car types!
 * @author delores
 */
public class Car {
    // public member variables: we don't need to implement logic 
    // to change these values
    public int year;
    public String makeModel;    
    // private member variables because we want to control 
    // their values: outside classes access these through methods
    private boolean isEngineRunning;
    private double speed;
    private int gear;
    private int fluxCapacity;
    /**
     * simulates starting this car instance's engine
     */
    public void startEngine()
    {
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
    }
    
    /**
     * Simulates stopping this car instance's engine
     */
    public void stopEngine()
    {
        isEngineRunning = false;
        System.out.println("...grblllll....shldunk");
    }
    
    /**
     * Allows access to our private engine status boolean member 
     * variable called isEngineRunning
     * @return the status of the engine: true means on, false means off
     */
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    
    /**
     * Allows access to our private speed variable
     * @return this car object's current speed
     */
    public double getCurrentSpeed(){
        return speed;
    }
    
    /**
     * Controls the car's increases in speed
     * @param mphIncrease 
     * @return the current speed of the car after the acceleration
     * has been taken into account
     */
    public double accelerate(int mphIncrease)
    {
        speed = speed + mphIncrease;
        if(speed<=15)
        {
            System.out.println(gear=1);
            System.out.println("The current gear is "+gear);
        }
        else if(speed>15 && speed<=30)
        {
            System.out.println(gear=2);
            System.out.println("The current gear is "+gear);
        }
        else if(speed>30 && speed<=50)
        { 
            System.out.println(gear=3);
            System.out.println("The current gear is "+gear);
        }
        else if(speed>50)
        {
            System.out.println(gear=4);
            System.out.println("The current gear is "+gear);
        }
        return speed;                
    }
    /**
     * Controls the car's decreases in speed
     * @param mphDecrease
     * @return the current speed of the car after the deceleration
     */
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        if(speed<=0)
        {
            speed=0;
            System.out.println("Speed too low, coming to a stop...");
        }                   
        if(speed<=15)
        {
            System.out.println(gear=1);
            System.out.println("The current gear is "+gear);
        }
        else if(speed>15 && speed<=30)
        {
            System.out.println(gear=2);
            System.out.println("The current gear is "+gear);
        }
        else if(speed>30 && speed<=50)
        { 
            System.out.println(gear=3);
            System.out.println("The current gear is "+gear);
        }
        else if(speed>50)
        {
            System.out.println(gear=4);
            System.out.println("The current gear is "+gear);
        }
        return speed;
    }
   public void timeTravel()
   {
       Scanner userInput=new Scanner(System.in);
       System.out.println("Destination year?");
       int destinationYear;
       destinationYear=userInput.nextInt();
       System.out.println("Destination month?");
       String destinationMonth;
       destinationMonth=userInput.next();
       int destinationDay;
       System.out.println("Destination date?");
       destinationDay=userInput.nextInt();
       System.out.println("Your current selected time travel time is "+destinationMonth+destinationDay+destinationYear);
       System.out.println("Confirm? Y/N");
       String confirm =userInput.next();
       switch(confirm)
       {
           case "y": System.out.println("Traveling.... Arrived.");
           break;
           case "n": System.out.println("Travel cancelled.");
           break;
       }
       
   }
}