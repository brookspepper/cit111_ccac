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
public class Location {
    public static void main (String[] args)
    {
        String locationNameOne= "Asbury Park";
        double distance= 370.0;
        boolean canDrive= true;
        String important= "I lived near there and I have fond memories of family there.";
        String locationNameTwo= "Weirton";
        double distanceTwo= 404.4;
        double totalDistance= distance + distanceTwo;
        
        System.out.println("My first favorite location is " + locationNameOne + ".");
        System.out.println("The distance from "+ locationNameOne + " to Pittsburgh is " + distance + " miles");
        System.out.println("It is important to me because " + important);
        System.out.println("True or false you can drive there.");
        System.out.println(canDrive);
        System.out.println("My second favorite location is " + locationNameTwo + ".");
        System.out.println("It is "+ distanceTwo + " miles from Asbury Park.");
        System.out.println("The total distance between the two would be "+totalDistance+" miles.");
        
    }
}
