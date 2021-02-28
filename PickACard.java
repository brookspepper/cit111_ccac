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
public class PickACard 
{
    
    public static void main (String[] args)
    {
        int cardRank=(int)((Math.random() * (14 - 1)) + 1);
        int cardSuit=(int)(Math.random()*4);
        System.out.println("Your card is ");
        switch(cardRank)
        {
            case 1: System.out.println("Ace "); break; 
            case 2: System.out.println(cardRank); break; 
            case 3: System.out.println(cardRank); break; 
            case 4: System.out.println(cardRank); break; 
            case 5: System.out.println(cardRank); break; 
            case 6: System.out.println(cardRank); break; 
            case 7: System.out.println(cardRank); break; 
            case 8: System.out.println(cardRank); break; 
            case 9: System.out.println(cardRank); break; 
            case 10:System.out.println(cardRank); break; 
            case 11:System.out.println("Jack "); break; 
            case 12:System.out.println("Queen "); break; 
            case 13:System.out.println("King "); break; 
        }
        System.out.println("of ");
        switch(cardSuit)
        {
            case 0: System.out.println("Spades"); break; 
            case 1: System.out.println("Hearts"); break;  
            case 2: System.out.println("Diamonds"); break; 
            case 3: System.out.println("Clubs"); break; 
        }
    }

}
