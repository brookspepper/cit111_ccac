/*
 * This is just a very simple program that prompts users to input a singular word that they would like to be reversed.
At this moment in time it is only useful for single words and cannot handle words or sentences with spaces in them. 
Hopefully at some point I will be able to fix that.
 *
 * 
 */
package MessingAround;
import java.util.Scanner;
/**
 *
 * @author Brooks Pepper
 */
public class ReverseReverse
{
    public static void main (String[] args)
    {
        int continueOrNot=0;
        while(continueOrNot==0)    
        {
        System.out.println("Enter a word that you would like to be reversed.");
        Scanner userInput=new Scanner(System.in);
        String reverse=userInput.next();
        int numLetters=reverse.length();
        String res="";
        for(int i=numLetters-1; i>=0; i--)
        {
           res=res+reverse.charAt(i);
        }
        int random=0;
        while(random==0)
        {
        System.out.println(res);
        System.out.println("Would you like to do another word?");
        String yesOrNo=userInput.next();
        switch(yesOrNo)
        {
            case "yes":
                System.out.println("Okay.");
                random++;
                break;
            case "no":
                System.out.println("Okay.");
                continueOrNot++;
                random++;
                break;
            default:
                System.out.println("Please try again.");
                break;
        }
        }
        }
        System.out.println("Thank you for using this program!");
    }
}
