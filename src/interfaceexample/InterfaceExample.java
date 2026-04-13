package interfaceexample;

import java.util.*;

/**
 *
 * @author dianar
 */
public class InterfaceExample {

    public static void main(String[] args) {
        ArrayList<Person> myPeople = new ArrayList<>();
        myPeople.add(new FullTimeEmployee("Joe", "Bill", 40000));
        myPeople.add(new Professor("Bill", "Jane", 23000, "tenure"));
        myPeople.add(new Graduate("A", "B", 3.5, true));
        myPeople.add(new TeachingAssistant(3000));

        //Enhanced for loop to print out each object's name
        for (Person p : myPeople) {
            System.out.println(p.getFullName());
        }

    }

}
