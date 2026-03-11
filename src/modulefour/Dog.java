/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefour;

/**
 *
 * @author zqin
 */
public class Dog {
      // instance variables
      private String name;
      private String breed;
      private int age;
      
      // constructor
      public Dog( String nameIn, String breedIn,int ageIn )
      {
          name = nameIn;
          breed = breedIn;
          age = ageIn;
      }
      
          public Dog( String nameIn, String breedIn)
      {
          name = nameIn;
          breed = breedIn;
      }
      
      // other methods
      public int getAge()
      {
        return age;
      }
      
      public void setAge( int ageIn )
      {
        age = ageIn;
      }
      
      public void incrementAge()
      {
        age++;
      }

} // end class Dog

