/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects_2;

/**
 *
 * @author Brooks
 */
public class Creature_Land 
{
    
    public static void main(String[] args)
    {
        System.out.println("Creatureland main| Creating creature...");
        Creature penguin;
        penguin=new Creature();
        penguin.name="Pablito";
        penguin.species="Emporer Penguin";
        penguin.setBiteSizeInPercent(5);
        penguin.setMinDonutSizeInMM(20);
        
        System.out.println("Creatureland main| Creating sizedDonut...");
        SizedDonut donutForPenguin=new SizedDonut();
        donutForPenguin.name="Chloe";
        donutForPenguin.sizeInmm=32;
        System.out.println("Creatureland main| Calling eatDonut...");
        penguin.eatDonut(donutForPenguin);
        System.out.println("Creatureland.main| Back after eating...");
        
    }
    public void displayCreatureStats(Creature creatureToPrint)
    {
        System.out.println("***CREATURE STATS***");
        System.out.println("Name: "+creatureToPrint.name);   
        System.out.println("Species: "+creatureToPrint.species);
        System.out.println("Bite size: "+creatureToPrint.getBiteSizeInPercent()+"% of a donut.");
        System.out.println("*********************");        
    }
}
