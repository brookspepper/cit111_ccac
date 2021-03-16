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
public class MethodPrac 
{
    
public static int sum(int i1, int i2)
{
    int result=0;
    for(int i=i1; i<=i2; i++)
    {
        result+=i;     
    }
    return result;
    
}
        public static void main(String[] args)
        {
            System.out.println(sum(1,10));
        }
}
