/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author Brooks Pepper
 */
public class flowChart 
{
    public static void main (String[] args)
    {
        Scanner userInput=new Scanner(System.in);
        int testScore=0;
        String answer;
        String yes= "yes";//added this in for my own convience so I wouldn't have to type in the string every time
        System.out.println("Might we be friends?");
        System.out.println("Please answer all questions with a yes or no.");
        System.out.println("Do you enjoy music?");
        answer=userInput.next();//allows user to imput answer to questions 
        answer=(answer.toLowerCase());//sends answer to lower case to avoid any unwarrented errors
        
        if(answer.equals(yes))//checks answer against answer input and yes string
        {
            System.out.println("Nice!");
            testScore+=10;//adds score to testScore if answer is yes
        }
        else
        {
            System.out.println("You're boring!");//since it is a question with only two acceptable answers I wrote a simple else statement 
            testScore-=10;
        }
        //thought about writing an else if for something besides yes or no but they are easy to type and with only two answers it felt uneccessary 
        System.out.println("Do you like video games?");
        answer=userInput.next();
        answer=(answer.toLowerCase());
        if(answer.equals(yes))
        {
            System.out.println("Great! I do too!");
            testScore+=10;
        }
        else
        {
            System.out.println("That's terrible!");
            testScore-=10;
        }
        
        System.out.println("Do you like pizza?");
        answer=userInput.next();
        answer=(answer.toLowerCase());
        if(answer.equals(yes))
        {
            System.out.println("Perfect!");
            testScore+=5;
        }
        else
        {
            System.out.println("What is wrong with you!");
            testScore-=5;//score here is 5 because when I had written it as 10 before if you answered no to any question it gave you the else below
        }
          
        
        if(testScore>20)
        {
            System.out.println("We would be great friends!");
        }
        else
            System.out.println("I guess we can't be friends after all.");
        
        System.out.println("Your final friend score is "+testScore+ " points.");//shows test score, not super needed but nice to have.
    }
    
}
        