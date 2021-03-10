/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessingAround;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class TheRealCanWeBeFriends 
{
    public static void main (String[] args)
    {
    int qOne=0;
    int qTwo=0;
    int qThree=0;
    int qFour=0;
    System.out.println("Do you think we can be friends?");
    System.out.println("Please answer each question with a yes or no.");
    Scanner userInput=new Scanner(System.in);
    while(qOne==0)
    {
        System.out.println("Do you enjoy spicy food?");
        String qOneAnswer=userInput.next();
        switch(qOneAnswer)
        {
            case "yes":
                System.out.println("Great!");
                qOne++;
                break;
            case "no":
                System.out.println("That's too bad.");
                qOne--;
                break;
            default:
                System.out.println("Invalid response please try again!");
                
        }
            
    }
    while(qTwo==0)
    {
        System.out.println("Do you like cheese?");
        String qTwoAnswer=userInput.next();
        switch(qTwoAnswer)
        {
            case "yes":
                System.out.println("Perfect, me too!");
                qTwo++;
                break;
            case "no":
                System.out.println("That's unfortunate!");
                qTwo--;
                break;
            default:
                System.out.println("Invalid response please try again!");
               
        }
    }
    while(qThree==0)
    {
        System.out.println("Do you like video games?");
        String qThreeAnswer=userInput.next();
        switch(qThreeAnswer)
        {
            case "yes":
                System.out.println("That's wonderful!");
                qThree++;
                break;
            case "no":
                System.out.println("Oh no!");
                qThree--;
                break;
            default:
                System.out.println("Invalid response please try again!");
        }
    }
    while(qFour==0)
    {
        System.out.println("Do you like watching the world cup?");
        String qFourAnswer=userInput.next();
        switch(qFourAnswer)
        {
            case "yes":
                System.out.println("Awesome!");
                qFour++;
                break;
            case "no":
                System.out.println("That's not okay!");
                qFour--;
                break;
            default:
                System.out.println("Invalid response!");
        }
    }
        int finalScore=qOne+qTwo+qThree+qFour;
        if(finalScore>=0)
        {
            System.out.println("I guess we can be friends after all!");
        }
        else
            System.out.println("I don't really think we should be friends!");
        
        System.out.println("Thank you for participating in this quiz!");
        
    }
}
