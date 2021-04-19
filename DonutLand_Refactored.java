/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Brooks
 *
 */
public class DonutLand_Refactored 
{
    final static int NIBBLE=5;
    final static int MEGA_BITE=45;
    
    public static void main(String[] args)
    {
        Donut firstDonut;
        firstDonut=new Donut();
        firstDonut.name="Chloe";
        printObjectData(firstDonut);
        Donut secondDonut;
        secondDonut=new Donut();
        secondDonut.name="Crusoe";
        printObjectData(secondDonut);
        System.out.println("Eating "+firstDonut.name);
        System.out.println("Taking a nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Taking a nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Taking a mega bite...");
        firstDonut.simulateEating(MEGA_BITE);
        System.out.println("Eating "+secondDonut.name);
        for(int i=0; i<10; i++)
        {
            System.out.println("CHOMP...");
            secondDonut.simulateEating(MEGA_BITE);
        }
        printObjectData(secondDonut);
    }
    private static void printObjectData(Donut inputDonut)
    {
        System.out.println("***STATS***");
        System.out.println("Name: "+inputDonut.name);
        System.out.println("Percent Remaining "+inputDonut.getPercRemaining());
        System.out.println("****END STATS****");
    }
}
