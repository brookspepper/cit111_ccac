/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class This 
{
    public static void main(String[] args)
    {
        final double itemPrice=100.0;
        double discount=.15;
        System.out.println("The price of one unit is 100$");
        priceCalculate(itemPrice,discount);
        Scanner userInput=new Scanner(System.in);
        System.out.println("What is your spending limit?");
        double limitInput=userInput.nextDouble();
        displayPurchaseNumber(limitInput,85.0);
        
    }
    public static void displayPurchaseNumber(double limit, double price)
    {
        int numPurchasable=(int) Math.floor(limit/price);
        System.out.println("With $ "+limit+" limit you can purchase "+numPurchasable+" units.");
    }
     public static void priceCalculate(double price, double discount)
    {
        double finalPrice=price-(price*discount);
        System.out.println("The price of the item after discount is: $ "+finalPrice);
    }
}
