/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Brooks
 */
public class Burger 
{
    private int percRemaining=100;
    public boolean lettuce;
    public boolean cheese;
    
    public boolean addLettuce()
    {
        lettuce=true;
        return lettuce;
    }
    
    public boolean addCheese()
    {
        cheese=true;
        return cheese;
    }
    
    public void simulateEating(int biteSize)
    {
        percRemaining=percRemaining-biteSize;
        System.out.println("Eating...");
    }
    
    public int getPercRemaining()
    {
        System.out.println(percRemaining);
        return percRemaining;
    }
}
