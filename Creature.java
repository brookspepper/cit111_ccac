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
public class Creature 
{
    public String name;
    public String species;
    private int biteSizeInPercent;
    private int minDonutSize;
            
    public void eatDonut(SizedDonut donutToEat)
    {
        donutToEat.simulateEating(biteSizeInPercent);
        System.out.println("Creature.eatDonut| Eating "+biteSizeInPercent+" % of "+donutToEat.name);
    }
    
    public int getBiteSizeInPercent()
    {
        return biteSizeInPercent;
    }
    
    public void setBiteSizeInPercent(int biteSizeInPercent)
    {
        this.biteSizeInPercent=biteSizeInPercent;
    }
    
    public void setMinDonutSizeInMM(int donutMinimumInMM)
    {
        if(donutMinimumInMM>0)
            minDonutSize=donutMinimumInMM;
        else
            System.out.println("Donut minimum is too small.");
        System.out.println(minDonutSize);
    }
    
    public void getMinDonutSize()
    {
        System.out.println(minDonutSize);
    }
}
