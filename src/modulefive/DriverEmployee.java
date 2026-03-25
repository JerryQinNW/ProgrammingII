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

        // Create Hourly Employee
        HourlyEmployee hourlyEmp = new HourlyEmployee(
                "John", "Doe", "123-45-6789", 40, 20.5);

        // Create Salaried Employee
        SalariedEmployee salariedEmp = new SalariedEmployee(
                "Jane", "Smith", "987-65-4321", 80000, 5000);

        // Display info
        System.out.println("=== Hourly Employee ===");
        System.out.println(hourlyEmp);

        System.out.println("\n=== Salaried Employee ===");
        System.out.println(salariedEmp);

        // Modify values
        hourlyEmp.setWorkedHours(45);
        salariedEmp.setStock(7000);

        System.out.println("\n=== After Updates ===");
        System.out.println(hourlyEmp);
        System.out.println(salariedEmp);
        
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
