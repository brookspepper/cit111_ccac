/*
 * Final object project for java. This is a little mini game/tv creator that allows users to make and name their own television
 * It is a little game that has many options that allow users to experience what it's like to watch tv at night.
 * It is meant to be a little humorous
 */
package ObjectProject;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Brooks
 */
public class ObjectLand 
{
    
   public static void main(String[] args)
   {
      boolean continueLoop=true;
      while(continueLoop==true)
    { 
      System.out.println("Would you like to create a new Televison? \n 1. Yes \n 2. No");
      Scanner userInput=new Scanner(System.in);       
      int selection=userInput.nextInt();
      switch(selection)
       {
          case 1: 
              simulation();
              break;
          case 2:
              System.out.println("You've got no choice, generating random TV...");
              randomTV();
              break;
          default:
              System.out.println("Non-viable answer.");
      }    
      System.out.println("Would you like to go again?");
      String userStuff=userInput.next();
      if(userStuff.equals("yes"))
          continueLoop=true;
      else
          continueLoop=false;
   }
      
   }
   public static void simulation()
   {
        Scanner userInput=new Scanner(System.in); 
        System.out.println("What brand would you like the TV to be?");
        String tvName=userInput.next();
        Objects TV=new Objects();
        TV.brand=tvName;
        System.out.println("What model of tv is it?");
        String tvModel=userInput.next();
        TV.model=tvModel;
        System.out.println("Turning tv on....");
        TV.turnTVON();
        System.out.println("Current Volume: "+TV.returnVolume());
        System.out.println("Current Channel: "+TV.returnChannel());
        System.out.println("What channel would you like to put on? There are 5 channels, 1-5.");
        int userChannel=userInput.nextInt();
        TV.switchChannel(userChannel);
        System.out.println("What would you like the volume to be, 1-100");
        int userVolume=userInput.nextInt();
        TV.volumeSelect(userVolume);
        System.out.println("You grow bored of the current channel. Select another channel to switch to.");
        int newChannel=userInput.nextInt();
        TV.switchChannel(newChannel);
        System.out.println("As the night grows darker, you decide to head to bed, leaving the TV by itself.");
        System.out.println("Would you like to see your tv statistics? \n 1. Yes \n 2.No");
        int selection=userInput.nextInt();
        switch(selection)
        {
            case 1:
                tvStats(TV);
                break;
            case 2:
                System.out.println("Okay.");
                break;
            default: 
                System.out.println("Invalid selection.");
                break;
        }
        System.out.println("Thank you for using this program!");
   }
  
   public static void randomTV()
   {
      int max=5;
      int min=1;   
      int maxTwo=100;
      int minTwo=1;
      int random=(int)Math.floor(Math.random()*(max-min+1)+min);
      int randomTwo=(int)Math.floor(Math.random()*(maxTwo-minTwo+1)+minTwo);
      Objects TVrandom=new Objects();
      TVrandom.brand="Default brand...";
      TVrandom.model="Default model...";
      TVrandom.turnTVON();
      System.out.println("Turning TV on...");
      System.out.println("Generating random channel...");
      TVrandom.switchChannel(random);
      System.out.println("Turning to random volume...");
      TVrandom.volumeSelect(randomTwo);
      System.out.println("Random TV complete... Printing stats...");
      tvStats(TVrandom);
      System.out.println("Simulation complete... Thank you for enjoying this simulation.");
   }
   
   public static void tvStats(Objects anyTV)
   {
       System.out.println("*****TV STATISTICS*****");
       System.out.println("TV Brand: "+anyTV.returnBrand());
       System.out.println("TV Model: "+anyTV.returnModel());
       System.out.println("Current Channel: "+anyTV.returnChannel());
       System.out.println("Current Volume: "+anyTV.returnVolume());
       System.out.println(anyTV.onOrOff());
   }
}
