/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;
import java.util.*;

/**
 *
 * @author ZQIN
 */
public class ALDriver {
    public static void main(String[] args) {

        //Create an ArrayList of computer objects
        ArrayList<Computer> comp = new ArrayList<Computer>();
        
        //Add two Computer objects to the list
        comp.add(new Computer("Win", 566, "HP"));
        comp.add(new Computer("iOS", 200, "Apple"));
        
        //Set the brand on the second computer object to Dell
        comp.get(1).setBrand("Dell");
        
        //Print only the size of the first computer object
        System.out.println(comp.get(0).getSize());
        
        //Add a computer object with default values into the arraylist at index 1
       // comp.add(3, new Computer());
        
        //Print the arrayList out so that all information for each computer is shown

        for (Computer c: comp)
            System.out.println(c);  
        
        System.out.println(comp.size());
        
        Computer comp1=new Computer("win11",512,"HP");
        Computer comp2=new Computer("win12",1024,"HP");
        System.out.println(comp1.equals(comp2));
        Computer comp3=new Computer();
        System.out.println(comp3);
        
    }
    
}
