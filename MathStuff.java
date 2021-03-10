/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class MathStuff 
{
    public static void main (String[] args)
    {
        final int question=(10%3)*2;
        final int maxAttempts=3;
        int attempts=0;
        Scanner userInput=new Scanner(System.in);
        int solution;
        while(attempts<maxAttempts)
        {
            System.out.println("What is the solution to (10%3)*2?");
            solution=userInput.nextInt();
            if(solution==question)
            {
                System.out.println("That is the right answer!");
                System.out.println("The correct answer is 2. Solution: (10%3)*2 = 1*2 = 2.");
                break;
            }
            else if(solution!=question)
            {
                System.out.println("That answer is incorrect!");
                attempts++;
                if(solution>question)
                    System.out.println("Your answer is too high.");
                else if(solution<question)
                    System.out.println("Your answer is too low.");
                if(attempts==maxAttempts)
                {
                    System.out.println("The correct answer is 2. Solution: (10%3)*2 = 1*2 = 2.");
                }
                    
            }
        }
        System.out.println("Thank you for participating in the quiz!");
    }
}
