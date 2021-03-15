/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Brooks Pepper
 */
public class Song {
    public static void main (String[] args)
    {
        //declaring and initialization of all variables used in printouts and conversions needed.
    String favoriteSong= "Lemonade";
    String artists= "Internet Money, Gunna, Don Toliver, and NAV";
    double conversion= 15.0/60.0;
    double runTime= 3.0 + conversion;
    int releaseDate= 2020;
    boolean instrumental= false;
    
    
    System.out.println("My favorite song is " + favoriteSong);
    System.out.println("The artists are " + artists); 
    System.out.println("It is " + runTime + " minutes long");
    System.out.println("It was released in " + releaseDate);
    System.out.println("This song is only an instrumental");
    System.out.println(instrumental);
            
    }
}
