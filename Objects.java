/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectProject;

/**
 *
 * @author Brooks
 */
public class Objects 
{
    private int TVvolume=1;
    private int TVchannel=1;
    public String brand;
    public String model;
    private boolean TVisON=false;
    
    public void turnTVON()
    {
        TVisON=true;
    }
    
    public void turnTVOFF()
    {
        TVisON=false;
    }
    
    public String returnBrand()
    {
    return brand;      
    }
    
    public String returnModel()
    {
        return model;
    }
    
    public int onOrOff()
    {
        if(TVisON==false)
            System.out.println("The TV is currently off.");
        else if(TVisON==true)
            System.out.println("The TV is currently on.");
        return 0;
    }
    
    public int returnChannel()
    {
        return TVchannel;
    }
    
    public int returnVolume()
    {
        return TVvolume;
    }
    
    public void switchChannel(int change)
    {
        if(change<=5)
        {
        switch(change)
        {
            case 1:
                System.out.println("You've selected channel 1, home for all your automotive news.");
                System.out.println("You sit and watch for a while but fall asleep eventually. The TV senses this and turns off by itself.");
                TVisON=false;
                TVchannel=1;
                break;
            case 2:
                System.out.println("You've selected channel 2, home of the San Diego Padres");
                System.out.println("You watch the baseball game.");
                TVchannel=2;
                break;
            case 3:
                System.out.println("Channel 3 shows nothing but static, slightly annoyed you change to channel 4.");
                TVchannel=4;
                break;
            case 4:
                System.out.println("Channel 4 shows various nature documentaries, you sit and watch.");
                TVchannel=4;
                break;
            case 5:
                System.out.println("Channel 5 shows the latest Star Wars movie, you watch it and write a slightly negative review on IMDB. ");
                System.out.println("After writing your review, you decide to watch the rest of the Padres game.");
                TVchannel=2;
                break;                
        }
        }
        else
            System.out.println("There is no channel that corresponds with that number.");
    }
    
    public int volumeSelect(int volume)
    {
        if(volume>0 && volume<10)
            System.out.println("The TV is very quiet, barely loud enough for you to hear from your couch");
        else if(volume>10 && volume<30)
            System.out.println("The volume is at a slightly louder but still almost inaudable volume, you are slightly frustrated");
        else if(volume>30 && volume<55)
            System.out.println("The volume is perfect, you have finally achieved bliss in this world and rejoice.");
        else if(volume>55 && volume<90)
            System.out.println("The volume is a little too loud and starts to make you mildly uncomfortable.");
        else
        {
            System.out.println("The volume is entirely too loud, frustrated at the noise, you shut the TV off");
            TVisON=false;
        }
        TVvolume=volume;
        return volume;
    }
}
