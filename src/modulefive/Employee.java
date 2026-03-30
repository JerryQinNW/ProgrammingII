/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;

/**
 *
 * @author ZQIN
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    // Constructor
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return ssn;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    // Other method
    public String getFullName() {
        return firstName + " " + lastName;
    }

  /*  public String toString() {
        return "Employee: " + getFullName() + ", SSN: " + ssn;
    } */
    
}
