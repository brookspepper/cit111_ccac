/*This is a small roulette table program that I made for the java novel project.
 * It's not a fully functioning table but it has some of the basics without being unusable.
 * 
 * 
 */
package gamba;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Brooks
 */
public class MongoCasino
{
    public static int chips=250;
    public static void main(String[] args)
    {        
        boolean continueGame=true; 
        while(continueGame==true){
        System.out.println("Welcome to the roulette table!");
        System.out.println("What would you like to bet on?");
        System.out.println(" 1. Red \n 2. Black \n 3. 0 \n 4. 00 \n 5. Even \n 6. Odd");
        Scanner userInput=new Scanner(System.in);
        String bet=userInput.next();
        switch(bet)
        {
            case "1":
                System.out.println("How much would you like to bet?");
                int betOne=userInput.nextInt();
                redOdd(betOne);
                System.out.println("You now have "+chips+" chips.");                
                break;
            case "2":
                System.out.println("How much would you like to bet?");
                int betTwo=userInput.nextInt();
                blackEven(betTwo);
                System.out.println("You now have "+chips+" chips.");
                break;
            case "3":
                System.out.println("How much would you like to bet?");
                int betThree=userInput.nextInt();
                zero(betThree);
                System.out.println("You now have "+chips+" chips.");
                break;
            case "4":
                System.out.println("How much would you like to bet?");
                int betFour=userInput.nextInt();
                zeroZero(betFour);
                System.out.println("You now have "+chips+" chips.");
                break;
            case "5":
                System.out.println("How much would you like to bet?");
                int betFive=userInput.nextInt();
                blackEven(betFive);
                System.out.println("You now have "+chips+" chips.");
                break;
            case "6":
                System.out.println("How much would you like to bet?");
                int betSix=userInput.nextInt();
                redOdd(betSix);
                System.out.println("You now have "+chips+" chips.");
                break;          
        }
        if(chips==0)
        {
            System.out.println("Get out of here you bum!");
            System.out.println("You've been kicked out of the casino!");
            continueGame=false;
        }
        }
    }
    public static void redOdd(int betAmount)//red and odd are the same on a roulette table so I combined them into one method
    {
        int upperbound=39;
        Random rand=new Random();
        int randomNumber=rand.nextInt(upperbound);
        int yesOrNo=randomNumber%2;//mod returns 1 for even and 0 for odd because of the way random integers are set up for this program
        if(randomNumber==0)
        {
          System.out.println("Sorry you lost!");
          chips=chips-betAmount;
        }
         else if(randomNumber==1)
        {
          System.out.println("Sorry you lost!");
          chips=chips-betAmount;
        }
        else if(yesOrNo==0)
        {
           System.out.println("You've won!");
           betAmount*=2;
           chips=betAmount+chips;
        }
        else
        {
          System.out.println("Sorry you lost!");
          chips=chips-betAmount;
        }
        
    }
    public static void blackEven(int betAmount)//same for the reds and odds, black and even share spaces so they are the same.
    {
        int upperbound=39;//0-38 with one and zero being 0 and 00 respectively, same for all methods used. 
        Random rand=new Random();
        int randomNumber=rand.nextInt(upperbound);
        int yesOrNo=randomNumber%2;//mod returns a 1 showing that it is even because of how the numbers are set up
        if(randomNumber==0)
        {
          System.out.println("Sorry you lost!");
          chips=chips-betAmount;
        }
         else if(randomNumber==1)
        {
          System.out.println("Sorry you lost!");
          chips=chips-betAmount;
        }
        else if(yesOrNo==0)
        {
           System.out.println("You've won!");
           betAmount*=2;
           chips=betAmount+chips;
        }
        else
        {
          System.out.println("Sorry you lost!");
          chips=chips-betAmount;
        }
    }
    public static void zero(int betAmount)
    {
        Random rand=new Random();
        int upperbound=39;
        int randomNumber=rand.nextInt(upperbound);
        if(randomNumber==1)
        {
            System.out.println("You've just won big!");
            betAmount=betAmount*35;
            chips=betAmount+chips;
        }
        else
        {
            System.out.println("You lose!");
            chips=chips-betAmount;
        }
    }
    public static void zeroZero(int betAmount)
    {
        Random rand=new Random();
        int upperbound=39;
        int randomNumber=rand.nextInt(upperbound);
        if(randomNumber==0)
        {
            if(betAmount<=25)
                System.out.println("You should have bet more on that one!");
            System.out.println("You've just won big!");
            betAmount=betAmount*35;
            chips=betAmount+chips;
        }
        else
        {
            System.out.println("Better luck next time buddy!");
            chips=chips-betAmount;
        }
     }
}
