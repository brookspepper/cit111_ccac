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
public class TestClass 
{
    public static void main (String[] args)
    {
        Scanner userInput=new Scanner(System.in);
        System.out.println("What is your tax rate?");
        double taxRateInput=userInput.nextDouble();
        System.out.println("How much money did you make this year?");
        double moneyInput=userInput.nextDouble();
        taxTime(taxRateInput,moneyInput);
    }
    
    public static void taxTime(double taxRate, double money)
    {
        double taxesOwed=taxRate*money;
        System.out.println("The amount of money you owe the IRS is "+taxesOwed);
    }
}
