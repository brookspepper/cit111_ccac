/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChapt8;

/**
 *
 * @author 14124
 */
public class TV 
{
    public int tvVolume=1;
    public int tvChannel=1;
    public boolean tvOn=false;
    public String name;
    
    public void turnOn()
    {
        tvOn=true;
    }
    
    public void turnOff()
    {
        tvOn=false;
    }
    
    public void setChannel(int Channel)
    {
        if(tvOn==true && Channel<=120)
        {
            tvChannel=Channel;
        }
    }
    
    public void setVolume(int volume)
    {
        if(tvOn==true && tvVolume>=1)
        {
            tvVolume=volume;
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public int returnVolume()
    {
        return tvVolume;
    }
    
    public int returnChannel()
    {
        return tvChannel;
    }
}
