/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;

/**
 *
 * @author ZQIN
 */
public class SalariedEmployee extends Employee {
    private double salary;
    private double stock;

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String ssn,
                            double salary, double stock) {
        super(firstName, lastName, ssn);
        this.salary = salary;
        this.stock = stock;
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    public double getStock() {
        return stock;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    // Other method
    public double calculateSalary() {
        return salary + stock;
    }

    public String toString() {
        return super.toString() +
               ", Salary: $" + salary +
               ", Stock: $" + stock +
               ", Total Compensation: $" + calculateSalary();
    }
}