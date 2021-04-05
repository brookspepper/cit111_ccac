/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lc3_classstructure;
import java.util.Random;
/**
 *
 * @author Brooks Pepper
 */
public class KennywoodRideTracker 
{
    private static int totalRiders=0;
    private static int totalFailedRideAttempts=0;
    private static int totalSickRiders=0;
    
    final static int THEME_RIDE_HEIGHT=36;
    final static int THRILL_RIDE_HEIGHT=52;
    
    public static void main (String[] args)
    {
        rideBlackWidow(55,60);
        printRideStatus();
        rideMerryGoRound(22,30);
        printRideStatus();
    }
    public static void rideBlackWidow(int riders, int avgHeight)
    {
        if(avgHeight>=THRILL_RIDE_HEIGHT)
        {
        System.out.println("Riding black widow!");
        Random rand=new Random();
        int numSickRiders=rand.nextInt(riders);
        totalRiders=totalRiders+riders;
        totalSickRiders=totalSickRiders+numSickRiders;
        }
        else
        {
            System.out.println(riders+" Riders have been turned away for safety reasons!");
            totalFailedRideAttempts=totalFailedRideAttempts+riders;
        }
    }
    public static void rideMerryGoRound(int riders, int avgHeight)
    {
        if(avgHeight>=THEME_RIDE_HEIGHT)
        {
        System.out.println("Riding Merry Go Round!");
        totalRiders=totalRiders+riders;
        Random rand=new Random();
        int numSickRiders=rand.nextInt(riders);
        totalSickRiders=totalSickRiders+numSickRiders;
        }
        else
        {
            System.out.println(riders+" Riders have been turned away for safety reasons!");
            totalFailedRideAttempts=totalFailedRideAttempts+riders;
        }
    }
    public static void printRideStatus()
    {
        System.out.println("*****RIDER STATISTICS*****");
        System.out.println(totalRiders+" Total Riders on all rides.");
        System.out.println(totalSickRiders+" Riders have become ill. Yuck.");
        System.out.println(totalFailedRideAttempts+" Riders have tried to go on rides they were too short for.");
        System.out.println("*****END STATISTICS*****");                
    }
}
