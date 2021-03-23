/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekEightMethodsTwo;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class unitConverter 
{
    public static void main(String[] args)
    {
        int tempContinue=0;
        while(tempContinue==0)
        {
        Scanner userInput=new Scanner(System.in);
        System.out.println("What units would you like to convert?");
        System.out.println("1. Yards to meters");
        System.out.println("2. Miles to kilometers");
        System.out.println("3. Pounds to kilograms");
        int temp=0;
        while(temp==0)
        {
        String selection=userInput.next();
        switch(selection)
        {
            case "1":
                System.out.println("How many yards would you like to convert into meters?");
                double userYards=userInput.nextDouble();
                System.out.println(userYards+" yards is "+yardsToMeters(userYards)+" meters.");
                temp++;
                break;
            case "2":
                System.out.println("How many miles would you like to convert to kilometers?");
                double userMiles=userInput.nextDouble();
                System.out.println(userMiles+" Miles is "+milesToKilometers(userMiles)+" kilometers.");
                temp++;
                break;
            case "3":
                System.out.println("How many pounds of material do you have?");
                double userPounds=userInput.nextDouble();
                System.out.println(userPounds+" Pounds is "+poundsToKilograms(userPounds)+" kilograms.");
                temp++;
                break;
            default: 
                System.out.println("Incorrect selection please try again.");
        }
        }
        System.out.println("Thank you for using this program!");
        System.out.println("Would you like to go again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        String continueOrNot=userInput.next();
        switch(continueOrNot)
        {
            case "1":
                break;
            case "2":
                tempContinue++;
                break;
        }
    }
    }
    public static double yardsToMeters(double yards)
    {
        final double yardsConversion=.9144;
        double conversion=yards*yardsConversion;
        return conversion;
    }
    
    public static double milesToKilometers(double miles)
    {
        final double kilometerConversion=1.60934;
        double conversion=miles*kilometerConversion;
        return conversion;
    }
    
    public static double poundsToKilograms(double pounds)
    {
        final double kiloConversion=0.453592;
        double conversion=pounds*kiloConversion;
        return conversion;
    }
    
}
