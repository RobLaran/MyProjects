package Encapsulation.Student;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Double> grades = new ArrayList<Double>();

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getGrades(){
        return grades;
    }

    public void setID(int newID){
        this.id = newID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addGrade(Double grade){
        grades.add(grade);    
    }

}
