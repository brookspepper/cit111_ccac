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
public class SomethingOrOther 
        
{
    public static void main (String[] args)
            
    {
        Scanner userInput=new Scanner(System.in);
        multiplication(100,2);
        multiplication(200,42);
        division(100,2);
        division(1000,10);
        
    }
    public static void multiplication(int a, int b)
    {
        System.out.println("The product of these two nubmers is "+a*b);
    }
    public static void division(int c, int d)
    {
        System.out.println("The quotient of these two number is "+c/d);
    }
            
}
