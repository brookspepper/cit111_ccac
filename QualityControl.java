/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author Brooks Pepper
 */
public class QualityControl
{
    public static void main(String[] args)
    {
        final int MAX_QUALITY=100;
        int goodUnits=0;
        int badUnits=0;
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter the amount of units that you would like to produce. ");
        int units=userInput.nextInt();
        int unitControl=1;
        while(unitControl<=units)
        {
            int quality=(int)(Math.random()*MAX_QUALITY);
            System.out.println("****************************");
            System.out.println("Unit quality: "+quality);
            if(quality>50)
            {
                System.out.println("****************************");
                System.out.println("This unit passes quality check.");
                System.out.println("****************************");
                goodUnits++;
                System.out.println(unitControl+" out of "+units+" produced.");
                unitControl++;
            }
            else
            {
                System.out.println("****************************");
                System.out.println("This unit does not pass quality check.");
                badUnits++;
                System.out.println("****************************");
                System.out.println(unitControl+" out of "+units+" produced.");
                unitControl++;
            }   
        }
        System.out.println("Production complete");
        System.out.println(goodUnits+" Units passed check. "+badUnits+" Failed check.");
                
    }
    
}
