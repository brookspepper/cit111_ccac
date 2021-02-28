/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class challenge 
{
    public static void main (String[] args)
    {
        
        double distance;
        final double x2=0.0;
        final double y2=0.0;
        final double radius=10.0;
        Scanner userInput=new Scanner(System.in);
        System.out.println("What is your X coordinate?");
        double x1=userInput.nextDouble();
        System.out.println("What is your Y coordinate?");
        double y1=userInput.nextDouble();
        distance= Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        distance=Math.sqrt(distance);
        if(distance>radius)
        {
            System.out.println("The point is not on the circle with radius 10.");
        }
        else
            System.out.println("The point is on the circle with radius 10.");
    }
}
