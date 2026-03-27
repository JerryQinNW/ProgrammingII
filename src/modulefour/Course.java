/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefour;

/**
 *
 * @author ZQIN
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    public Course(String courseName) {
         this.courseName = courseName;
    }
    public void addStudent(String student) {
        this.students[this.numberOfStudents] = student;
        this.numberOfStudents++;
    }
    
    public String[] getStudents() {
        return this.students;
    }
    
    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }
        
    public String getCourseName() {
        return this.courseName;
    }
    
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Move students[i + 1] to students[i], etc.
                for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }
                numberOfStudents--;
                break;
            }
        }
    }
}

