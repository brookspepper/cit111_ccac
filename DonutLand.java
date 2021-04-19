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
public class DonutLand 
{
    public static void main(String[] args)
    {
        final int firstBiteSize=12;
        Donut firstDonut;
        firstDonut=new Donut();
        firstDonut.name="Chloe";
        System.out.println("When first created, "+firstDonut.name+"'s percent remaining is "+firstDonut.getPercRemaining());
        System.out.println("Calling simulateEating and passing in a bite size of "+firstBiteSize);
        printDivider();
        firstDonut.simulateEating(firstBiteSize);
        System.out.println("After being eaten, "+firstDonut.name+"'s percent remaining is "+firstDonut.getPercRemaining());
    }
    public static void printDivider()
    {
        System.out.println("......................");
    }
}
