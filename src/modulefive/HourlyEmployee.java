/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;

/**
 *
 * @author ZQIN
 */
public class HourlyEmployee extends Employee {
    private double workedHours;
    private double hourlyRate;

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String ssn,
                          double workedHours, double hourlyRate) {
        super(firstName, lastName, ssn);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public double getWorkedHours() {
        return workedHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setters
    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Other method
    public double calculateWeeklySalary(){
	double overtime = 0.0f;
	if (workedHours >40)
	{
		overtime = (workedHours - 40) * (0.5 * hourlyRate);
	}
	return overtime + workedHours * hourlyRate;
}


 /*   public String toString() {
        return super.toString() +
               ", Hours Worked: " + workedHours +
               ", Hourly Rate: $" + hourlyRate +
               ", Pay: $" + calculateWeeklySalary();
    }
    */
}
