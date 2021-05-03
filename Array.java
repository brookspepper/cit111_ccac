/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunWithArrays;

/**
 *
 * @author Brooks
 */
public class Array 
{
    public static void main(String[] args)
    {
        String[] books=new String[5];
        books[0]="Perl Cookbook";
        books[1]="PHP Cookbook";
        books[2]="Python in a nutshell";
        books[3]="Javascript: The definitive guide";
        books[4]="Java in a nutshell";
        printArrayMethod(books);
        betterPrintArrayMethod(books);
    }
    
    public static void printArrayMethod(String[] arrayInsideMethod)
    {
        System.out.println("**********EXTRACT ARRAY VALUE AND STORE IT**********");
        String extractedArrayMethod=arrayInsideMethod[0];
        System.out.println("Book at index value 0:"+extractedArrayMethod);
        extractedArrayMethod=arrayInsideMethod[1];
        System.out.println("Book at index value 1:"+extractedArrayMethod);
        extractedArrayMethod=arrayInsideMethod[2];
        System.out.println("Book at index value 2:"+extractedArrayMethod);
        extractedArrayMethod=arrayInsideMethod[3];
        System.out.println("Book at index value 3:"+extractedArrayMethod);
        extractedArrayMethod=arrayInsideMethod[4];
        System.out.println("Book at index value 4:"+extractedArrayMethod);        
    }
    
    public static void betterPrintArrayMethod(String[] arrayInsideMethod)
    {
        System.out.println("Book at index value of 0:"+arrayInsideMethod[0]);
        System.out.println("Book at index value of 1:"+arrayInsideMethod[1]);
        System.out.println("Book at index value of 2:"+arrayInsideMethod[2]);
        System.out.println("Book at index value of 3:"+arrayInsideMethod[3]);
        System.out.println("Book at index value of 4:"+arrayInsideMethod[4]);                
    }
}
