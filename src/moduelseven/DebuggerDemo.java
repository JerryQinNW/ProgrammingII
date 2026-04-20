/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduelseven;

/**
 *
 * @author zqin
 */
public class DebuggerDemo {

    public static void main(String[] args) {
        System.out.println("Starting Debug Demo...");
        
        int sum=0;
        for (int i=1; i<=100; i++){
            sum=sum+i;
        }

        int[] numbers = {10, 5, 0, 2};

        int result = processNumbers(numbers);
        System.out.println("Final Result: " + result);

        int factorialInput = 5;
        int factorialResult = factorial(factorialInput);
        System.out.println("Factorial of " + factorialInput + " is: " + factorialResult);
    }

    public static int processNumbers(int[] nums) {
        int sum = 0;

        for (int i = 0; i <= nums.length; i++) { // Intentional bug: should be < nums.length
            try {
                int value = nums[i];
                int computed = compute(value);
                sum += computed;

                System.out.println("Processed index " + i + ": " + computed);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds at i = " + i);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero at index " + i);
            }
        }

        return sum;
    }

    public static int compute(int x) {
        return 100 / x; // Potential divide-by-zero
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }
}
