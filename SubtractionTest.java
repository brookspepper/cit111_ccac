/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class SubtractionTest 
{
    public static void main (String[] args)
    {
        final int NUMBER_OF_QUESTIONS=5;
        int correctCount=0;
        int incorrectCount=0;
        int count=0;
        Scanner userInput=new Scanner(System.in);
        int temp;
        while(NUMBER_OF_QUESTIONS>count)
        {
            int numberOne=(int)(Math.random()*10);
            int numberTwo=(int)(Math.random()*10);
            if(numberOne<numberTwo)
            {
                temp=numberOne;
                numberOne=numberTwo;
                numberTwo=temp;
            }
            System.out.println("What is "+numberOne+" - "+numberTwo+" ?");
            int answer=userInput.nextInt();
            if(answer==(numberOne-numberTwo))
            {
                System.out.println("That is correct!");
                correctCount++;
            }
            else
            {
                System.out.println("That is incorrect!");
                incorrectCount++;                        
            }
            count++;
        }
        double finalScore=(correctCount/NUMBER_OF_QUESTIONS)*100;
        System.out.println("You got a "+finalScore+" %!");
        System.out.println("You missed "+incorrectCount+" questions!");
    }
}
