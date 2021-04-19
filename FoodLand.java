/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;
import java.util.Scanner;
/**
 *
 * @author Brooks
 */
public class FoodLand 
{
    final static int NIBBLE=5;
    final static int MEGA_BITE=45;
    
    public static void main(String[] args)
    {
        Scanner userInput=new Scanner(System.in);
        Burger myBurger;
        myBurger=new Burger();
        System.out.println("Would you like to add cheese?");
        String cheeseSelection=userInput.next();
        if("yes".equals(cheeseSelection))
        {
            myBurger.addCheese();
        }
        System.out.println("Would you like to add lettuce?");
        String lettuceSelection=userInput.next();
        if("yes".equals(lettuceSelection))
        {
            myBurger.addLettuce();
        }
        myBurger.simulateEating(NIBBLE);
        System.out.println("Done...");       
        getBurgerData(myBurger);
        
        Salad mySalad;
        mySalad=new Salad();
        System.out.println("Would you like to add meat to your salad?");
        String addingMeat=userInput.next();
        if("yes".equals(addingMeat))
        {
            mySalad.addMeat();
        }
        System.out.println("Would you like to add nuts?");
        String addingNuts=userInput.next();
        if("yes".equals(addingNuts))
        {
            mySalad.addNuts();
        }
        mySalad.eatSalad(MEGA_BITE);
        System.out.println("MEGA BITE finished :) ");
        getSaladData(mySalad);
    }
    
    private static void getBurgerData(Burger inputBurger)
    {
        System.out.println("****BURGER STATS****");
        System.out.println("Burger has cheese: "+inputBurger.cheese);
        System.out.println("Burger has lettuce: "+inputBurger.lettuce);
        System.out.println("Buger left: "+inputBurger.getPercRemaining());
        System.out.println("****END STATS****");
        
    }
    
    private static void getSaladData(Salad inputSalad)
    {
        System.out.println("****SALAD STATS****");
        System.out.println("Salad contains meat: "+inputSalad.hasMeat);
        System.out.println("Salad contains nuts: "+inputSalad.containsNuts);
        System.out.println("Salad left: "+inputSalad.getPercRemaining());
        System.out.println("****END STATS****");
    }
}
