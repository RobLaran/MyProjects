package OOP.Student;

import java.util.ArrayList;

public class Student {

    private String name;
    private int grade;
    private ArrayList<String> subjects = new ArrayList<String>();
    private ArrayList<String> removedSubjects = new ArrayList<String>();


    public Student(String name, int gradeLevel){
        this.name = name;
        this.grade = gradeLevel;
    }

    public String getName(){
        return name;
    }

    public int getGradeLevel(){
        return grade;
    }

    public ArrayList<String> getSubs(){
        return subjects;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(int gradeLevel){
        this.grade = gradeLevel;
    }

    public void addCourse(String subject){
        subjects.add(subject);
    }

    public void removeCourse(String subject){
        removedSubjects.add(subject);
        subjects.remove(subject);
    }

    public ArrayList<String> getRemovedSub(){
        return removedSubjects;
    }

    public void getStudentDetail(){
        System.out.println("Name: " + name);
        System.out.println("Grade Level: " + grade);
    }

    public void getStudentSubs(){
        System.out.println(name + "'s courses: " + subjects);
    }
}
