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
public class TestTV 
{
    public static void main(String[] args)
    {
        TV tv1=new TV();
        tv1.name="Terrence";        
        tv1.turnOn();
        tv1.setVolume(12);
        tv1.setChannel(120);
        System.out.println("TV "+tv1.getName()+"'s volume is "+tv1.returnVolume()+" and the channel is "+tv1.returnChannel()+".");
    }
}
