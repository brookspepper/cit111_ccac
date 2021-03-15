/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Brooks Pepper
 */
public class RoadTrippin {
    public static void main (String[] args)
    {
    
    String carMake="1996 Mazda Protoge";
    String carName="Jaime";
    int maxPassengers=5;
    int currentNumberOfPassengers=1;
    boolean carFull=false;
    double tripOdometer= 0.0;
    double tripBudget= 300.0;
    double distanceToMoabUtah= 1806.0;
    boolean destinationReached=false;
    
    double legDistance;
    
    System.out.println("***Road Trip Simulator***");
    System.out.println("-->Beginning of road trip stats<--");
    System.out.println("Make of car: " + carMake + " that can carry " + maxPassengers + " passengers.");
    System.out.println("Distance to destination: " + distanceToMoabUtah + " Miles");
    System.out.println("Full car? " + carFull + " Current Odometer: " + tripOdometer);
    System.out.println("Starting trip with "+currentNumberOfPassengers+" passenger(s).");
    System.out.println("Destination reached? "+destinationReached);
    
    double decimalQuarter= 0.25;
    legDistance= distanceToMoabUtah*decimalQuarter;
    System.out.println("CHECK LEG DISTANCE "+ legDistance);
    
    tripOdometer=tripOdometer + legDistance;
    
    distanceToMoabUtah= distanceToMoabUtah - legDistance;
    
    System.out.println("Oh look, there is a hiker who wants to go west too!");
    
    if (carFull==false)
    {
        currentNumberOfPassengers= currentNumberOfPassengers + 1;
    }        
    int gasMileage= 35;
    double pricePerGallon=2.47;
    double gasPriceForLeg= (legDistance/gasMileage)*pricePerGallon;
    double cashOnHand=300.00;
    cashOnHand= cashOnHand-gasPriceForLeg;
    
    System.out.println();
    System.out.println("****Variable stats at end of the leg 1****");
    System.out.println("Distance To Destination: " + distanceToMoabUtah);
    System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
    System.out.println("I have $" + cashOnHand + " to spend on this trip");
    System.out.println(currentNumberOfPassengers + " passengers in car");
    System.out.println("Destination Reached? " + destinationReached);
        
    
    legDistance=500;
    tripOdometer=legDistance+tripOdometer;
    distanceToMoabUtah=distanceToMoabUtah-legDistance;
    System.out.println("I see two more hitchhikers can we take them?");
    if (currentNumberOfPassengers<maxPassengers)
    {
    System.out.println("We can take them.");
    currentNumberOfPassengers=currentNumberOfPassengers + 2;
        
    }
    
    gasPriceForLeg=(legDistance/gasMileage)*pricePerGallon;
    cashOnHand=cashOnHand-gasPriceForLeg;
    System.out.println("Money Spent on Gas for Leg Two: "+ gasPriceForLeg);
    System.out.println("****Variable stats at end of the leg 2****");
    System.out.println("Distance To Destination: " + distanceToMoabUtah);
    System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
    System.out.println("I have $" + cashOnHand + " to spend on this trip");
    System.out.println(currentNumberOfPassengers + " passengers in car");
    System.out.println("Destination Reached? " + destinationReached);
    
    destinationReached=true;
    int finalHikers=2;
    legDistance=854.5;
    tripOdometer=legDistance+tripOdometer;
    distanceToMoabUtah=distanceToMoabUtah-legDistance;
    System.out.println("More Hikers? Can we Fit them?");
    if (currentNumberOfPassengers+finalHikers<=maxPassengers)
    {
     
    System.out.println("We can take them.");   
    
    }
    
    else
    {
        
    System.out.println("Sorry we can't fit you in.");
    
    }
    gasPriceForLeg=(legDistance/gasMileage)*pricePerGallon;
    cashOnHand=cashOnHand-gasPriceForLeg;  
    System.out.println("Cost of gas on final leg: "+ gasPriceForLeg);
    System.out.println("****Variable stats at end of the leg 3****");
    System.out.println("Distance To Destination: " + distanceToMoabUtah);
    System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
    System.out.println("I have $" + cashOnHand + " to spend on this trip");
    System.out.println(currentNumberOfPassengers + " passengers in car");
    System.out.println("Destination Reached? " + destinationReached);
    }
    
}
