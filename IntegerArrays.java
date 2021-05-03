/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunWithArrays;

/**
 *
 * @author 14124
 */
public class IntegerArrays 
{
    public static void main(String[] args)
    {
        int[] instruments=new int[5];
        instruments[1]=15;
        instruments[0]=21;
        instruments[2]=5;
        instruments[3]=19;
        instruments[4]=12;
        
        printNumericArrayManually(instruments);
        
        int sum=runningTotal(instruments);
        System.out.println("");
        System.out.println("Total number of instruments in array: "+sum); 
        
        double average=averageValue(instruments);
        System.out.println("");
        System.out.println("The average value of all array elements is "+average);
        
    }
    
    public static void printNumericArrayManually(int[] accessStuff)
    {
         for(int i=0; i<5; i++)
        {
          int accessedInstrument=accessStuff[i];
          System.out.println("Current instrument count at index number "+i+" is : "+accessedInstrument);
        }
    }
    
    public static int runningTotal(int[] intArray)
    {
        int total=0;
        for(int i=0; i<intArray.length; i++)
        {
            total=total+intArray[i];
        }
        return total;
    }
    
    public static double averageValue(int[] intArray)
    {
        int totalInstruments=0;
        for(int i=0; i<5; i++)
        {
            totalInstruments=totalInstruments+intArray[i];
        }
        double averageValue=totalInstruments/intArray.length;
        return averageValue;
    }
    
}
