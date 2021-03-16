/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 14124
 */
public class TestVoidMethod 
{
    public static void main (String[] args)
    {
        System.out.print("The grade is ");
         printGrade(44.0);
        System.out.print("The grade is ");
        char grade = getGrade(90.2);
        System.out.print(grade);
    }
    public static void printGrade(double score)
    {
            if(score>=90)
                System.out.println("A");
            else if(score>=80)
                System.out.println("B");
            else if(score>=70)
                System.out.println("C");
            else if(score>=60)
                System.out.println("D");
            else
                System.out.println("F");
    }
    public static char getGrade(double scores)
    {
        if(scores>=90)
            return 'A';
        else if(scores>=80)
            return 'B';
        else if(scores>=70)
            return 'C';
        else if(scores>=60)
            return 'D';
        else
            return 'F';
    }
}
