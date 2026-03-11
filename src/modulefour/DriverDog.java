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
        Dog dog1 = new Dog( "Zelda","Standard Poodle", 7 );
        // logic for main
        dog1.setAge( 4 );
        System.out.println(dog1.getAge());
    }
}
