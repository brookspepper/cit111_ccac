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
public class Salad 
{
    private int percRemaining=100;
    public boolean hasMeat;
    public boolean containsNuts;
    public String lettuceType;
    
    public void eatSalad(int saladEaten)
    {
        percRemaining=percRemaining-saladEaten;
        System.out.println("Eating...");
    }
    
    public int getPercRemaining()
    {
        System.out.println(percRemaining);
        return percRemaining;
    }
    
    public boolean addMeat()
    {
        hasMeat=true;
        return hasMeat;
    }
    
    public boolean addNuts()
    {
        containsNuts=true;
        return containsNuts;
    }
}
