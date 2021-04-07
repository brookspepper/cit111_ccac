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
    private static int pizzaOrdered=0;
    private static double totalGrossRevenue=0;
    private static double totalMeat=60;
    private static double totalBuns=10;
    private static double pastaServings=10;
    private static double pastaSauce=10;
    private static int cheese=10;
    private static int dough=10;
    
    final static double pizzaSlidersPrice=2.95;
    final static double spaghettiPrice=8.50;
    final static double pizzaPrice=10.95;
            
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tony's Pizza Parlor!");
        int tempCont=0;
        while(tempCont==0)
        {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Would you like: \n 1. Sliders \n 2. Spaghetti \n 3. Pizza");
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
            case "3":
                System.out.println("How many pizza's would you like?");
                int pizzaNumber=userInput.nextInt();
                pizzaOrder(pizzaNumber);
                break;
            default:
                System.out.println("Please try again.");
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
        product();
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
        {
            System.out.println("We don't have enough product for that!");
            totalMeat=totalMeat+100;
            totalBuns=totalBuns+100;
            System.out.println("Ordering more product...");
            System.out.println("Done!");
        }
        if(totalMeat<=18)
        {           
            System.out.println("We're low on meat!");
            System.out.println("Ordering more...");
            totalMeat=totalMeat+42;
            System.out.println("Meat Restocked!");
        }
        if(totalBuns<=3)
        {
            System.out.println("We're low on buns!");
            System.out.println("Ordering more...");
            totalBuns=totalBuns+7;
            System.out.println("Buns restocked!");
        }
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
        pastaSauce=pastaSauce-spaghettiOrderNumber;
        }
        else
        {
            System.out.println("We don't have enough product for that!");
            pastaServings=pastaServings+100;
            pastaSauce=pastaSauce+100;
            System.out.println("Ordering more product...");
            System.out.println("Done!");
        }
        if(pastaServings<=3)
        {
            System.out.println("We're low on spaghetti!");
            System.out.println("Ordering more...");
            pastaServings=pastaServings+7;
            System.out.println("Pasta restocked!");
        }
        if(pastaSauce<=3)
        {
            System.out.println("We're low on sauce!");
            System.out.println("Ordering more...");
            pastaSauce=pastaSauce+7;
            System.out.println("Sauce restocked!");
        }
    }
    public static void pizzaOrder(int pizzaTime)
    {
        if(pastaSauce>=pizzaTime && dough>=pizzaTime && cheese>=pizzaTime)
        {
            System.out.println(pizzaTime+" Pizza's coming right up!");
            pizzaOrdered=pizzaOrdered+pizzaTime;
            double cost=pizzaTime*pizzaPrice;
            totalGrossRevenue=cost+totalGrossRevenue;
            cheese=cheese-pizzaTime;
            pastaSauce=pastaSauce-pizzaTime;
            dough=dough-pizzaTime;
            System.out.println("That will be "+cost+" $");
        }        
        else
        {    
            System.out.println("We don't have enough product for that!");
            dough=dough+100;
            pastaSauce=pastaSauce+100;
            cheese=cheese+100;
            System.out.println("Ordering more product...");
            System.out.println("Done!");
        }      
        
        if(cheese<=3)
        {
            System.out.println("We're low in cheese!");
            System.out.println("Ordering more...");
            System.out.println("Cheese restocked!");
            cheese=cheese+7;
        }
        
        if(dough<=3)
        {
            System.out.println("We're running out of dough!");
            System.out.println("Making more...");            
            dough=dough+7;
            System.out.println("Dough made!");
        }
        
        if(pastaSauce<=3)
        {
            System.out.println("We're low on sauce!");
            System.out.println("Ordering more...");
            pastaSauce=pastaSauce+7;
            System.out.println("Sauce restocked!");
        }
    }
    
    public static void statisticResturante()
    {
        System.out.println("*****Restaurant Statistics*****");
        System.out.println(pizzaSlidersOrdered+" Pizza sliders have been ordered.");
        System.out.println(spaghettiOrdered+" Servings of spaghetti have been ordered.");
        System.out.println(pizzaOrdered+" Pizzas have been ordered.");
        System.out.println(totalGrossRevenue+" $ Of gross revenue has been made since opening today.");
        System.out.println("*****END OF STATISTICS*****");        
    }
    public static void product()
    {
        System.out.println("We have "+totalMeat+" ounces of meat");
        System.out.println("We have "+totalBuns+" buns");
        System.out.println("We have "+pastaServings+" servings of pasta");
        System.out.println("We have "+pastaSauce+" cups of sauce");
        System.out.println("We have "+cheese+" pounds of cheese");
        System.out.println("We have "+dough+" pounds of dough");
    }
}
