/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekEightMethodsTwo;
import java.util.Scanner;
/**
 *
 * @author 14124
 */
public class GeometricShapes 
{
    public static void main(String[] args)
    {
        System.out.println("What is the sidelength of the cube?");
        Scanner userInput=new Scanner(System.in);
        double test=userInput.nextDouble();
        double returnedVolume=calcVolumeOfCube(test);
        System.out.println("The volume of the cube is: "+returnedVolume);
        System.out.println("What is the radius of the cylinder?");
        double userRadius=userInput.nextDouble();
        System.out.println("What is the height of the cylinder?");
        double userHeight=userInput.nextDouble();
        double returnedCylinder=calcVolumeOfCylinder(userRadius,userHeight);
        System.out.println("The volume of the cylinder is: "+returnedCylinder);
        System.out.println("What is the radius of the circle?");
        double userCircleRadius=userInput.nextDouble();
        double returnVolumeCircle=calcVolumeOfCircle(userCircleRadius);
        System.out.println("The area of the circle is "+returnVolumeCircle);
    }
    public static double calcVolumeOfCube(double sideLength)
    {
        double cubeVolume=Math.pow(sideLength, 3);
        return cubeVolume;
    }
    public static double calcVolumeOfCylinder(double radius, double height)
    {
        final double pi=3.1416;
        double volume=pi*(radius*radius)*height;
        return volume;
    }
    public static double calcVolumeOfCircle(double radius)
    {
        final double pi=3.1416;
        double areaOfCircle=pi*(radius*radius);
        return areaOfCircle;
    }
}
