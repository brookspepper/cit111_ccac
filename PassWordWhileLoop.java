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
public class PassWordWhileLoop
{
    public static void main (String[] args)
    {
        final String password=("Java");
        final int numberAttempts=0;
        final String secretInfo=("The meaning of life is 42.");
        int attempts=3;
        Scanner userInput=new Scanner(System.in);
        while(attempts>numberAttempts)
        {
            System.out.println("Please enter your password. ");
            String attemptedPassword=userInput.next();
            if(attemptedPassword.equals(password))
            {
                System.out.println("You have successfully entered your password.");
                System.out.println(secretInfo);
                System.out.println("Thank you for participating!");
                break;
            }
            else if(!attemptedPassword.equals(password)&& attempts>numberAttempts)
            {
                attempts--;
                System.out.println("You have entered the incorrect password. You have "+ attempts +" attempts remaining.");                
            }
        }
        
    }            
}
