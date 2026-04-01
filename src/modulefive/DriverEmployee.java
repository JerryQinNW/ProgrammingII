/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;

/**
 *
 * @author ZQIN
 */
public class DriverEmployee {
    public static void main(String[] args) {
        
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        

        // Create Hourly Employee
        Employee emp1 = new HourlyEmployee(
                "John", "Doe", "123-45-6789", 40, 20.5);

        // Create Salaried Employee
        Employee emp2 = new SalariedEmployee(
                "Jane", "Smith", "987-65-4321", 80000, 5000);
        
        // Creat a general employee
        
       Employee emp3=new Employee("James", "Jordan", "111-67-0978");

        // Display info
        System.out.println("=== Hourly Employee ===");
        System.out.println(emp1);
        System.out.println(emp1.calculateSalary());

        System.out.println("\n=== Salaried Employee ===");
        System.out.println(emp2);
        System.out.println(emp2.calculateSalary());
        
        System.out.println("\n=== General Employee ===");
        System.out.println(emp3);    
        System.out.println(emp3.calculateSalary());


        
        Object object1 = new Object();
        
        Employee bob = new Employee( "Bob", "Jones", 
                "499-99-9999");     
        HourlyEmployee sue = new HourlyEmployee( "Sue", 
                "Smith", "488-88-8888", 10, 41);

        //called implicit casting
        Object object2 = new Employee("Jill", "John", "555-555-5555");
        //Employee emp = new Object();
        
        System.out.println( object1 instanceof Object);
        System.out.println (object1 instanceof Employee);
        System.out.println (object1 instanceof HourlyEmployee);
        System.out.println();
        System.out.println( bob instanceof Object);
        System.out.println( bob instanceof Employee);
        System.out.println( bob instanceof HourlyEmployee);
        System.out.println();
        System.out.println( sue instanceof Object);
        System.out.println( sue instanceof Employee);
        System.out.println( sue instanceof HourlyEmployee);
        System.out.println();
        System.out.println( object2 instanceof Object);
        System.out.println( object2 instanceof Employee);
        System.out.println( object2 instanceof HourlyEmployee);


    }
}
