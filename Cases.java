/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author 14124
 */
public class Cases 
{
    public static void main(String[] args)
    {
        int userSelection;
        System.out.println("****** switches and methods *******");
        System.out.println("Options:");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here!");
        System.out.println("Enter an int and press enter:");
        Scanner userInput=new Scanner(System.in);
        userSelection=userInput.nextInt();
        switch(userSelection)
        {
            case 1:
                printStatement();
                break;
            case 2:
                bigNumber();
                break;
            case 3: 
                System.out.println("Thanks for coming!");
                break;
            default:
                System.out.println("Unknown selection....exiting.");
                break;
        }
    }
    public static void printStatement()
    {
        System.out.println("Is your refrigerator running? Well you better go catch it!");
    }
    public static void bigNumber()
    {
        Random ranNum=new Random();
        BigInteger largeInt=new BigInteger(150,ranNum);
        System.out.println("Your large number is "+largeInt+ ".");
    }
   
}
