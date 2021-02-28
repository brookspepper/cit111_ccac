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
public class chpt3 
{
    public static void main (String[] args)
    {
        int year;
        int month;
        int date;
        Scanner userInput=new Scanner(System.in);
        System.out.println("What year is it? ");
        year=userInput.nextInt();
        System.out.println("What month is it? 1-12");
        month=userInput.nextInt();
        if(month==1)
        {
            month=13;
            year--;
        }
        else if(month==2)
        {
            month=14;
            year--;
        }
        System.out.println("What is today's date?");
        date=userInput.nextInt();
        int century=year/100;
        int yearCentury=year%100;
        int answer= date + 13 * (month + 1) / 5 + yearCentury + yearCentury / 4 + century / 4 + 5 * century;
        answer=answer%7;
        if(answer==0)
        {
            System.out.println("Today is Saturday.");
        }
        else if(answer==1)
        {
            System.out.println("Today is Sunday.");
        }
        else if(answer==2)
        {
            System.out.println("Today is Monday.");
        }
        else if(answer==3)
        {
            System.out.println("Today is Tuesday.");
        }
        else if(answer==4)
        {
            System.out.println("Today is Wednesday.");
        }
        else if(answer==5)
        {
            System.out.println("Today is Thursday.");
        }
        else if(answer==6)
        {
            System.out.println("Today is Friday.");
        }
    }
    
}
