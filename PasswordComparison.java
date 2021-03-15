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
public class PasswordComparison {
    public static void main (String[] args)
    {
        int correctPasscode=5934;
        int attemptedPasscode=1234;
        if (attemptedPasscode==correctPasscode)
        {
        System.out.println("Codes Match! You're In!");         
        }
        else
        {
        System.out.println("Codes don't match, no soup for you!");
        }
        
    }
    
}
