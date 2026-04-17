/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduelseven;

/**
 *
 * @author zqin
 */
import java.io.*;
import java.util.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {


    // Method to demonstrate custom exception
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible!");
        }
    }

    public static void main(String[] args) {

        // 1. ArithmeticException (unchecked)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e+"\n");
        }

        // 2. NullPointerException (unchecked)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: "+e+"\n");
        }

        // 3. ArrayIndexOutOfBoundsException (unchecked)
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: "+e+"\n");
        }

        // 4. NumberFormatException (unchecked)
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: "+e+"\n");
        }


        // 5. Custom Exception
        try {
            checkAge(16);
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e+"\n");
        }

    
        // 6. Multiple catch blocks
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic issue: "+e+"\n");
        } catch (NullPointerException e) {
            System.out.println("Handled in multiple catch: "+e+"\n");
        }

        // 7. InputMismatchException
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter an integer: ");
            try {
                number = scanner.nextInt(); // May throw InputMismatchException
                isValid = true; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Error: That is not a valid integer. Please try again.");
                scanner.next(); // IMPORTANT: Clear the invalid input buffer
            }
        }
        
        System.out.println("Program continues...");
    }
}
