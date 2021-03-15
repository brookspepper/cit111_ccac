/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 14124
 */
//It is impossible to distinguish l and 1 so I will use the word One 
public class OperatorsChallenge {
    public static void main (String[] args)
    {
      int a= 100;
      int b= 2000;
      double d= 10.5;
      String lineOne= "Go ask Alice. ";
      
      String lineTwo= "I think she'll know. ";
      int r= b/a;
      System.out.println("The Vairable R is: " + r);
      int mod= b % a;
      System.out.println("B % A is: " +mod);
      
      double rd= mod*d;
      System.out.println(rd);
      a=a+5;
      System.out.println("I am about to compute the value of " + b + " mod " + a);
      rd= b%a;
      System.out.println("The operator divides and gives the remainder: " + rd);
      
      System.out.println(lineTwo + lineOne);
      System.out.println(lineOne + lineTwo);
    }
    
}
