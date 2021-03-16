/*
 * the whole thing might not make sense in terms of the prize or the game itself, I tried to base it off the price is right 3 door game
however it might be a lot weirder than that.

 */
package MessingAround;
import java.util.Scanner;
/**
 *
 * @author Brooks Pepper
 */
public class randomDoors 
{
    public static void main(String[] args)
    {
       int again=0;
       while(again==0)
       {
       System.out.println("Welcome to the price is nothing! The points are made up and the score doesn't matter!");
       System.out.println("Enter the number of the door that you would like to open!");
       System.out.println("Door number 1, 2, or 3?");
       Scanner userInput=new Scanner(System.in);
       int selection=userInput.nextInt();
        switch(selection)//this whole shabang gathers the users input, the game itself may not make sense but the code itself works.
        {
            case 1:
                randomPrize(selection);//this calls to the randomPrize method which gives the user a random prize.
                break;
            case 2:
                System.out.println("What is your favorite number? This will help determine what is behind your door!");
                int questionResponse=userInput.nextInt();
                questionTime(questionResponse);//the response to this question will give the user a prize based on the input of what their favorite number is 
                break;
            case 3:
                System.out.println("Say, how many cars do you own?");//this asks how many cars the user owns, based on the users input it will generate a prize to give them
                int secondQuestionResponse=userInput.nextInt();
                carQuestion(secondQuestionResponse);
                break;
        }
       System.out.println("Would you like to play again?");//asks user if they would like to play again
       String yesOrNo=userInput.next();//gets response
       int temp=0;//just a temp variable so that the while loop can do it's thing
       while(temp==0){//this loop is to make sure that if they input an invalid response it will continue until yes or no is entered
       switch(yesOrNo)//this may not be the most effective but it is something i've worked out myself.  based on yes or no it will run the whole program again
       {
           case "yes":
               System.out.println("Let's do it again!");
               temp++;//adds 1 to this so that you can do it again
               break;
           case "no":
               System.out.println("Thank you for playing!");
               temp++;
               again++;//completely ends the program
               break;
           default://incase an improper input is put in, just makes sure the whole program doesn't end if a mistake is made. 
               System.out.println("What was that I couldn't quite understand you!");
               break;
       }
           
       }
    
       }
 
    }
    public static void randomPrize(int random)
    {
        random=(int) (Math.random()*3);//generates a random number between 0 and 2 to get a value for the switch
        switch(random)//uses the randomly generated number to get a response from the switch
        {
            case 0:
                System.out.println("You've won a brand new goat!");
                break;
            case 1:
                System.out.println("You've won a brand new car!");
                break;
            case 2: 
                System.out.println("You've won a brand new boat!");
                break;
        }//closing of the randomPrize method
            
    
    }
    
    public static void questionTime(int response)//based off the user input for case 2 above this gets a response based on the value input 
    {
        if(response>=100)
            System.out.println("You've won a new house!");
        else if(response>=50)
            System.out.println("You've won a lifetime supply of air!");
        else if (response>=25)
            System.out.println("You've won the world's one and only left handed coffee mug!");
        else
            System.out.println("You've won a free trip to Switzerland!");
    }//closing of the questionTime method
    
    public static void carQuestion(int car)//from the user input above this gets a response and uses it to print out a response accordingly
    {
        switch(car)
        {
            case 0:
                System.out.println("Well that is about to change because we are sending you home with a brand new Chevy Blazer!");
                break;
            case 1:
                System.out.println("Consider buying a bike because we are going to destroy your car live on TV!");
                break;
            case 2:
                System.out.println("Look at this venture capitalist! We're sending you home with 40 used shoes! Don't worry, none of them match!");
                break;
            case 3:
                System.out.println("That sure is a lot of cars! We're sending you home with a lifetime supply of oil!");
                break;
            default:
                System.out.println("That is way too many! We're kicking you off the show!");
        }//closing of the switch
    }//closing of the carQuestion method 
}//closing of main method
