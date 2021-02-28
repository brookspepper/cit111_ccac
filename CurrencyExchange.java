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
public class CurrencyExchange 
{
    public static void main (String[] args)
    {
        double exchangeRate;
        Scanner userInput=new Scanner(System.in);
        double dollars;
        double rmb;
        double conversion;
        int selection;
        System.out.println("What is the current exchange rate from USD to RMB?");
        exchangeRate=userInput.nextDouble();
        System.out.println("Press 1 for USD to RMB, press 2 for RMB to USD.");
        selection=userInput.nextInt();
        if(selection==1)
        {
            System.out.println("Please enter the dollar amount.");
            dollars=userInput.nextDouble();
            conversion=dollars*exchangeRate;
            System.out.println(dollars+ " USD is "+conversion+" Yuan.");
        }
        else if(selection==0)
        {
            System.out.println("Please enter the Yuan amount.");
            rmb=userInput.nextDouble();
            conversion=rmb/exchangeRate;
            System.out.println(rmb+" Yuan is "+conversion+" dollars.");
        }
    }
}
