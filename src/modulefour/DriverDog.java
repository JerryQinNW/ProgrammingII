/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefour;

/**
 *
 * @author zqin
 */
public class DriverDog {
    public static void main(String[] args){
        // local variables
        Dog dog1 = new Dog( "Zelda","Standard Poodle");
        // logic for main
         dog1.setAge(100);
         dog1.incrementAge();
        System.out.println(dog1.getAge());
    }
}
