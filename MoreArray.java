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
public class MoreArray 
{
    public static void main(String[] args)
    {
    String[] perks=new String[7];
    perks[0]="Deadshot Daiquiri";
    perks[1]="Tombstone Soda";
    perks[2]="Elemental Pop";
    perks[3]="Juggernog";
    perks[4]="Quick Revive";
    perks[5]="Speed Cola";
    perks[6]="Stamin-Up";
    
    for(int i=0; i<7; i++)
    {
       String accessedPerk=perks[i];
       System.out.println("Current perk:"+accessedPerk);               
    }
    
    }
}
