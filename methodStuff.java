/*
 *Nothing special, just an updated version of the reverse string program using methods to do the reversal
instead of having the main code in the main method. Doesn't really take advantage of the methods but
still works fine and was good practice.
 */
package MessingAround;
import java.util.Scanner;
/**
 *
 * @author Brooks Pepper
 */
public class methodStuff 
{
   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Scanner userInput=new Scanner(System.in);
        System.out.println("How many words would you like to reverse?");
        int number=userInput.nextInt();
       for(int i=1; i<=number; i++)
       {      
            System.out.println("Please enter a word you would like to reverse. ");
            String revWord=userInput.next();
            String printOut=testMethod(revWord);    
            System.out.println("The word "+revWord+" backwards is: "+printOut+".");
       }
       System.out.println("Thank you for using this program.");
    }
    
    public static String testMethod(String reverseWord)
    {
        String res="";
        int numLetters=reverseWord.length();
        for(int i=numLetters-1; i>=0; i--)
        {
           res=res+reverseWord.charAt(i);
        }
        return res;
    }
}
