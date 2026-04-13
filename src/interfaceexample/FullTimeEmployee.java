package interfaceexample;

/**
 *
 * @author merry
 */
public class FullTimeEmployee implements Employee, Person {

    private String firstName;
    private String lastName;
    private double annualSalary;

    public FullTimeEmployee() {
        this("", "", 0.0);
    }

    public FullTimeEmployee(String firstName, String lastName,
            double annualSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    @Override
    public double estimateMonthlySalary() {
        return annualSalary / 12;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

}
