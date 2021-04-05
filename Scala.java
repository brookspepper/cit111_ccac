/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lc3_classstructure;
import java.util.Scanner;
/**

 * @author Brooks Pepper
 */
public class Scala 
{
    private static int pizzaSlidersOrdered=0;
    private static int spaghettiOrdered=0;
    private static double totalGrossRevenue=0;
    private static double totalMeat=60;
    private static double totalBuns=10;
    private static double pastaServings=10;
    private static double pastaSauce=10;
    
    final static double pizzaSlidersPrice=2.95;
    final static double spaghettiPrice=8.50;
            
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tony's Pizza Parlor!");
        int tempCont=0;
        while(tempCont==0)
        {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Would you like: \n 1. Sliders \n 2. Spaghetti");
        String selection=userInput.next();      
        switch(selection)
        {
            case "1":
                System.out.println("How many pizza sliders would you like?");
                int numSliders=userInput.nextInt();
                slider(numSliders);
                break;
            case "2":
                System.out.println("How many orders of spaghetti would you like?");
                int numSpaghetti=userInput.nextInt();
                spaghetti(numSpaghetti);
                break;
                 
        }
        System.out.println("Would you like to order again? \n 1. Yes \n 2. No");
        int userCont=userInput.nextInt();
        switch(userCont)
        {
            case 1:
                tempCont+=0;
                break;
            case 2:
                tempCont++;
                break;                            
        }
        }
        statisticResturante();
        System.out.println("Thank you for coming to Tony's Pizza Parlor!");
    }
    
    public static void slider(int sliderOrderNumber)
    {
        if(totalMeat>=sliderOrderNumber*6 && totalBuns>=sliderOrderNumber)
        {            
        System.out.println(sliderOrderNumber+" Pizza Sliders coming up.");
        pizzaSlidersOrdered=pizzaSlidersOrdered+sliderOrderNumber;
        double cost=pizzaSlidersPrice*sliderOrderNumber;
        System.out.println("That will be "+cost+" $");
        totalGrossRevenue=cost+totalGrossRevenue;
        totalMeat=totalMeat-(sliderOrderNumber*6);
        totalBuns=totalBuns-(sliderOrderNumber);
        }
        else
            System.out.println("We don't have enough product for that!");
    }
    
    public static void spaghetti(int spaghettiOrderNumber)
    {
        if(pastaServings>=spaghettiOrderNumber && pastaSauce>=spaghettiOrderNumber)
        {
        System.out.println(spaghettiOrderNumber+" Orders of spaghetti coming right up!");
        spaghettiOrdered=spaghettiOrdered+spaghettiOrderNumber;
        double cost=spaghettiPrice*spaghettiOrderNumber;
        System.out.println("That will be "+cost+" $");
        totalGrossRevenue=cost+totalGrossRevenue;
        pastaServings=pastaServings-(spaghettiOrderNumber);
        pastaSauce=pastaSauce-pastaServings;
        }
        else
            System.out.println("We don't have enough product for that!");
    }
    
    public static void statisticResturante()
    {
        System.out.println("*****Restaurant Statistics*****");
        System.out.println(pizzaSlidersOrdered+" Pizza sliders have been ordered.");
        System.out.println(spaghettiOrdered+" Servings of spaghetti have been ordered.");
        System.out.println(totalGrossRevenue+" $ Of gross revenue has been made since opening today.");
        System.out.println("We have "+totalMeat+" ounces of meat left.");
        System.out.println("We have "+totalBuns+" buns left.");
        
        System.out.println("*****END OF STATISTICS*****");        
    }
    
}
