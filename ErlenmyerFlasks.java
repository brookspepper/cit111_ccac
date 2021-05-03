/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunWithArrays;
import java.util.Scanner;
/**
 *
 * @author Brooks
 */
public class ErlenmyerFlasks 
{
    public static void main(String[] args)
    {
     int[] flasks=new int[4];
     flasks[0]=250;
     flasks[1]=100;
     flasks[2]=190;
     flasks[3]=150;
     
     printThisArray(flasks);
     System.out.println("");
     System.out.println("The average value of this array is "+averageValue(flasks));
     System.out.println("");
     System.out.println("The total value of this array is "+ summationMethod(flasks));
     System.out.println("");     
    }
    
    public static void facilitateUserInteraction(int[] userArray)
    {
        Scanner userInput=new Scanner(System.in);
        int[] newArray=new int[5];
                
    }
    
    public static int summationMethod(int[] thisArray)
    {
        int total=0;
        for(int i=0; i<3; i++)
        {
            total=total+thisArray[i];
        }
        return total;
    }
    
    public static double averageValue(int[] thisArray)
    {
        int averageValue=0;
        for(int i=0; i<3; i++)
        {
            averageValue=averageValue+thisArray[i];
        }
        averageValue=averageValue/thisArray.length;
        return averageValue;
    }
    
    public static void printThisArray(int [] thisArray)
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("The value of Array element "+i+" is: "+thisArray[i]);
        }
    }
}
