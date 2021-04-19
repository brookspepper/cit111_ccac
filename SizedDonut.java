/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects_2;

/**
 *
 * @author 14124
 */
public class SizedDonut
{
    public String name;
    public int sizeInmm;
    
    private int percRemaining=100;
    
    public void simulateEating(int percentEaten)
    {
        percRemaining=percRemaining-percentEaten;
        System.out.println("SizedDonut.simulateEating| Percent remaining "+ percRemaining);
    }
    
    public int getPercRemaining()
    {
        return percRemaining;
    }
}
