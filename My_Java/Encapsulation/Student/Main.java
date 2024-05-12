package Encapsulation.Student;

// Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.

// Student ID: 1
// Student Name: Nadia Hyakinthos
// Grades: [92.5, 89.0, 90.3]

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setID(1);
        student.setName("Nadia Hyakinthos");
        student.addGrade(92.5);
        student.addGrade(89.0);
        student.addGrade(90.3);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grades: " + student.getGrades());
        
    }
}
